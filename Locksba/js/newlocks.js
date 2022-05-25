let submitLock = document.getElementById("submit_lock");
let new_brand = document.getElementsByTagName("select")[0];
let new_model = document.getElementsByTagName("input")[0];
let new_sec = document.getElementsByTagName("select")[1];
let new_purp = document.getElementsByTagName("input")[1];

window.onbeforeunload = function() {
    localStorage.setItem("brands", JSON.stringify(lockBrandArray));
    localStorage.setItem("models", JSON.stringify(lockModelArray));
    localStorage.setItem("securities", JSON.stringify(lockSecurityArray));
    localStorage.setItem("purposes", JSON.stringify(lockPurposeArray));
};

let lockBrandArray = [];
let lockModelArray = [];
let lockSecurityArray = [];
let lockPurposeArray = [];

let lockBrandArrayLoad = localStorage.getItem("brands");
let lockModelArrayLoad = localStorage.getItem("models");
let lockSecurityArrayLoad = localStorage.getItem("securities");
let lockPurposeArrayLoad = localStorage.getItem("purposes");
lockBrandArray = JSON.parse(lockBrandArrayLoad);
lockModelArray = JSON.parse(lockModelArrayLoad);
lockSecurityArray = JSON.parse(lockSecurityArrayLoad);
lockPurposeArray = JSON.parse(lockPurposeArrayLoad);

function loadLocks() {
    let allCards = document.querySelector(".container");
    allCards.innerHTML = "";
    for (let i = 0; i < lockBrandArray.length; i++) {
        let currCards = document.querySelector(".container").innerHTML;
        allCards.innerHTML =
            `<div id="card" class="boxes" style="background-image: url('/css/${lockBrandArray[i]}.jpg');">
        <div class="card-content">
        <p class="lighter">${lockBrandArray[i]}<br> ${lockModelArray[i]}
        <br> Security:${lockSecurityArray[i]}
        <br> Purpose:${lockPurposeArray[i]}
        <br></p>
        <button id="delete_lock" onclick="deleteLock(${i})">Delete</button>
                </div>
            </div>` + currCards;
    }
}

loadLocks();

submitLock.addEventListener("click", (e) => {
    e.preventDefault();
    addLock(new_brand.value, new_model.value, new_sec.value, new_purp.value);
    new_brand.value = "";
    new_model.value = "";
    new_sec.value = "";
    new_purp.value = "";
    loadLocks();
});

function addLock(vala, valb, valc, vald) {
    lockBrandArray.push(vala);
    lockModelArray.push(valb);
    lockSecurityArray.push(valc);
    lockPurposeArray.push(vald);
}

function deleteLock(pos) {
    for (let x = 0; x < lockBrandArray.length; x++) {
        if (x == pos) {
            lockBrandArray.splice(pos, 1);
            lockModelArray.splice(pos, 1);
            lockSecurityArray.splice(pos, 1);
            lockPurposeArray.splice(pos, 1);
            loadLocks();
        }
    }
}

var modal = document.getElementById("myModal");
var btn = document.getElementById("myBtn");
var span = document.getElementsByClassName("close")[0];
btn.onclick = function() {
    modal.style.display = "block";
};
span.onclick = function() {
    modal.style.display = "none";
};
window.onclick = function(event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
};