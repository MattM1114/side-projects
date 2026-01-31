const password=document.getElementById("password");
const strength=document.getElementById("strength");

password.addEventListener("input", checkStrength);

function checkStrength() {
    let val = password.value;
    let score = 0;

    if (val.length >= 8) score++;
    if (/[0-9]/.test(val)) score++;
    if (/[!@#$%^&*]/.test(val)) score++;

    if (score === 0) {
        strength.innerText = "";
        strength.style.color = "red";
    }
    else if (score === 1) {
        strength.innerText = "Weak";
        strength.style.color = "red";
    } else if (score === 2) {
        strength.innerText = "Medium";
        strength.style.color = "orange";
    } else if (score === 3) {
        strength.innerText = "strong";
        strength.style.color = "lime";
    }
}
