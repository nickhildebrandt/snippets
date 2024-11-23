// Deklaration von Variablen mit verschiedenen Namenskonventionen
let bezeichnerDing; // Lower camel case: Wird häufig für Variablen und Funktionen verwendet
let BezeichnerClasse; // Upper camel case: Wird üblicherweise für Klassen oder Konstruktorfunktionen verwendet
let python_ding; // Python snake case: Wird in JavaScript/TypeScript selten verwendet, häufiger in Python
// let das-ist-kebab-case; // Nicht erlaubt in JavaScript, da Bindestriche als Minus-Operator interpretiert werden

// Initialisierung einer Variable mit einem Wert
let variable = 12; // Eine Variable, die direkt mit einem numerischen Wert initialisiert wird

// Konstanten
const h = 1.75; // Eine Konstante, die die Körpergröße in Metern darstellt
const m = 75; // Eine Konstante, die das Gewicht in Kilogramm darstellt
const bmi = m / (h * h); // Berechnung des Body-Mass-Index (BMI)

console.log('BMI: ' + bmi); // Ausgabe des BMI mit einfacher String-Konkatenation
// Nutzung von Template-Strings für bessere Lesbarkeit
console.log(`Der berechnete BMI ist: ${bmi}`);

// Typen in JavaScript/TypeScript
let zahl: number = 1; // Eine Zahl (kann ganzzahlig, gebrochen oder negativ sein, z. B. 1.23 oder -1)
let string: string = "Jürgen"; // Ein Text (String), in Anführungszeichen eingeschlossen
let wahrheitswert: boolean = false; // Ein Wahrheitswert, entweder `true` oder `false`

// Listen (Arrays)
// Hinweis: Mit `const` wird das Array selbst konstant gemacht, aber seine Elemente können verändert werden
const nummern: number[] = [1, 2, 3, 4]; // Array mit Zahlen
const wörter: string[] = ["Herbert", "Günter", "Maier"]; // Array mit Strings