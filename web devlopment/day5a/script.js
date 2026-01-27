let sec = 0;
let min = 0;
let hr = 0;
let timer = null;

function updateDisplay() {
    let h = hr < 10 ? "0" + hr : hr;
    let m = min < 10 ? "0" + min : min;
    let s = sec < 10 ? "0" + sec : sec;
    document.getElementById("display").innerText = `${h}:${m}:${s}`;
}

function start() {
    if (timer !== null) return; // prevent multple timers
    
    timer = setInterval(() => {
        sec++;
        if (sec == 60) {
            sec = 0;
            min++;
            if (min == 60) {
                min = 0;
                hr++;
            }
        }
        updateDisplay();
    }, 1000);
}

function stop() {
    clearInterval(timer);
    timer = null;

}

function reset() {
    stop();
    sec = 0;
    min = 0;
    hr = 0;
    updateDisplay()
}