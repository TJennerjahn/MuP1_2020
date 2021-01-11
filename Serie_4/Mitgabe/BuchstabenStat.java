import java.io.*;
import java.util.*;
import static java.util.stream.Collectors.*;
import static java.util.Map.Entry.*;
public class BuchstabenStat {
	private Map<Character, Integer> buchstabenHaeufigkeiten;
	private long buchstabenAnzahl;

	public BuchstabenStat(){
		this.buchstabenHaeufigkeiten = new HashMap<Character, Integer>();
		this.buchstabenAnzahl = 0;
	}

	private void pruefeDateityp(String dateiname) throws FalscherDateitypException {
		int length = dateiname.length();
		if(length < 4 || !dateiname.substring(length - 4).equals(".txt")) {
			throw new FalscherDateitypException(dateiname);
		}
	}

	private void verarbeiteZeichen(char zeichen) throws UngueltigesZeichenException {
		zeichen = Character.toUpperCase(zeichen); 
		if(Character.isLetter(zeichen)) {
			this.buchstabenAnzahl += 1;
			buchstabenHaeufigkeiten.compute(zeichen, (k,v) -> v == null ? 1 : v + 1);
		}
		else if(!Character.isDefined(zeichen)){
			throw new UngueltigesZeichenException();
		}
	}

	private void verarbeiteZeile(String zeile)throws UngueltigesZeichenException {
		for(int i = 0; i < zeile.length(); i++) {
			verarbeiteZeichen(zeile.charAt(i));
		}
	}

	public void analysiere(String dateiname) throws FalscherDateitypException, UngueltigesZeichenException {
		pruefeDateityp(dateiname);
		BufferedReader reader;
		int lineCount = 0;
		try {
			reader = new BufferedReader(new FileReader(dateiname));
			String line = reader.readLine();
			while(line != null) {
				lineCount++;
				verarbeiteZeile(line);
				line = reader.readLine();
			}
			reader.close();
		} catch(FileNotFoundException e) {
			System.err.println("Datei " + dateiname + " konnte nicht gefunden werden");
			System.exit(1);
		} catch(IOException e) {
			System.err.println("Fehler beim lesen der Datei: " + dateiname);
			System.exit(1);
		} catch(UngueltigesZeichenException e) {
			throw new UngueltigesZeichenException(dateiname, lineCount);
		}
	}

	public void zeigeTop10() {
		System.out.println("Buchstaben-Top 10:");	
		Map<Character, Integer> sorted = buchstabenHaeufigkeiten.entrySet()
			.stream()
			.sorted(comparingByValue(Comparator.reverseOrder()))
			.limit(10)
			.collect(toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2, LinkedHashMap::new));

		for(Map.Entry<Character, Integer> entry: sorted.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}

	public String statistik() {
		StringBuilder str = new StringBuilder();
		for(Map.Entry<Character, Integer> entry : buchstabenHaeufigkeiten.entrySet()) {
			str.append(entry.getKey() + ": " + String.format("%.2f", (double)((double)entry.getValue() / (double)buchstabenAnzahl))).append('\n');
		}
		return str.toString();
	}

	public void schreibeStatistik(String dateiname){
		try(PrintWriter out = new PrintWriter(dateiname)) {
			out.println(statistik());
		} catch(IOException e) {
			System.err.println("Fehler beim schreiben von " + dateiname);
			System.exit(1);
		}
	}
}
