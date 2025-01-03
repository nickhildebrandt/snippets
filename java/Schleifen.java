// Die Klasse Schleifen demonstriert die Verwendung verschiedener Schleifenarten in Java.
// Gezeigt werden: for-Schleife, while-Schleife und do-while-Schleife.
public class Schleifen {
    public static void main(String[] args) {
        // **For-Schleife**: Iteriert eine bekannte Anzahl von Durchläufen.
        System.out.println("For-Schleife:");
        for (int i = 0; i < 5; i++) {
            System.out.printf("Durchlauf %d\n", i);
        }

        // **While-Schleife**: Wiederholt sich, solange die Bedingung wahr ist.
        System.out.println("\nWhile-Schleife:");
        int count = 0; // Zählvariable
        while (count < 5) {
            System.out.printf("Durchlauf %d\n", count);
            count++; // Inkrementiert die Zählvariable
        }

        // **Do-While-Schleife**: Führt den Block mindestens einmal aus,
        // auch wenn die Bedingung zu Beginn nicht erfüllt ist.
        System.out.println("\nDo-While-Schleife:");
        int number = 5; // Startwert
        do {
            System.out.printf("Zahl: %d\n", number);
            number--; // Dekrementiert die Zahl
        } while (number > 0); // Bedingung prüfen
    }
}
