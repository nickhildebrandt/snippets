// Funktion, um eine zufällige Zahl innerhalb eines Bereichs zu generieren,
// die nicht bereits in einem gegebenen Array enthalten ist
function getRandomNumber(min: number, max: number, numbers: number[]): number {
    // Generiert eine zufällige Zahl zwischen min und max (einschließlich beider Grenzen)
    const r = Math.floor(Math.random() * (max - min + 1)) + min;

    // Überprüft, ob die generierte Zahl bereits im Array "numbers" enthalten ist
    if (numbers.includes(r)) {
        // Falls ja, wird die Funktion rekursiv aufgerufen, um eine neue Zahl zu generieren
        return getRandomNumber(min, max, numbers);
    }

    // Gibt die generierte Zahl zurück, wenn sie noch nicht im Array enthalten ist
    return r;
}

// Initialisiert ein leeres Array, um die generierten Zahlen zu speichern
const zahlen: number[] = [];

// Schleife, um 6 einzigartige Zufallszahlen zu generieren
for (let i = 0; i < 6; i++) {
    // Ruft die Funktion "getRandomNumber" auf, um eine Zahl zu generieren,
    // und speichert diese im Array an der Position i
    zahlen[i] = getRandomNumber(1, 49, zahlen);
}

// Gibt die generierten Zahlen im Array aus
console.log(zahlen);