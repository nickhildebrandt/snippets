// Die Klasse Arrays demonstriert die Verwendung von Arrays in Java.
// Arrays sind Datenstrukturen, die mehrere Werte desselben Typs speichern.
public class Arrays {
    public static void main(String[] args) {
        // Ein Array von Strings, das drei Elemente enthält.
        // Arrays in Java haben eine feste Größe, die bei der Initialisierung festgelegt wird.
        String[] stringArray = {"Apfel", "Banane", "Steine"};

        // Ein Array von Ganzzahlen (int), das vier Elemente enthält.
        int[] numberArray = {1, 66, 23, 324};

        // Ausgabe des String-Arrays mit einer erweiterten for-Schleife (for-each-Schleife).
        // Diese Schleife iteriert automatisch über jedes Element des Arrays.
        for (String word : stringArray) {
            // Das aktuelle Element (word) wird ausgegeben.
            System.out.println(word);
        }

        // Ausgabe des int-Arrays mit einer klassischen for-Schleife.
        // Die Schleife läuft von 0 bis zur Länge des Arrays - 1.
        for (int i = 0; i < numberArray.length; i++) {
            // Zugriff auf das aktuelle Element mit dem Index `i`.
            System.out.println(numberArray[i]);
        }
    }
}