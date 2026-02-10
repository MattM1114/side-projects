let cart = [];

function addtocart(name, price) {
    cart.push({ name, price });
    render();
}

function removefromcart(index) {
    cart.splice(index, 1);
    render();
}

function render() {
    const cartElement = document.getElementById("cart"); // Renamed to avoid conflict
    const totaltxt = document.getElementById("total");

    // Clear the list before re-rendering
    cartElement.innerHTML = "";
    let total = 0;

    cart.forEach((item, index) => {
        const li = document.createElement("li");
        // Use textContent for better security/performance than innerText
        li.textContent = `${item.name} - $${item.price.toFixed(2)} `; 

        const btn = document.createElement("button");
        btn.textContent = "Remove";
        btn.onclick = () => removefromcart(index);
        
        li.appendChild(btn);
        cartElement.appendChild(li);
        
        total += item.price;
    });

    totaltxt.textContent = `Total: $${total.toFixed(2)}`; 
}
