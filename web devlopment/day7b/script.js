let playerS = 0;
let computerS = 0;

let choices = ["rock", "paper", "scissors"];

function play(playerC) {

    // game logic
    let computerC = choices[Math.floor(Math.random() * 3)];

    let result = "";

    if (playerC === computerC) {
        result = "It's a tie!";
    }
    else if ((playerC === "rock" && computerC === "scissors")
        || (playerC === "paper" && computerC === "rock")
        || (playerC === "scissors" && computerC === "paper")) {
        result = "You win!🏆";
        playerS++;
        
    }
    else {
        result = "You lose! ☠️";
        computerS++;
    }
    // show the results
    document.getElementById("result").innerText = `You chose ${playerC}, and the computer chose ${computerC}. ${result}`;
    // update scores
    document.getElementById("score").innerText = `Player: ${playerS} Computer: ${computerS}`;
    
}