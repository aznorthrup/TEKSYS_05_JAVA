const feedbackForm = document.getElementById("feedbackForm");
let br = document.createElement("br");
const btn = document.getElementById("submit_button");
const header = document.getElementById("feedback_prompt");
btn.addEventListener("click", (event) => {
    event.preventDefault();
    feedbackForm.style.display = "none";
    header.innerHTML = "Thank you for reaching out! :)";
    header.style.color = "lightblue";
    header.style.fontSize = "225%";
    header.style.transition = "0.5s";
});