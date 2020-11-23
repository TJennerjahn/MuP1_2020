public class Main {
	public static void main(String args[]) {
		Verwaltung verwaltung = new Verwaltung(20);

		verwaltung.addMitarbeiter(new Angestellter("Klaus Kleber", 1000.00));
		verwaltung.addMitarbeiter(new Angestellter("James Holden", 2500.00));
		verwaltung.addMitarbeiter(new Angestellter("Fred Johnson", 1350.00));
		verwaltung.addMitarbeiter(new Angestellter("Chrisjen Avasarala", 7000.00));

		verwaltung.addMitarbeiter(new Arbeiter("Naomi Nagata", 38.5, 26.0));	
		verwaltung.addMitarbeiter(new Arbeiter("Jules-Pierre Mao", 123.45, 18.0));	
		verwaltung.addMitarbeiter(new Arbeiter("Roberta Draper", 36.00, 39.0));
		verwaltung.addMitarbeiter(new Arbeiter("Camina Drummer", 59.50, 56.00));

		System.out.println(verwaltung.berechnePersonalkosten());

		verwaltung.removeMitarbeiter(verwaltung.getMitarbeiter()[0]);

		System.out.println(verwaltung.berechnePersonalkosten());

		verwaltung.zeigeArbeiterMitWenigerAlsXStunden(20.0);
	}
}
