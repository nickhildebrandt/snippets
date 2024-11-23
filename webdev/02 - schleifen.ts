// Variable `a` wird auf 5 gesetzt
let a = 5;

// Es soll `a`-mal (5-mal) das Zeichen 'x' ausgegeben werden
for (let i = 0; i < a; i++) {
    // Gibt ohne Zeilenumbruch das Zeichen 'x' aus
    process.stdout.write('x');
}
// Fügt nach der Ausgabe eine neue Zeile hinzu
process.stdout.write('\n\n');

// Variable `b` wird auf 8 gesetzt
let b = 8;

// Es soll ein Rechteck aus `x`-en mit den Maßen `a * b` gezeichnet werden
for (let i = 0; i < b; i++) { // Äußere Schleife: b Zeilen
    for (let j = 0; j < a; j++) { // Innere Schleife: a Spalten
        // Gibt das Zeichen 'x' in der aktuellen Zeile aus
        process.stdout.write('x');
    }
    // Nach jeder Zeile wird ein Zeilenumbruch eingefügt
    process.stdout.write('\n');
}

process.stdout.write('\n');

// Das gleiche Rechteck wird gezeichnet, aber mit Leerzeichen innerhalb und einem Rand aus 'x'
for (let i = 0; i < b; i++) { // Äußere Schleife: b Zeilen
    for (let j = 0; j < a; j++) { // Innere Schleife: a Spalten
        // Bedingung für die Ränder:
        // - Erste oder letzte Zeile (i == 0 || i == b-1)
        // - Erste oder letzte Spalte (j == 0 || j == a-1)
        if (j == 0 || j == a - 1 || i == 0 || i == b - 1) {
            process.stdout.write('x'); // Gibt 'x' für den Rand aus
        } else {
            process.stdout.write(' '); // Gibt ein Leerzeichen für die Innenfläche aus
        }
    }
    // Nach jeder Zeile wird ein Zeilenumbruch eingefügt
    process.stdout.write('\n');
}

// Kopf-gesteuerte While-Schleife:
// Diese Schleife läuft so lange, wie die Bedingung `true` ist.
// Achtung: In diesem Fall ist die Bedingung immer wahr, also eine Endlosschleife.
while (true) {
    console.log("Test"); // Gibt unendlich oft "Test" aus
}

// Fuß-gesteuerte While-Schleife:
// Diese Schleife wird mindestens einmal ausgeführt, da die Bedingung am Ende geprüft wird.
do {
    console.log("Test"); // Gibt "Test" genau einmal aus
} while (false); // Bedingung ist `false`, Schleife endet nach der ersten Ausführung