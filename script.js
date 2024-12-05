document.addEventListener("DOMContentLoaded", () => {
    const calculatorContainer = document.getElementById("calculator-container");

    // Create calculator layout using DOM
    const createCalculatorLayout = () => {
        // Display
        const display = document.createElement("input");
        display.setAttribute("type", "text");
        display.setAttribute("id", "calc-display");
        display.setAttribute("readonly", "true");
        display.className = "form-control mb-3 text-right";

        // Buttons
        const buttonValues = [
            ["7", "8", "9", "/"],
            ["4", "5", "6", "*"],
            ["1", "2", "3", "-"],
            ["C", "0", "=", "+"],
            ["M+", "M-", "MC"]
        ];
        const buttonContainer = document.createElement("div");
        buttonValues.forEach(row => {
            const rowDiv = document.createElement("div");
            rowDiv.className = "d-flex justify-content-between mb-2";
            row.forEach(value => {
                const button = document.createElement("button");
                button.textContent = value;
                button.className = "btn btn-primary flex-fill mx-1";
                button.setAttribute("data-value", value);
                rowDiv.appendChild(button);
            });
            buttonContainer.appendChild(rowDiv);
        });

        // Add elements to container
        calculatorContainer.appendChild(display);
        calculatorContainer.appendChild(buttonContainer);
    };

    // Calculator logic
    const evaluateExpression = (expression) => {
        try {
            return eval(expression);
        } catch {
            return "Error";
        }
    };

    const handleButtonClick = (value) => {
        const display = document.getElementById("calc-display");
        if (value === "C") {
            display.value = "";
        } else if (value === "=") {
            display.value = evaluateExpression(display.value);
        } else {
            display.value += value;
        }
    };

    const handleKeyboardInput = (e) => {
        const display = document.getElementById("calc-display");
        if (e.key >= "0" && e.key <= "9") {
            display.value += e.key;
        } else if (["+", "-", "*", "/", "%"].includes(e.key)) {
            display.value += e.key;
        } else if (e.key === "Enter") {
            display.value = evaluateExpression(display.value);
        } else if (e.key === "Backspace") {
            display.value = display.value.slice(0, -1);
        } else {
            alert("Only numbers and basic operators are allowed.");
            e.preventDefault();
        }
    };

    let memory = 0;

const handleMemoryFunction = (value) => {
    const display = document.getElementById("calc-display");
    if (value === "M+") {
        memory += parseFloat(display.value) || 0;
    } else if (value === "M-") {
        memory -= parseFloat(display.value) || 0;
    } else if (value === "MC") {
        memory = 0;
    }
    alert(`Memory: ${memory}`);
};




    // Initialize layout and events
    createCalculatorLayout();
    document.querySelectorAll("button").forEach(button =>
        button.addEventListener("click", (e) =>
            handleButtonClick(e.target.getAttribute("data-value"))
        )
    );
    document.addEventListener("keydown", handleKeyboardInput);
});
