// Die Klasse OOP demonstriert die Grundlagen der Objektorientierten Programmierung (OOP) in Java.
// Erweiterte Konzepte: Vererbung, Komposition, abstrakte Klassen und Interfaces.
public class OOP {
    public static void main(String[] args) {
        // Instanziierung der Klasse Hund (Vererbungsbeispiel).
        Hund hund = new Hund("Bello", "Golden Retriever");
        hund.printName();
        hund.printRasse();

        // Komposition: Ein Tierhalter besitzt ein Tier (Hund in diesem Fall).
        Tierhalter halter = new Tierhalter("Max", hund);
        halter.introduce();

        // Verwendung eines Interfaces.
        fahrzeugAuto auto = new fahrzeugAuto();
        auto.start();
        auto.stop();
    }
}

// Basisklasse (Superklasse):
// Tier. Sie dient als Grundlage für andere spezialisierte Klassen.
class Tier {
    private String name;

    // Konstruktor: Initialisiert den Namen des Tiers.
    public Tier(String name) {
        this.name = name;
    }

    // Getter-Methode für den Namen des Tiers.
    public String getName() {
        return name;
    }

    // Setter-Methode für den Namen des Tiers.
    public void setName(String name) {
        this.name = name.toLowerCase();
    }

    // Methode zum Ausgeben des Namens.
    public void printName() {
        System.out.println("Name des Tiers: " + this.name);
    }
}

// Vererbung: Die Klasse Hund erweitert die Klasse Tier und erbt deren Eigenschaften und Methoden.
class Hund extends Tier {
    private String rasse;

    // Konstruktor: Initialisiert Name und Rasse des Hundes.
    public Hund(String name, String rasse) {
        super(name); // Aufruf des Konstruktors der Basisklasse.
        this.rasse = rasse;
    }

    // Getter-Methode für die Rasse.
    public String getRasse() {
        return rasse;
    }

    // Methode zum Ausgeben der Rasse.
    public void printRasse() {
        System.out.println("Rasse des Hundes: " + this.rasse);
    }
}

// Komposition: Die Klasse Tierhalter besitzt ein Tier (Komposition).
class Tierhalter {
    private String name;
    private Tier tier; // Tier als Teil der Klasse Tierhalter.

    // Konstruktor: Initialisiert den Namen des Halters und das Tier, das er besitzt.
    public Tierhalter(String name, Tier tier) {
        this.name = name;
        this.tier = tier;
    }

    // Methode zum Vorstellen des Halters und seines Tiers.
    public void introduce() {
        System.out.println("Halter: " + this.name + ", Tier: " + tier.getName());
    }
}

// Abstrakte Klasse: Fahrzeug. Dient als Basis für spezifische Fahrzeugtypen.
abstract class Fahrzeug {
    private String hersteller;
    private int baujahr;

    // Konstruktor: Initialisiert den Hersteller und das Baujahr des Fahrzeugs.
    public Fahrzeug(String hersteller, int baujahr) {
        this.hersteller = hersteller;
        this.baujahr = baujahr;
    }

    // Getter für den Hersteller.
    public String getHersteller() {
        return hersteller;
    }

    // Getter für das Baujahr.
    public int getBaujahr() {
        return baujahr;
    }

    // Abstrakte Methode: Muss von abgeleiteten Klassen implementiert werden.
    public abstract void start();

    // Abstrakte Methode: Muss von abgeleiteten Klassen implementiert werden.
    public abstract void stop();
}

// Implementierung eines spezifischen Fahrzeugs durch die Klasse Auto.
class fahrzeugAuto extends Fahrzeug {
    public fahrzeugAuto() {
        super("Unbekannter Hersteller", 2023);
    }

    @Override
    public void start() {
        System.out.println("Das Auto startet.");
    }

    @Override
    public void stop() {
        System.out.println("Das Auto stoppt.");
    }
}

// Interface: Beweglich. Definiert Verhalten, das Klassen implementieren können.
interface Beweglich {
    // Attribut: Maximale Geschwindigkeit (konstante Variable).
    int MAX_GESCHWINDIGKEIT = 100; // In km/h.

    // Methode zur Bewegung.
    void bewegen();
}

// Klasse Fahrrad, die das Interface Beweglich implementiert.
class Fahrrad implements Beweglich {
    @Override
    public void bewegen() {
        System.out.println("Maximale Geschwindigkeit: " + MAX_GESCHWINDIGKEIT + " km/h.");
    }
}
