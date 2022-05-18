function makeGrid() {
    input = prompt("Enter the width!");
    let width = Number(input);
    console.log(width);
    input2 = prompt("Enter the height!");
    let height = Number(input2);
    console.log(height);

    let lineString = "";

    for (let x = 0; x < width; x++) {
        lineString += "*";
        continue;
    }
    for (let y = 0; y < height; y++) {
        console.log(lineString);
    }
}

function makeCheckerBoard() {
    input = prompt("Enter the width!");
    let width = Number(input);
    console.log(width);
    input2 = prompt("Enter the height!");
    let height = Number(input2);
    console.log(height);

    var size = height;
    var board = "";
    for (var y = 0; y < height; y++) {
        for (var x = 0; x < width; x++) {
            if ((x + y) % 2 == 0) board += "*";
            else board += " ";
        }
        board += "\n";
    }

    console.log(board);
}

function makeCross() {
    input = prompt("Enter the cross size");
    let height = Number(input);
    console.log(height);
    height % 2 == 0 ?
        (halfHeight = height / 2) :
        (halfHeight = Math.floor(height / 2));
    console.log(halfHeight);
    let initLine = "";
    for (let x = 0; x < height; x++) {
        initLine += " ";
        continue;
    }
    console.log(initLine);
    let array = initLine.split("");
    let y = 0;
    while (y < halfHeight) {
        array[y] = "*";
        array[y - 1] = " ";
        let array2 = array.reverse();
        array.push(array2);
        console.log(array.join(""));
        y++;
        continue;
    }
    height % 2 == 0 ? console.log("**") : console.log("*");
    while (y < halfHeight) {
        array[y] = "*";
        array[array.length - y] = "*";
        array[y - 1] = " ";
        array[array.length - (y + 1)] = " ";
        console.log(array.join(""));
        y++;
        continue;
    }
}