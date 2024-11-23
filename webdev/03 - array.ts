// Arrays = Bereich (Feld) mit festgelegter Größe
// Listen = Dynamische Größe, können sich zur Laufzeit ändern

// Deklaration und Initialisierung eines Arrays
// Das Array `noten` enthält eine Liste von Noten (Zahlen)
const noten = [2, 3.3, 1, 2, 1, 2, 3, 1, 1, 1, 2.2];

// Die Note an der dritten Stelle (Index 2) wird geändert
// Hinweis: Arrays starten bei Index 0, daher entspricht Index 2 dem dritten Element
noten[2] = 2;

// Kommentarierte Alternative: Berechnung mit einer `while`-Schleife
/*
let summe = 0; // Initialisiert die Summe mit 0
let count = 0; // Zähler für die Schleife

// `while`-Schleife, die über alle Elemente des Arrays iteriert
while (count < noten.length) {
    // Gibt die aktuelle Note in der Konsole aus
    console.log(noten[count]);

    // Addiert die aktuelle Note zur Summe
    summe += noten[count];

    // Erhöht den Zähler um 1
    count++;
}

// Berechnet den Durchschnitt, indem die Summe durch die Anzahl der Noten geteilt wird
let d = summe / noten.length;
console.log("Durchschnitt: " + d);
*/

// Alternative Berechnung mit einer `for`-Schleife:
let summe = 0; // Initialisiert die Summe mit 0

// `for`-Schleife, um über das Array zu iterieren
// Die Schleife läuft von 0 bis zur Länge des Arrays (`noten.length`)
for (let i = 0; i < noten.length; i++) {
    // Addiert die aktuelle Note zur Summe
    summe += noten[i];
}

// Berechnet den Durchschnitt, indem die Summe durch die Anzahl der Noten geteilt wird
let d = summe / noten.length;

// Gibt den berechneten Durchschnitt in der Konsole aus
console.log("Durchschnitt: " + d);