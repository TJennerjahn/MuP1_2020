public class Verwaltung {
	private Mitarbeiter[] mitarbeiter;
	
	public Verwaltung(int anzahlMitarbeiter) {
		this.mitarbeiter = new Mitarbeiter[anzahlMitarbeiter];
	}

	Mitarbeiter[] getMitarbeiter() {
		return mitarbeiter;
	}

	public boolean addMitarbeiter(Mitarbeiter neuerMitarbeiter){
		for(int i = 0; i < mitarbeiter.length; i++){
			if(mitarbeiter[i] == null) {
				mitarbeiter[i] = neuerMitarbeiter;
				return true;
			}
		}
		return false;
	}

	public boolean removeMitarbeiter(Mitarbeiter mitarbeiter) {
		for(int i = 0; i < this.mitarbeiter.length; i++) {
			if(this.mitarbeiter[i].equals(mitarbeiter)) {
				this.mitarbeiter[i] = null;
				return true;
			}
		}

		return false;
	}

	public double berechnePersonalkosten() {
		double sum = 0.0;
		for(int i = 0; i < mitarbeiter.length; i++) {
			if(mitarbeiter[i] != null) {
				sum += mitarbeiter[i].berechneVerdienst();
			}
		}
		return sum;
	} 


	public void zeigeArbeiterMitWenigerAlsXStunden(double stunden) {
		System.out.println("Arbeiter mit weniger als " + stunden + " Stunden");
		for(int i = 0; i < mitarbeiter.length; i++) {
			if(mitarbeiter[i] != null && mitarbeiter[i] instanceof Arbeiter && ((Arbeiter)mitarbeiter[i]).getGeleisteteStunden() < stunden ) {
				System.out.println(mitarbeiter[i].toString());
			}
		}
	}

}
