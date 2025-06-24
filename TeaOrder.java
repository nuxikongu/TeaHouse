
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

    public String getDetails() {
        return "Geschmack: " + geschmack + ", Anzahl: " + anzahl +
                ", Topping: " + (tapioka ? "Tapioka" : "") + (fruechte ? ", Früchte" : "") +
                ", TakeAway: " + (takeAway ? "Yes" : "No") +
                ", Laktosefrei: " + (laktosefrei ? "Yes" : "No");
    }

    public int Anzahl() {
        return anzahl;
    }

    public boolean Tapioka() {
        return tapioka;
    }

    public boolean Fruechte() {
        return fruechte;
    }

    public boolean TakeAway() {
        return takeAway;
    }

    public boolean Laktosefrei() {
        return laktosefrei;
    }
}
