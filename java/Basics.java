// Die Klasse Basics demonstriert grundlegende Konzepte in Java.
// Es umfasst Datentypen, Variablen, Operatoren und bedingte Zuweisungen.
public class Basics {
    public static void main(String[] args) {
        // **Datentypen**: Java bietet verschiedene primitive Datentypen.
        boolean wahrheitswert = true; // Wahrheitswert: true oder false.
        int ganzeZahlen = 1024; // Ganzzahl, 32-Bit.
        short kurzeGanzeZahlen = 20; // Kurzformat für Ganzzahlen, 16-Bit.
        byte einByteZahl = 6; // Kleinster Ganzzahl-Datentyp, 8-Bit.
        long großeGanzeZahlen = 1032749828L; // Große Ganzzahlen, 64-Bit (L erforderlich).
        float fließkommaZahlen = 45.7F; // Fließkommazahl, 32-Bit (F erforderlich).
        double doppeltGenaueFließkommazahlen = 18; // Präzisere Fließkommazahl, 64-Bit.
        char buchstabe = 'A'; // Ein einzelnes Zeichen, Unicode.
        String zichenkette = "ABC"; // Zeichenkette, eine Folge von Zeichen.

        // **Ausgabe auf der Konsole**: System.out dient zur Ausgabe von Text.
        System.out.println("Test"); // Gibt einfachen Text aus.
        System.out.printf("Ganzzahl: %d\n", ganzeZahlen); // Formatierte Ausgabe.
        System.out.printf("Große Ganzzahl: %d\n", großeGanzeZahlen);

        // **Variablen**: Beispiel für Deklaration, Definition und Initialisierung.
        // Deklaration einer Variablen (nur Speicherplatz reservieren).
        int x;

        // Definition: Zuweisung eines Werts bei der Deklaration.
        int y = 128;

        // Initialisierung: Zuweisung eines Werts nach der Deklaration.
        x = y;
        // Alternativ: Direkt mit einem neuen Wert initialisieren.
        x = 234;

        // **Operationen**: Java unterstützt mathematische und Zuweisungsoperatoren.
        int ergebnis = x + y; // Addition.
        ergebnis = x++; // Post-Inkrement: x wird um 1 erhöht, nach der Zuweisung.
        ergebnis = x--; // Post-Dekrement: x wird um 1 verringert, nach der Zuweisung.
        ergebnis = ++x; // Prä-Inkrement: x wird um 1 erhöht, vor der Zuweisung.
        ergebnis = --x; // Prä-Dekrement: x wird um 1 verringert, vor der Zuweisung.
        ergebnis = x / y; // Division.
        ergebnis = x * y; // Multiplikation.

        // Modulo: Gibt den Rest einer Division zurück.
        ergebnis = x % y;

        // **Booleansche Operatoren**: Vergleichs- und logische Operatoren.
        wahrheitswert = x == y; // Gleichheit prüfen.
        wahrheitswert = x > y; // Größer als.
        wahrheitswert = x >= y; // Größer oder gleich.
        wahrheitswert = x < y; // Kleiner als.
        wahrheitswert = x <= y; // Kleiner oder gleich.

        // Logische UND-Verknüpfung: Beide Bedingungen müssen wahr sein.
        wahrheitswert = wahrheitswert && (x > y);

        // Logische ODER-Verknüpfung: Mindestens eine Bedingung muss wahr sein.
        wahrheitswert = (x == y) || wahrheitswert;

        // **Bedingte Zuweisung (Ternärer Operator)**:
        // Wenn (x > y) wahr ist, wird "x ist größer" zugewiesen, sonst "x ist kleiner".
        zichenkette = (x > y) ? "x ist größer" : "x ist kleiner";

        // Ausgabe der Ergebnisse (optional zur Visualisierung der Variablenwerte).
        System.out.println("Ergebnis: " + ergebnis);
        System.out.println("Wahrheitswert: " + wahrheitswert);
        System.out.println("Zichenkette: " + zichenkette);
    }
}
