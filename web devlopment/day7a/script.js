        // Top-level variables (only created once)
        let secret = Math.floor(Math.random() * 100) + 1;
        let attempts = 0;
        const resultEl = document.getElementById('result');
        const inputEl = document.getElementById('guess');
        const guessBtn = document.getElementById('guessBtn');
        const resetBtn = document.getElementById('resetBtn');

        console.log("Game started — secret:", secret); // for debugging; remove later

        // Attach event listeners (better than inline onclick)
        guessBtn.addEventListener('click', check);
        resetBtn.addEventListener('click', resetGame);

        function check() {
            // Read raw input value (string)
            const raw = inputEl.value;

            // Validate: empty input or non-number should warn user, not silently return
            if (raw === '') {
                resultEl.innerText = "Enter a number between 1 and 100.";
                return;
            }

            // Convert to number and validate range
            const user = Number(raw);
            if (Number.isNaN(user) || user < 1 || user > 100) {
                resultEl.innerText = "Please enter a valid number (1-100).";
                return;
            }

            attempts++;
            console.log("secret:", secret, "user:", user, "attempts:", attempts);

            if (user === secret) {
                resultEl.innerText = `🎉 Correct! It took you ${attempts} tries.`;
                // optionally disable guessing until reset:
                // guessBtn.disabled = true;
            } else if (user > secret) {
                resultEl.innerText = "Too high! Try again.";
            } else {
                resultEl.innerText = "Too low! Try again.";
            }
        }

        function resetGame() {
            secret = Math.floor(Math.random() * 100) + 1;
            attempts = 0;
            inputEl.value = '';
            resultEl.innerText = "Game reset! Guess again.";
            console.log("Game reset — new secret:", secret);
            // guessBtn.disabled = false;
        }