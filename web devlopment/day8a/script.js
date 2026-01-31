function calculate(operator) {
    // 1. Added quotes to IDs
    let a = Number(document.getElementById("num1").value);
    let b = Number(document.getElementById("num2").value);

    // 2. Declare result variable
    let result;

    if (isNaN(a) || isNaN(b)) {
        document.getElementById("result").innerText = "Please enter valid numbers";
        return;
    }

    if (operator == "+") {
        result = a + b;
    } else if (operator == "-") {
        result = a - b;
    } else if (operator == "*") {
        result = a * b;
    } else if (operator == "/") {
        if (b === 0) {
            document.getElementById("result").innerText = "Cannot divide by 0";
            return;
        } else {
            result = a / b;
        }
    }
    
    // 3. Added closing backtick and closing parenthesis
    document.getElementById("result").innerText = `Result: ${a} ${operator} ${b} = ${result}`;
}