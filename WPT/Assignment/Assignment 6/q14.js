async function fetchData() {
    try {
        const response = await fetch("  ");
        const data = await response.json();
        console.log(data);
    } catch (error) {
        console.log("Error:", error);
    }
}

