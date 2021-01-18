import java.lang.*;

public interface Operator {
	public void verarbeiteWert(double wert);
	public double liefereErgebnis();
	public String getBezeichnung();
}
