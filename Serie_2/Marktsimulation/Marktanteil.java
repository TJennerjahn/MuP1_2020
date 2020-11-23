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
		for(int i = 0; i < kaeuferVonA; i++) {
			if(Math.random() > bleibBeiA) {
				switchToB++;
			}
		}
		for(int i = 0; i < kaeuferVonB; i++) {
			if(Math.random() > bleibBeiB) {
				switchToA++;
			}
		}
		return new Marktanteil(kaeuferVonA - switchToB + switchToA, kaeuferVonB - switchToA + switchToB);
	}
	
	public String toString() {
		int kaeuferSum = kaeuferVonA + kaeuferVonB;
		String result = "Marktanteil Käufer Produkt A: " + kaeuferVonA + " (" + Math.round(kaeuferVonA / kaeuferSum) + "%) " + "Käufer Produkt B: " + kaeuferVonB + " (" + Math.round(kaeuferVonB / kaeuferSum) + "%)";
		return result;
	}

}
