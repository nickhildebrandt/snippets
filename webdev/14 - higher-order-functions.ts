// ===== ÜBUNGEN ZU HIGHER-ORDER FUNCTIONS =====
// Nutze die vorgegebenen Arrays für die Übungen.
// Schreibe deine Lösungen unter jede Aufgabe.

// Beispiel-Arrays zum Arbeiten:
const numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
const words = ['Hund', 'Katze', 'Maus', 'Elefant', 'Giraffe', 'Zebra'];
const people = [
    { name: 'Anna', age: 25, city: 'Berlin' },
    { name: 'Bob', age: 17, city: 'Hamburg' },
    { name: 'Charlie', age: 32, city: 'München' },
    { name: 'David', age: 15, city: 'Berlin' },
    { name: 'Eva', age: 28, city: 'Hamburg' }
];
const movies = [
    { title: 'Matrix', rating: 9.0, genre: 'Sci-Fi' },
    { title: 'Titanic', rating: 8.5, genre: 'Drama' },
    { title: 'Toy Story', rating: 8.7, genre: 'Animation' },
    { title: 'Inception', rating: 8.8, genre: 'Sci-Fi' }
];

// ===== LEVEL 1: forEach =====

// Aufgabe 1.1
// Nutze forEach, um alle Zahlen aus dem numbers-Array in der Konsole auszugeben
// Deine Lösung:
numbers.forEach(number => console.log(number))

// Aufgabe 1.2
// Nutze forEach, um alle Wörter in Großbuchstaben auszugeben
// Deine Lösung:
words.forEach(word => console.log(word.toUpperCase()))

// ===== LEVEL 2: map =====

// Aufgabe 2.1
// Nutze map, um alle Zahlen mit 2 zu multiplizieren
// Deine Lösung:
console.log(numbers.map(number => number*2))

// Aufgabe 2.2
// Nutze map, um ein Array zu erstellen, das die Länge jedes Wortes enthält
// Deine Lösung:
console.log(words.map(word => word.length+1))


// Aufgabe 2.3
// Nutze map, um ein Array mit nur den Namen der Personen zu erstellen
// Deine Lösung:
console.log(people.map(person => person.name))

// ===== LEVEL 3: filter =====

// Aufgabe 3.1
// Nutze filter, um nur die geraden Zahlen zu behalten
// Deine Lösung:
console.log(numbers.filter(number => !(number % 2)))

// Aufgabe 3.2
// Nutze filter, um nur Wörter mit mehr als 4 Buchstaben zu behalten
// Deine Lösung:
console.log(words.filter(word => word.length > 4))

// Aufgabe 3.3
// Nutze filter, um nur die Personen zu behalten, die in Berlin wohnen
// Deine Lösung:
console.log(people.filter(person => person.city === 'Berlin'))

// ===== LEVEL 4: Kombination von map und filter =====

// Aufgabe 4.1
// Filtere erst alle ungeraden Zahlen und multipliziere dann die übrigen mit 3
// Deine Lösung:
console.log(numbers.filter(number => number % 2).map(number => number * 3))

// Aufgabe 4.2
// Filtere alle Personen über 18 und erstelle dann ein Array nur mit ihren Namen
// Deine Lösung:
const names: String[] = people.filter(person => person.age >= 18).map(person => person.name)
console.log(names)

// ===== LEVEL 5: reduce =====

// Aufgabe 5.1
// Nutze reduce, um die Summe aller Zahlen zu berechnen
// Deine Lösung:
console.log((numbers.reduce((number,sum) => sum + number, 0)))

// Aufgabe 5.2
// Nutze reduce, um alle Wörter zu einem Satz zu verbinden (mit Leerzeichen dazwischen)
// Deine Lösung:
console.log((words.reduce((word,str) => str + ` ${word}`, "")))

// Aufgabe 5.3
// Nutze reduce, um das Durchschnittsalter aller Personen zu berechnen
// Deine Lösung:
console.log((people.reduce((avg, person) => avg + person.age / people.length, 0)))

// ===== LEVEL 6: Fortgeschrittene Aufgaben =====

const getScifiAbove: (minRating: number) => string[] = (minRating) => {
    return movies
        .filter(movie => movie.genre === 'Sci-Fi' && movie.rating > minRating)
        .map(movie => movie.title);
}

// Aufgabe 6.1
// Erstelle eine Funktion, die alle Sci-Fi Filme mit einem Rating über 8.5 findet
// und ein Array ihrer Titel zurückgibt
// Deine Lösung:
console.log(getScifiAbove(8.5))


// Aufgabe 6.2
// Gruppiere die Menschen nach Städten mithilfe von reduce
// Erwartetes Ergebnis: { Berlin: [...], Hamburg: [...], München: [...] }
// Deine Lösung:
console.log(people.reduce((avg, person) => ((avg[person.city] = avg[person.city] || []).push(person), avg), {}));
