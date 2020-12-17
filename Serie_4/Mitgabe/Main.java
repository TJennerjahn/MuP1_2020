public class Main {
	public static void main(String[] args) {
		BuchstabenStat stat = new BuchstabenStat();
		try {
			stat.analysiere("Faust.txt");
		}	catch(FalscherDateitypException e) {
			System.err.println(e.getMessage());
			return;
		} catch(UngueltigesZeichenException e) {
			System.err.println(e.getMessage());
			return;
		}
		stat.zeigeTop10();
		stat.schreibeStatistik("Faust2Stat.txt");
	}
}
