const btn = document.getElementById("btn");
const avatar = document.getElementById("avatar");
const nametxt = document.getElementById("name");
const email = document.getElementById("email");
const country = document.getElementById("country");

btn.addEventListener("click", getUser);

async function getUser() {
    nametxt.innerText = "Loading...";
    email.innerText = "Loading...";
    country.innerText = "Loading...";
    avatar.src = "";

    try {
        const response = await fetch(`https://randomuser.me/api/`);
        const data = await response.json();
        
        const user = data.results[0];
        avatar.src = user.picture.large;

        nametxt.innerText = `${user.name.first} ${user.name.last}`;
        email.innerText = user.email;
        country.innerText = user.location.country;

    } catch (error) {
        nametxt.innerText = "Error";
    }


}
