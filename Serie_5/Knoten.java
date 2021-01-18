import java.util.ArrayList;
import java.util.List;

public class Knoten {
	private double wert;
	private List<Knoten> kinder;

	public Knoten(double wert, List<Knoten> kinder) {
		this.wert = wert;
		if(kinder == null) {
			this.kinder = new ArrayList<Knoten>();
		} else {
			this.kinder = kinder;
		}
	}

	public Knoten(double wert) {
		this.wert = wert;
		this.kinder = new ArrayList<Knoten>();
	}

	public double getWert() {
		return wert;
	}

	public List<Knoten> getKinder() {
		return kinder;
	}
}
