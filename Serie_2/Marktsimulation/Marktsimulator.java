public class Marktsimulator {
	private Marktanteil tagesMarktanteil[];
	private double bleibBeiA;
	private double bleibBeiB;

	public Marktsimulator(Marktanteil start, int tage, double bleibBeiA, double bleibBeiB) {
		tagesMarktanteil = new Marktanteil[tage + 1];
		tagesMarktanteil[0] = start;
		this.bleibBeiA = bleibBeiA;
		this.bleibBeiB = bleibBeiB;

		simuliere();
	} 

	public void simuliere() {
		for(int i = 0; i < tagesMarktanteil.length - 1; i++){
			tagesMarktanteil[i + 1] = tagesMarktanteil[i].naechsterTag(bleibBeiA, bleibBeiB);
		}
	}

	public void zeigeMarktverlauf() {
		System.out.println("Marktentwicklung");
		StringBuilder a = (new StringBuilder()).append("Produkt A: ");
		StringBuilder b = (new StringBuilder()).append("Produkt B: ");
		for(int i = 0; i< tagesMarktanteil.length; i++){
			a.append(tagesMarktanteil[i].getKaeuferVonA()).append(" ");
			b.append(tagesMarktanteil[i].getKaeuferVonB()).append(" ");
		}
		System.out.println(a.toString());
		System.out.println(b.toString());

	
	}
}
