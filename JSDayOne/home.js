var nameOne = "Name";
var numOne = 1;
var boolOne = true;
nameOne = "Name2";
numOne = 2;
boolOne = false;
console.log("var type: ", nameOne);
console.log("var type: ", numOne);
console.log("var type: ", boolOne);

let nameTwo = "Name";
let numTwo = "1";
let boolTwo = true;
nameTwo = "Name2";
numTwo = 2;
boolTwo = false;
console.log("var type: ", nameTwo);
console.log("var type: ", numTwo);
console.log("var type: ", boolTwo);

const nameThree = "Name";
const numThree = "1";
const boolThree = true;
/* const cannot be changed once declared. Let and var can. Use let and const, not var. */
console.log("var type: ", nameTwo);
console.log("var type: ", numTwo);
console.log("var type: ", boolTwo);

for (let i = 0; i < 10; i++) {
    console.log(i);
}

function example() {
    return "You did it!";
}
console.log(example());

function example2(string) {
    return "That's a very interesting " + string;
}
console.log(example2("car"));

function example3(num1, num2) {
    return num1 + num2;
}
console.log(example3(15, 15));

let person = {
    fn: "Bryce",
    ln: "Northrup",
    job: "Programmer",
    age: 24,
};

function printSomething(p) {
    for (let i in p) {
        console.log("outside of the for loop", i, ": ", p[i]);
    }
}
printSomething(person);

name = "Global";
scope = "This is global";
console.log(name);
console.log(scope);

function check() {
    name = "Local";
    scope = "This is local";
    console.log(name);
    console.log(scope);
}
console.log(name);
console.log(scope);
check();
console.log(name);
console.log(scope);
console.log(
    "\nThere are four print statements for name and scope. the first two return as global. after check is called global is reassigned to local var's declared in check().\n",
    "Or, in plain english, once check() is called, the variable is reassigned globally."
);

let num1 = 3;
let num2 = 3;

// Comparison operators
// ==   compares two values to see if they are the same. Compares values and ignores type.
console.log(3 == 3);
console.log(num1 == num2);
console.log(3 == "3");
// ===  compares two values to see if they are the EXACT same. Compares values and does NOT ignore type.
console.log(3 === 3);
console.log(num1 === num2);
console.log(3 === "3");

let score = 90;
let score2 = 70;

function checkPass(num) {
    if (num > 80) {
        return true;
    } else if (num < 80) {
        return false;
    }
}
checkPass(score) ? console.log("You passed!") : console.log("You failed!");
checkPass(score2) ? console.log("You passed!") : console.log("You failed!");

userInput = prompt("Enter your name");
userInput2 = prompt("Hello " + userInput + "! What's your lucky number?");
console.log(userInput);
console.log(userInput2);

let myLuckyNumber = userInput2;

if (myLuckyNumber == 8 || myLuckyNumber == 6) {
    console.log("That's almost my lucky number!");
} else if (myLuckyNumber == 7) {
    console.log("That's my lucky number too!");
} else {
    console.log("That's not a lucky number!");
}