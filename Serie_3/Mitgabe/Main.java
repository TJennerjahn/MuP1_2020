public class Main
{
        public static void main(String[] args) {
                MenuePlaner planer = new MenuePlaner(getZutatenListe());
                planer.erstelleSpeiseplan();
                System.out.println(planer.getMenueFuerWochentag("Donnerstag"));
                System.out.println(planer.getMenueFuerWochentag("Mittwoch"));
        }

    private static Zutat[] getZutatenListe() {
        return new Zutat[]{new Zutat("Aubergine", 0.48, true),
                new Zutat("Blattspinat", 0.45, true),
                new Zutat("Blumenkohl", 0.63, true),
                new Zutat("Bohnen", 0.63, true),
                new Zutat("Bratwurst", 0.90, false),
                new Zutat("Braune Sauce", 0.57, true),
                new Zutat("Broccoli", 0.69, true),
                new Zutat("Bulgur", 0.63, true),
                new Zutat("Champignons", 0.41, true),
                new Zutat("Chicoree", 0.47, true),
                new Zutat("Couscous", 0.48, true),
                new Zutat("Currysauce", 0.53, false),
                new Zutat("Erbsen", 0.62, true),
                new Zutat("Falafel", 0.57, true),
                new Zutat("Forelle", 1.09, false),
                new Zutat("Frühlingsrolle", 0.71, true),
                new Zutat("Garnelen", 0.92, false),
                new Zutat("Hummus", 0.70, true),
                new Zutat("Kartoffeln", 0.55, true),
                new Zutat("Kürbis", 0.66, true),
                new Zutat("Mie-Nudeln", 0.60, true),
                new Zutat("Möhren", 0.43, true),
                new Zutat("Nudeln", 0.67, true),
                new Zutat("Pfeffersteak", 0.44, false),
                new Zutat("Putenbrust", 0.97, false),
                new Zutat("Reiskornnudeln", 0.53, true),
                new Zutat("Rote Sauce", 0.57, true),
                new Zutat("Rumpsteak", 1.14, false),
                new Zutat("Sahnesauce", 0.66, false),
                new Zutat("Seitan", 0.79, true),
                new Zutat("Spätzle", 0.64, false),
                new Zutat("Süßkartoffeln", 0.65, true),
                new Zutat("Wildlachs", 0.79, false),
                new Zutat("Wildreis", 0.41, true),
                new Zutat("Zucchini", 0.71, true)};
    }
}
