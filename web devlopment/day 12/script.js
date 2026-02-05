const form = document.getElementById("login");
const message = document.getElementById("message");

form.addEventListener("submit", validate);

function validate(event) {
    event.preventDefault();

    const email = document.getElementById("email").value.trim();
    const password = document.getElementById("password").value.trim();

    if (email === "" || password === "") {
        message.innerText = "all fields are required";
        message.style.color = "red";
        return;
    }
    if (!email.includes("@")) {
        message.innerText = "invalid email address";
        message.style.color = "red";
        return;



    }
    if (password.length < 6) { 
        message.innerText = "Password must be at least 6 characters long";
        message.style.color = "red";
        return;

    }
    message.innerText = "Login successful!";
    message.style.color = "lime";



}
