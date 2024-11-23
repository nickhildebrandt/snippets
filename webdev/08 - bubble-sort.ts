// Definiert ein Array von Zahlen, das sortiert werden soll
const numbers: number[] = [10, 3, 7, 1, 2, 5, 9, 4, 6, 8];

// Äußere Schleife, die das Array durchläuft
for (let i = 0; i < numbers.length; i++) {
    // Speichert den aktuellen Wert an der Position i
    let speicher: number = numbers[i];

    // Überprüft, ob der aktuelle Wert größer ist als der nächste Wert
    if (speicher > numbers[i + 1]) {
        // Tauscht die Werte an den Positionen i und i+1
        numbers[i] = numbers[i + 1];
        numbers[i + 1] = speicher;

        // Setzt den Zähler i zurück auf -1, damit die Schleife
        // von vorne beginnt und sicherstellt, dass das Array sortiert ist
        i = -1;
    }
}

// Gibt das sortierte Array in der Konsole aus
console.log(numbers);

