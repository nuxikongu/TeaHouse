import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TeaHouse extends JFrame {
    private JComboBox<String> Geschmack;
    private JTextField Anzahl;
    private JCheckBox TakeAway;
    private JCheckBox Laktosefei;
    private JCheckBox Tapioka;
    private JCheckBox Früchte;
    private JTextArea Gesamtpreis; // Anzeige der Bestellinformationen
    private JTextArea BestSeller;  // Anzeige der drei erstellten Objekte
    private JButton bestellenButton;
    private JButton abbrechenButton;
    private JPanel frame;

    // Mảng đối tượng TeaOrder
    private TeaOrder[] teaOrders = new TeaOrder[3];

    public TeaHouse() {
        setTitle("TeaHouse"); // Setzt den Titel des Fensters
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Setzt das Standard-Verhalten zum Schließen des Fensters
        setSize(700, 400); // Setzt die Größe des Fensters
        setContentPane(frame); // Setzt das Panel als Inhalt des Fensters
        setVisible(true); // Macht das Fenster sichtbar
        setResizable(false); // Verhindert, dass das Fenster in der Größe verändert wird

        // Erstelle drei TeaOrder Objekte (Bestellungen)
        initObjekt();

        // Anzeige der Bestellungen im BestSeller
        displayAllOrders();

        // ActionListener für den Button "Bestellen"
        bestellenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleBestellen();  // Ruft die Methode auf, um die Bestellung zu berechnen und anzuzeigen
            }
        });

        // ActionListener für den Button "Abbrechen"
        abbrechenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetFields();  // Setzt alle Felder zurück
            }
        });
    }

    // Methode zum Erstellen der TeaOrder Objekte (Bestellungen)
    private void initObjekt() {
        // Erstelle drei Bestellungen mit unterschiedlichen Attributen
        teaOrders[0] = new TeaOrder("Matcha", 2, true, false, true, false);
        teaOrders[1] = new TeaOrder("Black", 3, false, true, false, true);
        teaOrders[2] = new TeaOrder("Herbal", 1, true, true, true, true);
    }

    // Methode zur Berechnung des Preises für eine Bestellung
    private int berechnePreis(TeaOrder bestellung) {
        int total = TeaPrice.BASIS_PREIS.getPreis() * bestellung.Anzahl();  // Basispreis für den Tee

        // Addiere den Preis für Toppings, wenn sie ausgewählt sind
        if (bestellung.Tapioka()) {
            total += TeaPrice.TOPPING_PREIS.getPreis();  // Topping Tapioka
        }
        if (bestellung.Fruechte()) {
            total += TeaPrice.TOPPING_PREIS.getPreis();  // Topping Früchte
        }

        return total;  // Gibt den Gesamtpreis zurück
    }

    // Methode, die ausgeführt wird, wenn der Nutzer auf "Bestellen" klickt
    private void handleBestellen() {
        String geschmack = (String) Geschmack.getSelectedItem();
        String anzahlText = Anzahl.getText();

        // Überprüft, ob der Benutzer eine Anzahl eingegeben hat
        if (anzahlText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Bitte geben Sie die Anzahl ein!", "Fehler", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Überprüft, ob der Benutzer eine gültige Zahl für die Anzahl eingegeben hat
        int anzahl;
        try {
            anzahl = Integer.parseInt(anzahlText);
            if (anzahl <= 0) {
                JOptionPane.showMessageDialog(this, "Bitte geben Sie eine gültige Anzahl größer als 0 ein!", "Fehler", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Bitte geben Sie eine gültige Zahl für die Anzahl ein!", "Fehler", JOptionPane.ERROR_MESSAGE);
            return;
        }

        boolean hatTapioka = Tapioka.isSelected();
        boolean hatFruechte = Früchte.isSelected();
        boolean isTakeAway = TakeAway.isSelected();
        boolean isLaktosefrei = Laktosefei.isSelected();

        // Erstellt ein TeaOrder Objekt für die neue Bestellung
        TeaOrder bestellung = new TeaOrder(geschmack, anzahl, hatTapioka, hatFruechte, isTakeAway, isLaktosefrei);

        // Berechnet den Gesamtpreis
        int gesamtpreis = berechnePreis(bestellung);

        // Erstelle die Bestellinformation
        String result = "Gesamtpreis: " + gesamtpreis + "€\n";
        String extraInfo = "Geschmack: " + geschmack + "\n" + "Anzahl: " + anzahl + "\n";

        if (hatTapioka) {
            extraInfo += "Tapioka\n";
        }
        if (hatFruechte) {
            extraInfo += "Früchte\n";
        }
        if (isTakeAway) {
            extraInfo += "TakeAway\n";
        }
        if (isLaktosefrei) {
            extraInfo += "Laktosefrei\n";
        }

        // Zeigt den Gesamtpreis und die Bestellinformationen im JTextArea Gesamtpreis an
        Gesamtpreis.setText(result + extraInfo);  // Zeigt die Informationen der neuen Bestellung an
    }

    // Methode zur Anzeige der Bestellungen im BestSeller
    private void displayAllOrders() {
        StringBuilder orders = new StringBuilder();
        orders.append("BestSeller:\n");

        // Durchlaufe alle Bestellungen und zeige ihre Details an
        for (TeaOrder order : teaOrders) {
            orders.append(order.getDetails()).append("\n");
        }

        // Zeigt die Bestellinformationen im JTextArea BestSeller an
        BestSeller.setText(orders.toString());
    }

    // Methode zum Zurücksetzen der Felder, wenn der Benutzer auf "Abbrechen" klickt
    private void resetFields() {
        Geschmack.setSelectedIndex(0);  // Setzt das ComboBox zurück
        Anzahl.setText("");             // Setzt das TextField zurück
        TakeAway.setSelected(false);   // Setzt das JCheckBox zurück
        Laktosefei.setSelected(false); // Setzt das JCheckBox zurück
        Tapioka.setSelected(false);    // Setzt das JCheckBox zurück
        Früchte.setSelected(false);    // Setzt das JCheckBox zurück
        Gesamtpreis.setText("");       // Setzt das JTextArea zurück
    }

    public static void main(String[] args) {
        new TeaHouse();  // Initialisiert das TeaHouse-Fenster
    }
}

