// Funktion ohne Parameter und Rückgabewert
function exit() {
    // Schließt das aktuelle Browserfenster
    window.close();
}

// Funktion mit Parametern und Rückgabewert
function add(a: number, b: number): number {
    // Addiert zwei Zahlen und gibt das Ergebnis zurück
    return a + b;
}

// Aufruf der Funktion `add` mit den Werten 5 und 10
let ergebnis = add(5, 10); // Ergebnis: 15

// Beispiel aus der Mathematik
// Definiert eine Funktion f(x) = x^2
function f(x: number): number {
    // Multipliziert die Eingabe x mit sich selbst und gibt das Ergebnis zurück
    return x * x;
}

// Funktion zur Berechnung der Summe eines Arrays
function sumArray(array: number[]): number {
    // Initialisiert die Summe mit 0
    let sum = 0;

    // Iteriert über jedes Element im Array
    for (let i = 0; i < array.length; i++) {
        // Addiert das aktuelle Array-Element zur Summe
        sum += array[i];
    }

    // Gibt die Gesamtsumme zurück
    return sum;
}

// Beispiel-Array mit Zahlen
const numbers = [5, 5, 10, 10];

// Aufruf der Funktion `sumArray` mit dem Beispiel-Array
// Gibt die Summe des Arrays (30) in der Konsole aus
console.log(sumArray(numbers));