import java.util.*;

public class MenuePlaner {

    private List<Zutat> zutatenListe;
    private Map<String,List<Gericht>> speiseplan;

    public MenuePlaner(Zutat[] zutatenArray) {
        zutatenListe = new ArrayList<Zutat>(Arrays.asList(zutatenArray));
        speiseplan = new HashMap<>();
    }

    private int zufallszahl(int minimum, int maximum) {
        return (int)(Math.random() * (maximum + 1 - minimum)) + minimum;
    }

    private Gericht erstelleGericht(){
        int anzahlZutaten = zufallszahl(3, 5);
        int hinzugefuegt = 0;
        Gericht gericht = new Gericht();
        while(hinzugefuegt < anzahlZutaten) {
            int i = zufallszahl(0, zutatenListe.size() - 1);
            if(!gericht.hatZutat(zutatenListe.get(i))) {
                gericht.addZutat(zutatenListe.get(i));
                hinzugefuegt++;
            }
        }
        return gericht;
    }

    private void erstelleMenueFuerWochentag(String tag, int anzahlGerichte) {
        List<Gericht> menue = new ArrayList<Gericht>();
        for(int i = 0; i < anzahlGerichte; i++){
            menue.add(erstelleGericht());
        }
        
        speiseplan.put(tag, menue);

    }

    public void erstelleSpeiseplan() {
        erstelleMenueFuerWochentag("Montag", 4);
        erstelleMenueFuerWochentag("Dienstag", 4);
        erstelleMenueFuerWochentag("Mittwoch", 5);
    }

    public String getMenueFuerWochentag(String tag) {
        List<Gericht> result = speiseplan.get(tag);
        if(result == null) {
            return "Die Mensa hat geschlossen!";
        }

        Collections.sort(result);
        StringBuilder str = new StringBuilder();

        str.append(tag).append(":").append("\n");
        for(Gericht gericht : result) {
            str.append(gericht.toString()).append("\n");
        }

        return str.toString();
    }

}
