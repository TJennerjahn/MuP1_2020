public class Mitarbeiter {
	private String name;

	public Mitarbeiter(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public double berechneVerdienst() {
		return 0;
	}

	@Override
	public String toString() {
		return name;
	}
}
