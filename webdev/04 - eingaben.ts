// Fragt den Benutzer, wie viele Zahlen er eingeben möchte
// Die Eingabe wird mit `parseInt` in eine ganze Zahl umgewandelt
const len = parseInt(prompt("Wie viele Zahlen willst du eingeben?")!);

// Initialisiert ein leeres Array `num`, um die eingegebenen Zahlen zu speichern
const num: number[] = [];

// Variable `sum` speichert die Summe aller eingegebenen Zahlen
let sum: number = 0;

// Schleife, um `len`-mal Zahlen vom Benutzer abzufragen
for (let i = 0; i < len; i++) {
    // Fragt den Benutzer nach der nächsten Zahl
    // `i + 1` sorgt dafür, dass die Ausgabe für den Benutzer bei "Zahl1" beginnt
    const x = parseInt(prompt("Zahl" + (i + 1))!);

    // Fügt die eingegebene Zahl in das Array `num` ein
    num.push(x);

    // Addiert die eingegebene Zahl zur Summe
    sum += x;
}

// Berechnet den Durchschnitt, indem die Summe durch die Anzahl der Zahlen geteilt wird
// Gibt das Ergebnis in der Konsole aus
console.log("Durchschnitt: " + (sum / num.length));