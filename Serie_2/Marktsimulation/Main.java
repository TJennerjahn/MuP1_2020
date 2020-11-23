public class Main{
	public static void main(String[] args) {
		Marktanteil start = new Marktanteil(5000, 5000);
		Marktsimulator simulator = new Marktsimulator(start, 20, 0.8, 0.7);

		simulator.zeigeMarktverlauf();
	}
}
