public class Durchschnitt implements Operator {

	private int anzahlSummanden;
	private double summe;

	public Durchschnitt() {
		anzahlSummanden = 0;
		summe = 0.0;
	}

	public void verarbeiteWert(double wert) {
		summe += wert;
		anzahlSummanden += 1;
	}

	public double liefereErgebnis() {
		if(anzahlSummanden == 0) {
			return 0;
		}
		return (summe / anzahlSummanden);
	}

	public String getBezeichnung() {
		return "Durchschnitt";
	}


}
