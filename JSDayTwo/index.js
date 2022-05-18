console.log("Part 1: Object declaration\n\n");
let person = {
    firstName: "Edmund",
    lastName: "Dantes",
    age: 33,
    fullName: function() {
        return this.firstName + " " + this.lastName;
    },
};
console.log(person.firstName);
console.log(person.lastName);
console.log(person.age);
console.log(person.fullName());
console.log("\n\n\n");

console.log("Part 2: Object modification\n\n");

function Person(firstName, lastName, age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.lifeUpdate = function(first, last, age) {
        this.firstName = first;
        this.lastName = last;
        this.age = age;
    };
    this.fullName = function() {
        return this.firstName + " " + this.lastName + " " + this.age;
    };
}

let person2 = new Person("Edmond", "Dantes", 19);
console.log(person2.fullName());
person2.lifeUpdate("Sinbad", "Le Marin", 33);
console.log(person2.fullName());
person2.lifeUpdate("Abbe", "Busoni", 34);
console.log(person2.fullName());
person2.lifeUpdate("Lord", "Wilmore", 35);
console.log(person2.fullName());
person2.lifeUpdate("Le Comte", "De Monte Cristo", 40);
console.log(person2.fullName());
console.log("\n\n\n");

console.log("Part 3: Object prototyping\n\n");
Person.prototype.firstName = "Edmond";
Person.prototype.lastName = "Dantes";
Person.prototype.fullName = function() {
    return this.firstName + " " + this.lastName;
};
Person.prototype.age = 50;
console.log(Person.prototype.fullName());
console.log(Person.prototype.age);
console.log("\n\n\n");

console.log("Part 4: Array declaration\n\n");
let namesAndNumbers = [
    "PersonOne",
    "PersonTwo",
    "PersonThree",
    "PersonFour",
    1,
    2,
    3,
    4,
];
console.log(namesAndNumbers[0], namesAndNumbers[4]);
console.log(namesAndNumbers[1], namesAndNumbers[5]);
console.log(namesAndNumbers[2], namesAndNumbers[6]);
console.log(namesAndNumbers[3], namesAndNumbers[7]);
console.log("\n\n\n");

console.log("Part 5: JSON\n\n");
let array = [{ firstName: "Mercedes" }, { lastName: "Mondego" }, { age: 30 }];
console.log(array[0]);
console.log(array[1]);
console.log(array[2]);
console.log(array.length);
console.log("pop");
console.log(array.pop());
console.log(array.length);
console.log("shift");
console.log(array.shift());
console.log(array.length);
console.log("push");
array.push("add-on end");
console.log(array[array.length - 1]);
console.log(array.length);
console.log("unshift");
array.unshift("add-on beginning");
console.log(array[0]);
console.log(array.length);
console.log(array[0]);
console.log(array[1]);
console.log(array[2]);
console.log("\n\n\n");

console.log("Part 6: Why not reverse a word\n\n");

function revWord(word) {
    console.log(word);
    console.log(word.split(""));
    console.log(word.split("").reverse());
    console.log(word.split("").reverse().join(""));
}

let [wordOne, wordTwo] = ["Example", "Interesting"];
let [numOne, numTwo] = [123456, 456789];
revWord(wordOne);
revWord(wordTwo);
console.log("\n\n\n");

console.log("Part 7: Slice 'n Splice\n\n");
let str = "anything";
console.log(str);
console.log(str.slice(0, 3));
console.log("Before:");
console.log(namesAndNumbers[0], namesAndNumbers[4]);
console.log(namesAndNumbers[1], namesAndNumbers[5]);
console.log(namesAndNumbers[2], namesAndNumbers[6]);
console.log(namesAndNumbers[3], namesAndNumbers[7]);
console.log(namesAndNumbers.splice(4, 0, "PersonFive", "PersonSix"));
console.log("After one splice:");
console.log(namesAndNumbers[0], namesAndNumbers[6]);
console.log(namesAndNumbers[1], namesAndNumbers[7]);
console.log(namesAndNumbers[2], namesAndNumbers[8]);
console.log(namesAndNumbers[3], namesAndNumbers[9]);
console.log(namesAndNumbers[4]);
console.log(namesAndNumbers[5]);
console.log(namesAndNumbers.splice(10, 0, 5, 6));
console.log("After two splices:");
console.log(namesAndNumbers[0], namesAndNumbers[6]);
console.log(namesAndNumbers[1], namesAndNumbers[7]);
console.log(namesAndNumbers[2], namesAndNumbers[8]);
console.log(namesAndNumbers[3], namesAndNumbers[9]);
console.log(namesAndNumbers[4], namesAndNumbers[10]);
console.log(namesAndNumbers[5], namesAndNumbers[11]);
console.log("\n\n\n");

console.log("Part 8: Dates\n\n");
var date = new Date();
console.log(date.getMonth());
console.log(date.getFullYear());
console.log(date.getTime());
console.log(
    date.getHours() +
    ":" +
    date.getMinutes() +
    ":" +
    date.getSeconds() +
    "." +
    date.getMilliseconds()
);
console.log("\n\n\n");

console.log("Part 8: Loop through array\n\n");
let arr = [];
for (let x = 1; x < 11; x++) {
    arr.push(x);
    continue;
}
console.log(arr);
let newArr = [];
for (let i of arr) {
    if (i >= 5) {
        newArr.push(i);
        continue;
    }
}
console.log(newArr);

const addOneECMA6 = (a) => a + 1;
console.log(addOneECMA6(2));

function addOneNotECMA6(a) {
    return a + 1;
}
console.log(addOneNotECMA6(2));

let arr2 = ["Look", "At", "This", "Silly", "Little", "Loop"];
arr2.forEach((n) => console.log(n));

let input = prompt("Enter a range from 10-30");
let range = input.split(" ");
let guessNumber = Math.floor(
    Math.random() * (Number(range[1]) - Number(range[0]) + Number(range[0]))
);
let stop = 0;
console.log(guessNumber);
let userGuess = prompt(`Guess a number between ${range[0]} and ${range[1]}`);

while (stop < 10) {
    if (guessNumber == userGuess) {
        alert(`Correct! The number was ${userGuess}`);
        break;
    }
    stop++;
    userGuess = prompt(
        `Keep guessing a number between ${range[0]} and ${range[1]}`
    );
    continue;
}
if (guessNumber != userGuess) {
    alert(`Sorry, the answer was ${guessNumber}`);
}