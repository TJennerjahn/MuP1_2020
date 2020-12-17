public class UngueltigesZeichenException extends Exception {
	public UngueltigesZeichenException() {
		super("Ungültiges Zeichen");
	}

	public UngueltigesZeichenException(String dateiname, int zeilennummer) {
		super("Ungültiges Zeichen in " + dateiname + " Zeile " + zeilennummer);
	}
}
