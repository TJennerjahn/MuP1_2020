public class Summe implements Operator {
	private double summe;

	public Summe() {
		summe = 0.0;
	}

	public void verarbeiteWert(double wert) {
		summe += wert;		
	}

	public double liefereErgebnis() {
		return summe;
	}

	public String getBezeichnung() {
		return "Summe";
	}
}
