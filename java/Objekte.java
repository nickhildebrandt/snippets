// Die Klasse Objekte demonstriert das Konzept der Klassen und Objekte in Java.
// Sie zeigt die Verwendung von Vererbung, Methodenüberschreibung und Zugriffmodifikatoren.
public class Objekte {
    public static void main(String[] args) {
        // **Erstellen eines Objekts der Klasse Säugetier**:
        // Der Konstruktor der Klasse Säugetier wird verwendet, um das Objekt "günter" zu initialisieren.
        Säugetier günter = new Säugetier("Günter", 1.3, 30.0);

        // Direkte Zuweisung zu öffentlichen und geschützten Attributen.
        günter.hight_m = 2; // Ändern der Höhe von "günter".
        günter.test = 8;   // Zugriff auf das geschützte Attribut "test".

        // **Erstellen eines Objekts der Klasse Dog**:
        // Der Konstruktor der abgeleiteten Klasse Dog wird verwendet.
        Dog hund = new Dog("Hund", 12, 123, Dog.Rasse.BEAGLE);

        // Aufrufen der überschriebenen Methode print() der Klasse Dog.
        hund.print();
    }
}

// **Basisklasse Säugetier**:
// Die Klasse Säugetier repräsentiert allgemeine Eigenschaften von Säugetieren.
class Säugetier {
    // Geschützte und öffentliche Felder.
    protected int test;       // Geschützter Zugriff: Sichtbar in der Klasse und Unterklassen.
    public String name;       // Öffentliche Eigenschaft, frei zugänglich.
    public double hight_m;    // Öffentliche Eigenschaft für die Höhe.
    public double weight_kg;  // Öffentliche Eigenschaft für das Gewicht.

    // Private Eigenschaft: Nur innerhalb der Klasse zugänglich.
    private double bmi;

    // **Konstruktor**:
    // Initialisiert die Attribute `name`, `weight_kg` und `hight_m`.
    public Säugetier(String name, double weight_kg, double hight_m) {
        this.name = name;
        this.weight_kg = weight_kg;
        this.hight_m = hight_m;
    }

    // **Getter für den BMI**:
    // Berechnet den Body-Mass-Index (BMI) basierend auf Gewicht und Höhe.
    public double getBMI() {
        return weight_kg / (hight_m * hight_m);
    }

    // **Setter für BMI**:
    // Setzt den BMI-Wert des Objekts basierend auf der Berechnung.
    public void setBmi() {
        this.bmi = getBMI();
    }

    // **Ausgabe-Methode**:
    // Gibt die Attribute des Objekts formatiert auf der Konsole aus.
    public void print() {
        System.out.printf("Name:\t%s\nWeight:\t%f\nHeight:\t%f\nBMI:\t%f\n",
                this.name,
                this.weight_kg,
                this.hight_m,
                this.bmi);
    }
}

// **Endklasse Dog**:
// Die Klasse Dog erbt von Säugetier und ergänzt spezifische Eigenschaften.
final class Dog extends Säugetier {
    // Öffentliche Eigenschaft für die Rasse des Hundes.
    public Rasse rasse;

    // **Enum Rasse**:
    // Definiert mögliche Rassen für Hunde.
    public enum Rasse {
        TERRIER,
        POODLE,
        BULLDOGE,
        DACHSUND,
        BEAGLE
    }

    // **Konstruktor**:
    // Ruft den Konstruktor der Basisklasse Säugetier auf und initialisiert die Rasse.
    public Dog(String name, int weight_kg, int hight_m, Rasse r) {
        super(name, weight_kg, hight_m);
        this.rasse = r;
    }

    // **Überschreibung der Methode print()**:
    // Ruft die Methode print() der Basisklasse auf und ergänzt die Ausgabe um die Rasse.
    @Override
    public void print() {
        super.print(); // Aufruf der Methode aus der Basisklasse.
        System.out.printf("Rasse:\t%s\n", this.rasse.toString());
    }
}