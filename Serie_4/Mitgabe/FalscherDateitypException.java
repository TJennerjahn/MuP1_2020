public class FalscherDateitypException extends Exception {
				private String dateiname;
				public FalscherDateitypException(String dateiname) {
								super(dateiname + " hat eine nicht kompatible Dateiendung.");
				}
}
