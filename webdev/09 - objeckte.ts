// Definiert einen Typ für ein Bankkonto
type Konto = {
    iban: string;       // Die IBAN des Kontos
    pin: number;        // Die PIN des Kontos
    kontostand: number; // Der aktuelle Kontostand
};

// Liste aller Bankkonten
const Konten: Konto[] = [
    {
        iban: "DE1",
        pin: 1234,
        kontostand: 301.5,
    },
    {
        iban: "DE2",
        pin: 2448,
        kontostand: 120.8,
    },
    {
        iban: "DE3",
        pin: 6565,
        kontostand: 120.8,
    }
];

// Funktion, um ein Konto anhand der IBAN zu finden
function getKonto(Konten: Konto[], iban: string): Konto | undefined {
    for (let i = 0; i < Konten.length; i++) {
        if (Konten[i].iban === iban) {
            return Konten[i]; // Gibt das Konto zurück, wenn die IBAN übereinstimmt
        }
    }
    return undefined; // Gibt undefined zurück, wenn kein Konto gefunden wird
}

// Funktion, um einen Betrag auf ein Konto einzuzahlen
function einzahlen(Konto: Konto, betrag: number): void {
    Konto.kontostand += betrag;
}

// Funktion, um einen Betrag von einem Konto abzuheben
function auszahlen(Konto: Konto, betrag: number, pin: number): void {
    if (pin === Konto.pin && Konto.kontostand > betrag) {
        Konto.kontostand -= betrag; // Betrag wird nur abgehoben, wenn PIN korrekt ist und genug Guthaben vorhanden ist
    }
}

// Funktion, um Geld von einem Konto auf ein anderes zu überweisen
function überweisung(srcKonto: Konto, destKonto: Konto, betrag: number, pin: number): void {
    if (pin === srcKonto.pin && srcKonto.kontostand > betrag) {
        destKonto.kontostand += betrag; // Betrag wird auf das Zielkonto gutgeschrieben
        srcKonto.kontostand -= betrag; // Betrag wird vom Quellkonto abgezogen
    }
}

// Funktion, um die Details eines Kontos anzuzeigen
function kontoübersicht(Konto: Konto): void {
    console.log(`
++++++++++
IBAN: ${Konto.iban}
PIN: ${Konto.pin}
Kontostand: ${Konto.kontostand}
++++++++++
`);
}

// Funktion, um die Details aller Konten anzuzeigen
function kontenübersicht(Konten: Konto[]): void {
    for (let i = 0; i < Konten.length; i++) {
        kontoübersicht(Konten[i]);
    }
}

// Hauptprogramm-Logik
let p: string | null;

do {
    // Formatierter Prompt-String über mehrere Zeilen
    p = prompt(`Wähle eine Option:
[0] Beenden               // Programm beenden
[1] Kontenübersicht       // Alle Konten und deren Daten anzeigen
[2] Kontoübersicht        // Ein bestimmtes Konto anzeigen (Eingabe der IBAN erforderlich)
[3] Einzahlen             // Geld auf ein Konto einzahlen (Eingabe von IBAN und Betrag erforderlich)
[4] Auszahlen             // Geld von einem Konto abheben (Eingabe von IBAN, PIN und Betrag erforderlich)
[5] Überweisung           // Geld von einem Konto auf ein anderes überweisen (Eingabe von Quell-IBAN, Ziel-IBAN, PIN und Betrag erforderlich)
`);

    switch (p) {
        case '1': // Option 1: Alle Konten anzeigen
            kontenübersicht(Konten);
            break;
        case '2': { // Option 2: Einzelnes Konto anzeigen
            const konto = getKonto(Konten, prompt("Bitte geben Sie die IBAN ein:") || "");
            if (konto) kontoübersicht(konto);
            break;
        }
        case '3': { // Option 3: Geld auf ein Konto einzahlen
            const konto = getKonto(Konten, prompt("Bitte geben Sie die IBAN ein:") || "");
            const betrag = parseFloat(prompt("Bitte geben Sie den Betrag ein:") || "0");
            if (konto && !isNaN(betrag)) einzahlen(konto, betrag);
            break;
        }
        case '4': { // Option 4: Geld von einem Konto abheben
            const konto = getKonto(Konten, prompt("Bitte geben Sie die IBAN ein:") || "");
            const betrag = parseFloat(prompt("Bitte geben Sie den Betrag ein:") || "0");
            const pin = parseInt(prompt("Bitte geben Sie die PIN ein:") || "0");
            if (konto && !isNaN(betrag) && !isNaN(pin)) auszahlen(konto, betrag, pin);
            break;
        }
        case '5': { // Option 5: Überweisung durchführen
            const srcKonto = getKonto(Konten, prompt("Bitte geben Sie die Quell-IBAN ein:") || "");
            const destKonto = getKonto(Konten, prompt("Bitte geben Sie die Ziel-IBAN ein:") || "");
            const betrag = parseFloat(prompt("Bitte geben Sie den Betrag ein:") || "0");
            const pin = parseInt(prompt("Bitte geben Sie die PIN ein:") || "0");
            if (srcKonto && destKonto && !isNaN(betrag) && !isNaN(pin)) {
                überweisung(srcKonto, destKonto, betrag, pin);
            }
            break;
        }
    }
} while (p !== '0'); // Schleife läuft weiter, bis der Benutzer '0' eingibt