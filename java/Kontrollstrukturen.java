// Die Klasse Kontrollstrukturen zeigt die Verwendung von Kontrollstrukturen in Java.
// Sie umfasst `if-else`-Bedingungen und `switch-case`-Anweisungen, um Entscheidungen im Programmablauf zu steuern.
public class Kontrollstrukturen {
    public static void main(String[] args) {

        // Initialisierung einer Ganzzahlvariablen.
        int zahl = 128;

        // **If-Else-Struktur**:
        // Die `if`-Anweisung überprüft, ob die Bedingung `zahl > 100` erfüllt ist.
        if (zahl > 100) {
            // Wenn die Bedingung wahr ist, wird dieser Block ausgeführt.
            System.out.printf("%d ist größer als 100\n", zahl);
        } else {
            // Wenn die Bedingung falsch ist, wird der `else`-Block ausgeführt.
            System.out.printf("%d ist kleiner als 100\n", zahl);
        }

        // **Switch-Case-Struktur**:
        // Die `switch`-Anweisung prüft den Wert von `zahl` und führt den passenden Block aus.
        switch (zahl) {
            case 10:
                // Dieser Block wird ausgeführt, wenn `zahl` den Wert 10 hat.
                System.out.println("Die Zahl ist 10");
                break; // Verhindert, dass der nächste Fall ausgeführt wird.
            case 20:
                // Dieser Block wird ausgeführt, wenn `zahl` den Wert 20 hat.
                System.out.println("Die Zahl ist 20");
                break;
            default:
                // Dieser Block wird ausgeführt, wenn keine der vorherigen Bedingungen erfüllt ist.
                System.out.println("Switch ist fertig");
        }
    }
}
