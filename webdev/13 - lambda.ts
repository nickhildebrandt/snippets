const names: String[] = [
    'Franz',
    'Friedrich',
    'Peter',
    'Joseph',
    'Magdalena',
    'Sam',
]

// 1. Array ausgeben, indem alle Namen in Großbuchstaben geschrieben sind
console.log(names.map(names => names.toUpperCase()))

// 2. Array ausgeben, indem der Anfangsbuchstabe aller Namen ist
console.log(names.map(names => names[0]))

// 3. Array ausgeben, indem alle Namen mit einem 'e' sind
console.log(names.filter(names => names.toLowerCase().includes("e")))
