const houseInput = document.getElementById("house");
const title = document.querySelector("h1");

const houses = {
    Gryffindor: 'red',
    Slytherin: 'green',
    Hufflepuff: 'yellow',
    Ravenclaw: 'blue'
}

function handleChange(event){
    const chosenHouse = event.target.value;
    const color = houses[chosenHouse] || 'black';
    title.style.color = color;
}

houseInput.addEventListener("change", handleChange);