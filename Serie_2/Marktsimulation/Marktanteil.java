public class Marktanteil {
	private int kaeuferVonA;
	private int kaeuferVonB;
	
	public Marktanteil(int kaeuferVonA, int kaeuferVonB) {
		this.kaeuferVonA = kaeuferVonA;
		this.kaeuferVonB = kaeuferVonB;
	}

	public int getKaeuferVonA() {
		return this.kaeuferVonA;
	}
	
	public int getKaeuferVonB() {
		return this.kaeuferVonB;
	}
	
	public Marktanteil naechsterTag(double bleibBeiA, double bleibBeiB) {
		int switchToB = 0;
		int switchToA = 0;
		int currentA = getKaeuferVonA();
		int currentB = getKaeuferVonB();
		for(int i = 0; i < currentA; i++) {
			if(Math.random() > bleibBeiA) {
				switchToB++;
			}
		}
		for(int i = 0; i < currentB; i++) {
			if(Math.random() > bleibBeiB) {
				switchToA++;
			}
		}
		return new Marktanteil(currentA - switchToB + switchToA, currentB - switchToA + switchToB);
	}
	
	public String toString() {
		int kaeuferSum = getKaeuferVonA() + getKaeuferVonB();
		String result = "Marktanteil Käufer Produkt A: " + getKaeuferVonA() + " (" + Math.round(getKaeuferVonA() / kaeuferSum) + "%) " + "Käufer Produkt B: " + getKaeuferVonB() + " (" + Math.round(getKaeuferVonB() / kaeuferSum) + "%)";
		return result;
	}

}
