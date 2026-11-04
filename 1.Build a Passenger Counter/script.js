let count = 0
let countEl = document.getElementById("count-el")
let prevEl = document.getElementById("prev-el")

function increment() {
    count+= 1
    countEl.innerText=count
}
function decrement() {
    count -=1
    countEl.textContent=count
}

function save() {
    let message = count + " - "
    prevEl.textContent += message
    count=0
    countEl.textContent=count
    console.log(count)
}

