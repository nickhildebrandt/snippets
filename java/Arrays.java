import java.util.ArrayList;

// Die Klasse Arrays demonstriert die Verwendung von Arrays und ArrayLists in Java.
// Arrays sind statische Datenstrukturen, die mehrere Werte desselben Typs speichern,
// wohingegen ArrayLists dynamisch sind und ihre Größe zur Laufzeit ändern können.
public class Arrays {
    public static void main(String[] args) {
        // Ein statisches Array von Strings mit drei Elementen.
        // In Java haben Arrays eine feste Größe, die bei der Initialisierung festgelegt wird.
        String[] stringArray = {"Apfel", "Banane", "Steine"};

        // Beispiel für die Deklaration und Initialisierung eines Arrays von Ganzzahlen.
        // Dieses Array hat eine feste Länge von 8 und speichert nur Ganzzahlen (int).
        // Es können 8 Zahlen gespeichert werden, Indizes reichen von 0 bis 7.
        int[] zahlenArray = new int[8];

        // Ein weiteres statisches Array von Ganzzahlen mit vier vordefinierten Elementen.
        int[] numberArray = {1, 66, 23, 324};

        // Iteration über ein Array mit einer erweiterten for-Schleife (auch "for-each" genannt).
        // Diese Schleife geht automatisch jedes Element des Arrays durch.
        for (int nummer : numberArray) {
            System.out.println(nummer); // Gibt jedes Element des Arrays aus.
        }

        // Alternative zur erweiterten for-Schleife: klassische for-Schleife.
        // Hier wird der Index verwendet, um auf die Elemente des Arrays zuzugreifen.
        for (int i = 0; i < numberArray.length; i++) {
            System.out.println(numberArray[i]); // Gibt jedes Element des Arrays aus.
        }

        // Iteration und Ausgabe eines String-Arrays mit der erweiterten for-Schleife.
        for (String word : stringArray) {
            System.out.println(word); // Gibt jedes Element des Arrays aus.
        }

        // Iteration und Ausgabe des int-Arrays mit der klassischen for-Schleife.
        for (int i = 0; i < numberArray.length; i++) {
            System.out.println(numberArray[i]); // Gibt jedes Element des Arrays aus.
        }

        // Verwendung von ArrayLists:
        // Eine ArrayList ist eine dynamische Datenstruktur, die ihre Größe während der Laufzeit ändern kann.
        // Arrays haben eine feste Größe, während ArrayLists wachsen oder schrumpfen können.
        ArrayList<Integer> numberList = new ArrayList<>(); // Deklaration einer ArrayList von Ganzzahlen.
        numberList.add(1); // Fügt ein Element hinzu.
        numberList.add(2); // Fügt ein weiteres Element hinzu.

        // Syntax zur Deklaration einer ArrayList:
        // ArrayList<DATENTYP DER ELEMENTE> VARIABLENNAME = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();

        // Hinzufügen von Elementen zur ArrayList.
        list.add("Erster String");
        list.add("Das ist jetzt der erste");
        list.add("Der Letzte");

        // Ausgabe der Elemente einer ArrayList mit einem anonymen Lambda-Ausdruck.
        // Lambda-Ausdrücke sind Kurzschreibweisen für Funktionen und werden hier verwendet,
        // um jedes Element der Liste zu verarbeiten und auszugeben.
        list.forEach((s) -> {
            System.out.println(s);
        });

        // Alternativ kann eine Methode-Referenz verwendet werden:
        list.forEach(System.out::println);

        // Strings sind im Grunde genommen auch Arrays, die aus einzelnen Zeichen (char) bestehen.
        String a = "Hallo";
        String b = "Hallo";

        // Vergleich von Strings durch Umwandlung in char-Arrays.
        char[] achar = a.toCharArray(); // Umwandlung des Strings "a" in ein char-Array.
        char[] bchar = b.toCharArray(); // Umwandlung des Strings "b" in ein char-Array.

        // Beispiel für eine Typumwandlung:
        // Eine Gleitkommazahl (double) wird in eine Ganzzahl (int) umgewandelt.
        // Hinweis: Der Nachkommabereich geht verloren, da abgeschnitten wird (keine Rundung).
        double abc = 87874509.123123;
        int aa = (int) abc; // Typumwandlung von double zu int.
        System.out.println(aa); // Gibt den Ganzzahlanteil der Zahl aus.

        // Verwendung des ternären Operators:
        // Syntax: (Bedingung) ? WENN_WAHR : WENN_FALSCH
        for (int i = 0; i < ((a.length() > b.length()) ? a.length() : b.length()); i++) {
            // Vergleich der Zeichen in den beiden char-Arrays.
            if ((int) achar[i] != (int) bchar[i]) {
                System.out.println("String A und B sind ungleich!");
            }
        }
    }
}
