const searchBtn = document.getElementById("search");

searchBtn.addEventListener("click", getWeather);

async function getWeather() {
    const city = document.getElementById("city").value;

    if (!city) return;

    const apiKey = "YOUR_API_KEY";
    const url = `https://api.openweathermap.org/data/2.5/weather?q=${city}&units=metric&appid=${apiKey}`;

    document.getElementById("location").innerText = "Loading...";
    document.getElementById("temperature").innerText = "";
    document.getElementById("condition").innerText = "";

    try {
        const response = await fetch(url);

        if (!response.ok) {
            throw new Error("City not found");
        }

        const data = await response.json();

        document.getElementById("location").innerText =
            `${data.name}, ${data.sys.country}`;

        document.getElementById("temperature").innerText =
            `Temperature: ${data.main.temp} °C`;

        document.getElementById("condition").innerText =
            `Condition: ${data.weather[0].main}`;

    } catch (error) {
        document.getElementById("location").innerText = "City not found ❌";
    }
}
