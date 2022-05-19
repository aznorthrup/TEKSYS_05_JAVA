let divOne = document.createElement("div");
divOne.id = "leftBox";
divOne.className = "textBox";
let divTwo = document.createElement("div");
divTwo.id = "rightBox";
divTwo.className = "textBox";
let leftDiv = document.createElement("div");
let rightDiv = document.createElement("div");
leftDiv.id = "leftSide";
rightDiv.id = "rightSide";

let textBoxOne = document.createElement("div");

let leftMessageBox = document.createElement("input");
leftMessageBox.setAttribute("id", "inputBox1");
leftMessageBox.setAttribute("type", "text");
leftMessageBox.setAttribute("placeholder", "Enter a message...");
leftMessageBox.addEventListener("keypress", function(e) {
    if (e.key == "Enter") {
        leftSendMessage();
    }
});

let leftButton = document.createElement("button");
leftButton.setAttribute("id", "button1");
leftButton.textContent = "Send";
leftButton.addEventListener("click", leftSendMessage());

function leftSendMessage() {
    let text = leftMessageBox.value;
    let temp = divOne.innerHTML;
    let add = `<p id="sent">You: ${text}</p>`;
    add += temp;
    divOne.innerHTML = add;

    let text2 = leftMessageBox.value;
    let temp2 = divTwo.innerHTML;
    let add2 = `<p id="received">Them: ${text2}</p>`;
    add2 += temp2;
    divTwo.innerHTML = add2;

    leftMessageBox.value = "";
}

textBoxOne.appendChild(leftMessageBox);
textBoxOne.appendChild(leftButton);

let textBoxTwo = document.createElement("div");

let rightMessageBox = document.createElement("input");
rightMessageBox.setAttribute("id", "inputBox2");
rightMessageBox.setAttribute("type", "text");
rightMessageBox.setAttribute("placeholder", "Enter a message...");
rightMessageBox.addEventListener("keypress", function(e) {
    if (e.key == "Enter") {
        rightSendMessage();
    }
});

let rightButton = document.createElement("button");
rightButton.setAttribute("id", "button2");
rightButton.textContent = "Send";
rightButton.addEventListener("click", rightSendMessage());

function rightSendMessage() {
    let text = rightMessageBox.value;
    let temp = divTwo.innerHTML;
    let add = `<p id="sent">You: ${text}</p>`;
    add += temp;
    divTwo.innerHTML = add;

    let text2 = rightMessageBox.value;
    let temp2 = divOne.innerHTML;
    let add2 = `<p id="received">Them: ${text2}</p>`;
    add2 += temp2;
    divOne.innerHTML = add2;

    rightMessageBox.value = "";
}
divOne.innerHTML = "";
divTwo.innerHTML = "";
textBoxTwo.appendChild(rightMessageBox);
textBoxTwo.appendChild(rightButton);

document.body.appendChild(leftDiv);
document.body.appendChild(rightDiv);
document.getElementById("leftSide").appendChild(divOne);
document.getElementById("leftSide").appendChild(textBoxOne);
document.getElementById("rightSide").appendChild(divTwo);
document.getElementById("rightSide").appendChild(textBoxTwo);

document.body.style.backgroundColor = "black";
document.body.style.display = "flex";
document.body.style.justifyContent = "space-around";

document.getElementById("rightBox").style.width = "95%";
document.getElementById("rightBox").style.height = "300px";
document.getElementById("rightBox").style.backgroundColor = "aliceblue";
document.getElementById("rightBox").style.border = "4px solid darkslateblue";
document.getElementById("rightBox").style.display = "flex";
document.getElementById("rightBox").style.flexDirection = "column-reverse";

document.getElementById("leftBox").style.width = "95%";
document.getElementById("leftBox").style.height = "300px";
document.getElementById("leftBox").style.backgroundColor = "aliceblue";
document.getElementById("leftBox").style.border = "4px solid darkslateblue";
document.getElementById("leftBox").style.display = "flex";
document.getElementById("leftBox").style.flexDirection = "column-reverse";