// Array of quotes
let quotes = [
    "Code is like humor. When you have to explain it, it’s bad.",
    "First, solve the problem. Then, write the code.",
    "Java is to JavaScript what car is to Carpet.",
    "Programming is thinking, not typing.",
    "Simplicity is the soul of efficiency."
];

function getQuote() {
    let randomIndex = Math.floor(Math.random() * quotes.length);
    let randomQuote = quotes[randomIndex];
    document.getElementById("quote").innerText = randomQuote;
}