// Die Klasse OOP demonstriert die Grundlagen der Objektorientierten Programmierung (OOP) in Java.
// Hauptbestandteile der OOP: Klassen, Objekte, Kapselung (Encapsulation), Konstruktoren und Methoden.
public class OOP {
    public static void main(String[] args) {
        // Instanziierung der Klasse Tier: Erstellen eines Objekts der Klasse Tier mit dem Namen "t".
        // Dies zeigt die Verwendung eines Konstruktors zur Initialisierung des Objekts.
        Tier t = new Tier("Name");

        // Aufrufen der Methode printName(), die den Namen des Objekts ausgibt.
        t.printName();

        // Das folgende (auskommentierte) Beispiel zeigt, wie direkte Zugriffe auf die öffentliche Variable
        // `name` die Kapselung umgehen könnten. Hier wird der Name direkt geändert, ohne die Logik der Methode
        // `setName()` zu nutzen. Dies ist ein OOP-Antipattern und sollte vermieden werden.
        // t.name = "NAME";

        // Nutzung der Methode setName(), um den Namen des Objekts zu ändern.
        // Die Methode sorgt dafür, dass der Name immer in Kleinbuchstaben gespeichert wird,
        // was die Datenintegrität gewährleistet.
        t.setName("Neuer Name");

        // Aufrufen der Methode getName(), um den Namen mit einem spezifischen Format zurückzugeben.
        System.out.println(t.getName());
    }
}

// Die Klasse Tier stellt ein Beispiel für eine benutzerdefinierte Klasse dar.
// Sie zeigt wichtige OOP-Konzepte wie Konstruktoren, Methoden und die Verwendung von Instanzvariablen.
class Tier {
    // Öffentliche Variable `name`: Sie kann direkt zugegriffen werden, was nicht ideal ist.
    // Stattdessen sollten private Variablen verwendet werden (siehe `x`).
    public String name;

    // Private Variable `x`: Kann nur innerhalb der Klasse Tier verwendet werden.
    private int x;

    // Konstruktor: Dient dazu, ein Objekt der Klasse Tier zu erstellen und gleichzeitig den Namen zu initialisieren.
    public Tier(String name) {
        // `this.name` verweist auf die Instanzvariable `name` der Klasse.
        this.name = name;
    }

    // Setter-Methode: Ermöglicht das Setzen des Namens, sorgt aber dafür, dass der Name
    // immer in Kleinbuchstaben gespeichert wird, um Datenintegrität sicherzustellen.
    public void setName(String name) {
        this.name = name.toLowerCase();
    }

    // Getter-Methode: Gibt den Namen des Objekts zurück, zusammen mit einer beschreibenden Nachricht.
    public String getName(){
        return "Name: " + this.name;
    }

    // Methode printName(): Gibt den aktuellen Namen des Objekts direkt aus.
    public void printName() {
        System.out.println(this.name);
    }
}