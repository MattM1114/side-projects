const toggleBtn = document.getElementById("switch");

if (localStorage.getItem("theme")==="dark") {
    document.body.classList.add("dark");
}

toggleBtn.addEventListener("click", () => {
    document.body.classList.toggle("dark");
    
    if (document.body.classList.contains("dark")) {
        localStorage.setItem("theme", "dark");
    } else {
        localStorage.setItem("theme", "light");
    }
});

const text = document.getElementById("text").innerText;
const input = document.getElementById("input");
const result = document.getElementById("result");

let start = null;

input.addEventListener("input", () => {
    if (!start) {
        start = Date.now();
    }
    if (input.value === text) {
        let end = (Date.now() - start) / 1000;
        let words = text.split(" ").length;
        let wpm = Math.round((words / end) * 60);
        
        result.innerText = `You typed ${wpm} words per minute.`;
        input.disabled = true;

    }
});
