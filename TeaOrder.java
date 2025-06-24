public class TeaOrder {
    private String geschmack;
    private int anzahl;
    private boolean tapioka;
    private boolean fruechte;
    private boolean takeAway;
    private boolean laktosefrei;

    public TeaOrder(String geschmack, int anzahl, boolean tapioka, boolean fruechte, boolean takeAway, boolean laktosefrei) {
        this.geschmack = geschmack;
        this.anzahl = anzahl;
        this.tapioka = tapioka;
        this.fruechte = fruechte;
        this.takeAway = takeAway;
        this.laktosefrei = laktosefrei;
    }

    // Getter-Methoden für alle Attribute
    public String getGeschmack() {
        return geschmack;
    }

    public int getAnzahl() {
        return anzahl;
    }

    public boolean isTapioka() {
        return tapioka;
    }

    public boolean isFruechte() {
        return fruechte;
    }

    public boolean isTakeAway() {
        return takeAway;
    }

    public boolean isLaktosefrei() {
        return laktosefrei;
    }

    // Gibt die Details der Bestellung zurück
    public String getDetails() {
        return "Geschmack: " + geschmack + ", Anzahl: " + anzahl +
                ", Topping: " + (tapioka ? "Tapioka" : "") + (fruechte ? ", Früchte" : "") +
                ", TakeAway: " + (takeAway ? "Ja" : "Nein") +
                ", Laktosefrei: " + (laktosefrei ? "Ja" : "Nein");
    }
}