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

    // **Überladene Methode 1**:
    // Addiert zwei ganze Zahlen (int).
    public static int add(int a, int b) {
        return a + b;
    }

    // **Überladene Methode 2**:
    // Addiert drei ganze Zahlen (int).
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    // **Überladene Methode 3**:
    // Addiert zwei Gleitkommazahlen (double).
    public static double add(double a, double b) {
        return a + b;
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

        // Aufruf der ersten Variante: Addiert zwei int-Werte.
        int result1 = add(5, 10); // Verwendet die Methode: add(int, int)
        System.out.println("Ergebnis von add(int, int): " + result1); // Ausgabe: 15

        // Aufruf der zweiten Variante: Addiert drei int-Werte.
        int result2 = add(5, 10, 15); // Verwendet die Methode: add(int, int, int)
        System.out.println("Ergebnis von add(int, int, int): " + result2); // Ausgabe: 30

        // Aufruf der dritten Variante: Addiert zwei double-Werte.
        double result3 = add(5.5, 10.5); // Verwendet die Methode: add(double, double)
        System.out.println("Ergebnis von add(double, double): " + result3); // Ausgabe: 16.0
    }
}
