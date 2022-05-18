function addVals() {
    input = prompt(
        "Enter a collection on numbers separated by spaces to add them"
    );
    numArray = input.split(" ");
    answer = 0;
    numArray.forEach((n) => (answer += Number(n)));
    console.log(answer);
}

function calculate() {
    input = prompt(
        "Enter a mathematical formula with only + and - to be calculated"
    );
    numArray = input.split(" ");
    start = Number(numArray[0]);
    for (let x = 0; x < numArray.length; x++) {
        if (numArray[x] == "+") {
            start += Number(numArray[x + 1]);
            continue;
        } else if (numArray[x] == "-") {
            start -= Number(numArray[x + 1]);
            continue;
        } else {
            continue;
        }
    }
    console.log(start);
}

function calculate2() {
    input = prompt(
        "Enter mathematical formulas with only + and - to be calculated. Ending with ; and with spaces between each value"
    );
    numArray = input.split(" ");
    start = Number(numArray[0]);
    for (let x = 0; x < numArray.length; x++) {
        if (numArray[x] == "+") {
            start += Number(numArray[x + 1]);
            continue;
        } else if (numArray[x] == "-") {
            start -= Number(numArray[x + 1]);
            continue;
        } else if (numArray[x] == ";") {
            console.log(start);
            start = Number(numArray[x + 1]);
            continue;
        }
    }
}

function calculate2() {
    input = prompt(
        "Enter mathematical formulas with only + and - to be calculated. Ending with ; and with spaces between each value"
    );
    numArray = input.split(" ");
    start = Number(numArray[0]);
    for (let x = 0; x < numArray.length; x++) {
        if (numArray[x] == "+") {
            start += Number(numArray[x + 1]);
            continue;
        } else if (numArray[x] == "-") {
            start -= Number(numArray[x + 1]);
            continue;
        } else if (numArray[x] == ";") {
            console.log(start);
            start = Number(numArray[x + 1]);
            continue;
        }
    }
}

function calculate3() {
    input = prompt(
        "Enter mathematical formulas with only +, -, and ^ to be calculated. Ending with ; and with spaces between each value"
    );
    numArray = input.split(" ");
    newNumArray = [];
    for (let y = 0; y < numArray.length; y++) {
        if (RegExp("[\\^]$").test(numArray[y])) {
            let newNum = numArray[y].slice(0, -1);
            let finish = Number(newNum) * Number(newNum);
            newNumArray.push(Number(finish));
            continue;
        } else {
            newNumArray.push(numArray[y]);
            continue;
        }
    }
    start = Number(newNumArray[0]);
    for (let x = 0; x < newNumArray.length; x++) {
        if (newNumArray[x] == "+") {
            start += Number(newNumArray[x + 1]);
            continue;
        } else if (newNumArray[x] == "-") {
            start -= Number(newNumArray[x + 1]);
            continue;
        } else if (newNumArray[x] == ";") {
            console.log(start);
            start = newNumArray[x + 1];
            continue;
        }
    }
}