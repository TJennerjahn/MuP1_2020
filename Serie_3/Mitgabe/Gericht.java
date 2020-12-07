import java.util.*;
public class Gericht implements Comparable<Gericht> {
        private List<Zutat> zutaten;
        private double preis;

        public Gericht() {
                this.preis = 1.0;
                this.zutaten = new ArrayList<Zutat>();
        }

        public void addZutat(Zutat zutat) {
                zutaten.add(zutat);
                preis += zutat.getPreis();
        }

        public boolean hatZutat(Zutat zutat) {
                return zutaten.contains(zutat);
        }

        public String getName() {
                StringBuilder str = new StringBuilder();
                for(Zutat zutat : zutaten) {
                        str.append(zutat.getName().substring(0,3));
                }

                return str.toString();
        }

        public double getPreis() {
                return this.preis;
        }

        public boolean istVegan() {
                for(Zutat zutat : zutaten) {
                        if(!zutat.getVegan()) {
                                return false; 
                        }
                }
                return true;
        }

        //@Override
        public int compareTo(Gericht vergleichsobjekt) {
                if(vergleichsobjekt.getPreis() == this.getPreis()) {return 0;}
                return vergleichsobjekt.getPreis() > this.getPreis() ? -1 : 1;    
        }

        public String toString() {
                StringBuilder str = new StringBuilder();
                str.append(this.getName());
                if(this.istVegan() == true) {
                        str.append(" (vegan) ");
                }
                else {
                        str.append(" ");
                }
                for(Zutat zutat : zutaten) {
                        str.append(zutat.getName());
                        str.append(" ");
                }

                str.append(String.format("%.2f", this.getPreis()));
                str.append(" Euro");

                return str.toString();

        }
}
