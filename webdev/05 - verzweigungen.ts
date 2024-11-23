// Variable `age` wird mit dem Wert 12 initialisiert
let age = 12;

// If-Verzweigung mit {}-Scopes (Blöcke für den Gültigkeitsbereich der Statements)
// Bedingungen -> statements = Booleans (wahr/falsch)
// Überprüft das Alter und gibt entsprechende Nachrichten aus
if (age >= 40) {
    // Wenn das Alter 40 oder älter ist, wird diese Nachricht ausgegeben
    console.log("Boah, bist du alt!");
} else if (age >= 30) {
    // Wenn das Alter zwischen 30 und 39 liegt, wird diese Nachricht ausgegeben
    console.log("Du bist noch voll jung");
} else {
    // Für alle anderen Fälle (jünger als 30) wird diese Nachricht ausgegeben
    console.log("So alt bist du noch nicht");
}

// Boolesche Operatoren
// Werte 1 und 0 werden im Kontext von Booleans wie folgt interpretiert:
// 1 entspricht `true`
// 0 entspricht `false`

// UND-Operator (`&&`)
// Liefert `true`, wenn beide Operanden `true` sind
// Beispiel-Ergebnisse:
true && true; // true
false && true; // false
false && false; // false

// ODER-Operator (`||`)
// Liefert `true`, wenn mindestens einer der Operanden `true` ist
// Beispiel-Ergebnisse:
true || true; // true
true || false; // true
false || false; // false

// Vergleichsoperatoren
// `==` prüft auf Gleichheit (ohne Berücksichtigung des Typs)
// `===` prüft auf Gleichheit und den gleichen Datentyp (strikter Vergleich)
// Beispiele:
1 == 1; // true (Werte sind gleich)
1 === 1; // true (Werte und Typen sind gleich)
1 === '1'; // false (Werte sind gleich, aber Typen unterschiedlich)
1 == '1'; // true (Werte sind gleich, Typen werden nicht berücksichtigt)

// Ungleichheitsoperatoren
// `!=` prüft, ob Werte unterschiedlich sind (unabhängig vom Typ)
// `!==` prüft, ob Werte oder Typen unterschiedlich sind
// Beispiele:
1 != 2; // true (Werte sind unterschiedlich)
1 != 1; // false (Werte sind gleich)
1 !== '2'; // true (Werte und Typen sind unterschiedlich)
1 !== '1'; // true (Werte sind gleich, aber Typen unterschiedlich)

// Größer-/Kleiner-Vergleiche
// Beispiele:
1 > 0; // true (1 ist größer als 0)
1 < 0; // false (1 ist nicht kleiner als 0)
1 <= 1; // true (1 ist kleiner oder gleich 1)
1 >= 1; // true (1 ist größer oder gleich 1)
2 <= 5; // true (2 ist kleiner oder gleich 5)
3 >= 1; // true (3 ist größer oder gleich 1)