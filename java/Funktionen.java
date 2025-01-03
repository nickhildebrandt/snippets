// Die Klasse Funktionen zeigt die Verwendung von Funktionen (Methoden) in Java.
// Es werden verschiedene Arten von Methoden demonstriert:
// mit und ohne Rückgabewert sowie mit und ohne Eingabeparameter.
public class Funktionen {

    // **Funktion ohne Rückgabewert und ohne Eingabeparameter**:
    // Diese Methode führt eine Aktion aus (Druck auf die Konsole),
    // gibt aber keinen Wert zurück und benötigt keine Eingaben.
    private static void funktionOhneRückgabeUndEingabe() {
        System.out.println("Hallo");
    }

    // **Funktion mit Rückgabewert, aber ohne Eingabeparameter**:
    // Diese Methode gibt eine Konstante zurück, benötigt jedoch keine Eingaben.
    private static int funktionMitRückgabeOhneEingabe() {
        return 42; // Rückgabe der Zahl 42.
    }

    // **Funktion mit Rückgabewert und Eingabeparametern**:
    // Diese Methode nimmt zwei Ganzzahlen als Eingabe entgegen und gibt deren Summe zurück.
    private static int funktionMitRückgabeundEingabe(int x, int y) {
        return x + y; // Rückgabe der Summe von x und y.
    }

    // **Boolesche Funktion**:
    // Diese Methode nimmt eine Ganzzahl als Eingabe und gibt `true` zurück,
    // wenn die Zahl größer als 1 ist, sonst `false`.
    private static boolean booleanFunktion(int x) {
        return x > 1; // Vergleich: Ist x größer als 1?
    }

    public static void main(String[] args) {
        // Aufrufen einer Funktion ohne Rückgabewert und ohne Eingabeparameter.
        funktionOhneRückgabeUndEingabe(); // Ausgabe: Hallo

        // Aufrufen einer Funktion mit Rückgabewert, aber ohne Eingabeparameter.
        // Der Rückgabewert wird hier ignoriert.
        funktionMitRückgabeOhneEingabe();

        // Aufrufen einer Funktion mit Rückgabewert und Eingabeparametern.
        // Der Rückgabewert wird in der Variable `ergebnis` gespeichert.
        int ergebnis = funktionMitRückgabeundEingabe(10, 20); // Ergebnis: 30

        // Bedingte Anweisung basierend auf dem Ergebnis einer booleschen Funktion.
        // Wenn `booleanFunktion(ergebnis)` true ist, wird die Nachricht ausgegeben.
        if (booleanFunktion(ergebnis)) {
            System.out.println("Das Ergebnis ist größer als 1");
        }
    }
}
