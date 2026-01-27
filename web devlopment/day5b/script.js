let count = 0;
// this updates the display
function updateDisplay() {
    document.getElementById("display").innerText = count;
}
// increase function
function increase() {
    count++;
    updateDisplay();
}
// decrease function
function decrease() {
    count--;
    updateDisplay();
}
// this will rest the count
function reset() {
    count = 0;
    updateDisplay();
}