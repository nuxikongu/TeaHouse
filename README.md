# TeaHouse Projektarbeit - Digitale Bestellapp 🍵🫖🧋
"TeaHouse" ist eine Java-basierte Anwendung mit einer grafischen Benutzeroberfläche. 
Sie digitalisiert den Bestelllvorgang in einem modernen Teeladen und ermöglicht es Kundinnen und Kunden, ihre Bestellung direkt über ein Tablet zusammenstellen. Die Bedingung ist schnell, einfach und funktioniert unabhängig von Sprachkenntnissen.


- Projektidee

In gastronomischen Betrieben mit hohem Kundenaufkommen kommt es häufig zu Wartezeien und Missverständnissen bei der Bestellaufnahme, inbesondere wenn Sprachbarrieren bestehen.
Ein typisches Szenario zeigt sich am Beispiel von Lucas, einem fiktiven Austauschstudenten, der nur wenig Deutsch spricht (siehe Video).
Für ihn ist es im Moment eine Herausforderung, in einer vollen TeaHouse-Filliale seine Bestellung korrekt aufzugeben. Er befürchtet, missverstanden zu werden.
"TeaHouse" greift diese Problematik auf und bietet eine digitale Lösung. Eine benutzerfreundliche Bestelloberfläche, die vollständig über ein Tablet bedient wird. 
So können Bestellungen schnell, selbstständig und ohne direkte Kommunikation mit dem Personal aufgegeben werden.



- Projektstruktur
Das Projekt besteht aus drei Java-Klassen mit klar definierten Aufgaben:

"TeaOrder"

Diese Klasse repräsentiert eine Tee-Bestellung mit Attributen wie Geschmack, Anzahl, Toppings (Tapioka & Früchte) sowie Zusatzoptionen (Laktosefrei & TakeAway). 
Mithilfe von Getter-Methoden und der Methode "getDetails()" werden die Bestelldaten verarbeitet und angezeigt.


"TeaPrice"

Ein "enum", das den Basispreis für Tee (5€) und Aufpreise für Toppings (+1€) festlegt.
Die Preislogik bleibt dadurch zentral und leicht anpassbar.  


"TeaHouse"

Diese Hauptklasse enthält die grafische Benutzeroberfläche sowie alle zentralen Abläufe der Anwendung. Sie verwaltet die Eingabe der Bestellung, die Preisberechnung, die Anzeige im Textfeld, die Filterfunktion für laktosefreie Bestellungen und Fehlerbehandlung bei ungültiger Eingabe. 



- Hauptfunktionen

  Auswahl von Geschmack, Anzahl und Toppings - 
  Auswahloptionen Laktosefrei & TakeAway - 
  Automatische Preisberechnung je nach Auswahl - 
  Fehlermeldungen bei fehlender oder falscher Eingabe - 
  Zurücksetzen der Eingabefelder über den Button „Abbrechen“ - 
  Filterfunktion zur Anzeige nur laktosefreier Bestseller -  Unit Tests zur Sicherstellung der Funktionalität
  

- Beispielhafte Bedienung 
1. Projekt in IntelliJ IDEA öffnen
2. Datei "TeaHouse.java" ausführen
3. Die grafische Benutzeroberfläche öffnet sich
4. Bestelloptionen auswählen und auf "Bestellen" klicken
5. Die Ausgabe und der Preis werden im Textfeld angezeigt
6. Über dem Button "Filtern" lassen sich laktosefreie Bestseller anzeigen  
7. Mit "Abbrechen" werden alle Felder zurückgesetzt



- Erweiterungsmöglichkeiten
  
  Benutzeroberfläche mit auswählbarer Sprache, z. B. Englisch, Spanisch --
  Größenauswahl: klein, mittel, groß --
  Weitere Geschmacksrichtungen und Toppinggs -- 
  Zusätzliche Filterfunkionen, z.B nach Geschmack, Preis oder Topping-kombbination --
  Dynamische Preisvorschau während der Eingabe -- Visuelle Darstellung der Bestellung, z.B.Tassen-Icon, Tee im Becher,...

