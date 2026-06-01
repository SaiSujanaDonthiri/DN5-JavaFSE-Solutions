console.log("Welcome to the Community Portal");
window.onload = function(){
    alert("Page Fully Loaded");
}
/* Data Types */
const eventName = "Music Fest";
const eventDate = "2026-08-10";
let seats = 5;
console.log(`${eventName} on ${eventDate}`);
/* Event Array */
const events = [
    {
        name:"Music Event",
        category:"Music",
        seats:5,
        date:"2026-08-10"
    },
    {
        name:"Workshop on Baking",
        category:"Workshop",
        seats:0,
        date:"2024-01-01"
    }
];

/* Conditionals and Loops */
events.forEach(event => {
    if(event.seats > 0){
        displayEvent(event);
    }
});

/* Try Catch */
function registerUser(eventName){
    try{
        if(seats <= 0){
            throw "No Seats Available";
        }
        seats--;
        alert("Registered for " + eventName);
    }
    catch(error){
        console.log(error);
    }
}

/* Functions */
function addEvent(event){
    events.push(event);
}
function filterEventsByCategory(category, callback){
    let filtered = events.filter(
        event => event.category === category
    );
    callback(filtered);
}

/* Closure */
function registrationTracker(){
    let total = 0;
    return function(){
        total++;
        return total;
    }
}
const countRegistration = registrationTracker();

/* Object and Prototype */
class Event{
    constructor(name, seats){
        this.name = name;
        this.seats = seats;
    }
}
Event.prototype.checkAvailability = function(){
    return this.seats > 0;
}
const sampleEvent = new Event("Dance Event",10);
console.log(sampleEvent.checkAvailability());
console.log(Object.entries(sampleEvent));

/* Array Methods */
events.push({
    name:"Art Event",
    category:"Art",
    seats:10
});
const musicEvents = events.filter(
    event => event.category === "Music"
);
const cards = events.map(
    event => `Workshop on ${event.name}`
);
console.log(cards);

/* DOM Manipulation */
const container = document.querySelector("#eventContainer");
function displayEvent(event){
    const card = document.createElement("div");
    card.className = "eventCard";
    card.innerHTML = `
        <h3>${event.name}</h3>
        <p>Category: ${event.category}</p>
        <p>Seats: ${event.seats}</p>
        <button onclick="registerUser('${event.name}')">
            Register
        </button>
    `;
    container.appendChild(card);
}

/* Event Handling */
document.querySelector("#categoryFilter")
.onchange = function(){
    container.innerHTML = "";
    if(this.value === "all"){
        events.forEach(displayEvent);
    }
    else{
        filterEventsByCategory(
            this.value,
            filtered => {
                filtered.forEach(displayEvent);
            }
        );
    }
}

/* Keydown Event */

document.querySelector("#searchBox")
.addEventListener("keydown", function(){
    console.log("Searching...");
});

/* Async JS */

document.querySelector("#loading").style.display = "block";
fetch("https://jsonplaceholder.typicode.com/posts")
.then(response => response.json())
.then(data => {
    console.log(data);
    document.querySelector("#loading")
    .style.display = "none";
})
.catch(error => console.log(error));

/* Async Await */

async function fetchEvents(){
    try{
        const response = await fetch(
            "https://jsonplaceholder.typicode.com/posts"
        );
        const data = await response.json();
        console.log(data);
    }
    catch(error){
        console.log(error);
    }
}
fetchEvents();

/* Destructuring */
const {name, category} = events[0];
console.log(name, category);

/* Spread Operator */

const clonedEvents = [...events];
console.log(clonedEvents);

/* Form Handling */

document.querySelector("#registrationForm")
.addEventListener("submit", function(event){
    event.preventDefault();
    const form = event.target;
    const username = form.elements["username"].value;
    const email = form.elements["email"].value;
    const selectedEvent = form.elements["eventName"].value;
    if(username === "" || email === ""){
        document.querySelector("#message")
        .innerHTML = "All fields required";
        return;
    }
    console.log(username, email, selectedEvent);

    /* AJAX POST */
    setTimeout(() => {
        fetch(
            "https://jsonplaceholder.typicode.com/posts",
            {
                method:"POST",
                body:JSON.stringify({
                    username,
                    email,
                    selectedEvent
                }),
                headers:{
                    "Content-type":
                    "application/json"
                }
            }
        )
        .then(response => response.json())
        .then(data => {
            document.querySelector("#message")
            .innerHTML = "Registration Successful";
        })
        .catch(error => {
            document.querySelector("#message")
            .innerHTML = "Registration Failed";
        });
    },2000);
});
/* Debugging */

console.log("Form Ready");
/* jQuery */
$("#registerBtn").click(function(){
    $(".eventCard").fadeOut(1000).fadeIn(1000);
});
/* Framework Benefit */
console.log(
"React/Vue provide reusable components and faster UI updates"
);