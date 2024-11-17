
const TAX_RATE = 0.10; 
let cart = [];
function addItem(itemName, price) {
    cart.push(price);
    calculateTotal();
}


function calculateTotal() {
    let total = cart.reduce((sum, price) => sum + price, 0);
    total += total * TAX_RATE;
    console.log(`Total (with tax): RS ${total.toFixed(1)}`);
}


addItem("Book", 500);
addItem("Pen", 10.00);
addItem("phone",15000)


