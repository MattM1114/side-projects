const emojis = ["🍎", "🍌", "🍊", "🍇"];
let cards = [...emojis, ...emojis];
let firstCard = null;
let secondCard = null;
let lockBoard = false;

const game = document.getElementById("game");

function shuffle(array) {
    // Fixed: .sort instead of .sory
    return array.sort(() => Math.random() - 0.5);
}

function createBoard() { // Fixed: added 'e' to createBoard
    game.innerHTML = "";
    shuffle(cards);

    cards.forEach(emoji => {
        const card = document.createElement("div");
        card.classList.add("card");
        // Fixed: Assign the emoji to the dataset value
        card.dataset.value = emoji; 

        card.addEventListener("click", flipCard);
        game.append(card);
    });
}

function flipCard() {
    if (lockBoard || this === firstCard || this.classList.contains("flipped")) return;

    // Show the emoji
    this.innerText = this.dataset.value;
    this.classList.add("flipped");

    if (!firstCard) {
        firstCard = this;
        return;
    }

    secondCard = this;
    checkForMatch();
}

function checkForMatch() {
    let isMatch = firstCard.dataset.value === secondCard.dataset.value;

    if (isMatch) {
        resetSelection(); // Fixed: spelling
    } else {
        lockBoard = true;
        setTimeout(() => {
            firstCard.innerText = "";
            secondCard.innerText = "";
            firstCard.classList.remove("flipped");
            secondCard.classList.remove("flipped");
            resetSelection(); 
        }, 800);
    }
}

function resetSelection() {
    [firstCard, secondCard] = [null, null];
    lockBoard = false;
}

createBoard();