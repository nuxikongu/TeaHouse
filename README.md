# TeaHouse Projektarbeit - Digitale Bestellapp 🍵🫖🧋
"TeaHouse" ist eine Java-basierte Anwendung mit einer grafischen Benutzeroberfläche, die den Bestelllvorgang in einem modernen Teeladen digitalisiert.
Kundinnen und Kunden können ihre Bestellung direkt über ein Tablet zusammenstellen. Die Bedingung ist schnell, fehlerfrei und funktioniert ubabhängig von Sprachkenntnissen.

- Projektidee

In gastronomischen Betrieben mit hoher Kundenzahl kommt es häufig zu Wartezeien und Missverständnissen bei der Bestellaufnahme, inbesondere wenn Sprachbarrieren bestehen.
Ein typisches Szenario zeigt sich am Beispiel von Lucas, einem fiktiven Austauschstudenten, der nur wenig deutsch spricht (siehe Video).
Für ihn ist es im Moment eine Herausforderung, in einer vollen TeaHouse-Filliale seine Bestellung korrekt aufzugeben. Er befürchtet, missverstanden zu werden.
TeaHouse greift diese Problematik auf und bietet eine digitale Lösung. Eine benutzerfreundliche Bestelloberfläche, die vollständig über ein Tablet bedient wird. 
So können Kunden ihre Teeauswahl schnell, selbständig und ohne direkte Kommunikation mit dem Personal treffen.

- Projektstruktur
Das Projekt besteht aus 3 Java-Klassen mit klaren Aufgaben:

"TeaOrder"

Diese Klasse repräsentiert eine Tee-Bestellung. Sie speichert Daten wie Geschmak, Anzahl, Toppings (Tapioka & Früchte) und Zusatzoptionen (Laktosefrei & TakeAway). Getter-Methoden und die Methode "getDetails()" liefern alle wichtigen Informationen zur Bestellung. 

"TeaPrice"

Ein "enum", das die Festpreise für Tee und Toppings speichert.
-- Basispreis für Tee & Aufpreis pro Topping --
So bleibt die Preislogik zentral und leicht anpassbar. 

"TeaHouse"

Die Hauptklasse enthält die GUI sowie alle logischen Abläufe der Anwendung. Sie verwaltet die Eingabe der Bestellung, die Preisberechnung, die Anzeige im Textfeld, eine Filterfunktion für laktosefreie Bestellungen und fehlerbehandlung bei ungültiger Eingabe. 

- Hauptfunktionen

  Auswahl von Geschmack, Menge und Toppings
  Auswahloptionen laktosefrei & TakeAway
  Automatische Preisberechnung
  Fehlermeldungen bei fehlender oder falscher Eingabe
  Bei "Abbrechen" zurücksetzen der Felder
  Filterfunktion für laktosefreie Bestseller
  Unit Tests zur Sicherstellung der Funktionalität

  

- Beispielhafte Bedienung 
1. Projekt in IntelliJ IDEA öffnen
2. Datei "TeaHouse.java" ausführen
3. Grafische Benutzeroberfläche öffnet sich
4. Bestelloptionnen auswählen und auf "Bestellen" klicken
5. Ausgabe und Preis werden im Textfeld angezeigt
6. Über dem Button "Filtern" können laktosefreie Bestseller angezeigt werden
7. Mit "Abbbrechen" werden alle Felder zurückgesetzt

- Erweiterungsmöglichkeiten
  
  Mehrsprachige Benutzeroberfläche, z.B auf Englisch, Spanisch,... -- 
  Mehr Geschmackssorten -- 
  Weitere Filterfunkionen, z.B nach Geschmack oder Toppings


