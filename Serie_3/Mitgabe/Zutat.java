public class Zutat {
    private String name;
    private double preis;
    private boolean vegan;

    public Zutat(String name, double preis, boolean vegan) {
        this.name = name;
        this.preis = preis;
        this.vegan = vegan;
    }

    public String getName() {
        return name;
    }

    public double getPreis() {
        return preis;
    }

    public boolean getVegan() {
        return vegan;
    }

    public boolean equals(Zutat vergleichsobjekt) {
        return name.equals(vergleichsobjekt.name);
    }

    @Override
    public boolean equals(Object vergleichsobjekt) {
        if( vergleichsobjekt instanceof Zutat )
        {
            return equals((Zutat)vergleichsobjekt);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
