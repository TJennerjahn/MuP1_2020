import java.util.ArrayList;
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		Knoten k3 = new Knoten(1.0, new ArrayList<Knoten>());
		Knoten k4 = new Knoten(5.3, new ArrayList<Knoten>());
		Knoten k5 = new Knoten(9.2, new ArrayList<Knoten>());
		Knoten k1 = new Knoten(4.4, Arrays.asList(k3, k4));
		Knoten k2 = new Knoten(3.1, Arrays.asList(k5));

		Knoten wurzel = new Knoten(7.0, Arrays.asList(k1, k2));

		BaumProzessor baumProzessor = new BaumProzessor(wurzel, new Summe());
		baumProzessor.berechneErgebnis();

		baumProzessor = new BaumProzessor(wurzel, new Durchschnitt());
		baumProzessor.berechneErgebnis();
	}
}
