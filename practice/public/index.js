//1. Function Definition - hoisted
function funDef() {
    console.log("Function Definition"); //one of the way to create a function componenet || 
    // it rememebers correct object (this.)|| It can be hoised
}
funDef();

//2. Function Expression
const funExp = function () {
    console.log("Function Expression");
}
funExp();

//3. IIFE (Immediately Invoked Function Expression) || automatically starts
(function () {
    console.log("IIFE");
})();

//4. Arrow Function
const arrowFn = () => console.log("Arrow Function") //single line

const arrowFn2 = () => {
    console.log("Arrow Function"); // multi-line || one of the way to create a function componenet || 
    // can't rememeber correct object || can't be hoised
}
arrowFn();  

//5. Callback Funciton || A function that takes another function as an argument
function callback() {
    console.log("Callback Function");
}
function processing(abc) {
    abc();
}
processing(callback)

//6. HOF (Higher Order Fucntion) || a function which returns another function
function outerFn() {
    console.log("Outer Function");
    return function () {
        console.log("Inner Function");
        
    }
}

const innerFn = outerFn();
innerFn();

//7. Anonymous Function
// setTimeout, setInterval - Browser
// setTimeout, setInterval, setImmediate - Node
setTimeout(() => {
    console.log("TIMEOUT")
},1000)

//8. Generator Function - Infinite logic || have controle over the infinte loop
function* generator() { 
    
        yield 1;
        yield 2;
        yield 3;
    
    
}
const itr=generator(); // returns an iterator object
console.log(itr); // state: suspended
console.log(itr.next()); // {value : 1, done : false}
console.log(itr.next()); // {value : 2, done : false}
console.log(itr.next()); // {value : 3, done : false}
console.log(itr.next()); // {value : undefined, done : true}

//9. Constructor Function - Class & Objects


// <script>
//         // var, let, const

//         // function, scope, hoisted
//         // console.log(a); // hoisted : using a variable before initializing
//         // var a=10;
//         // a=40;
//         // console.log(a);

//         // //block scope
//         // // console.log(b); // will not be able to hoist the let
//         // let b=120;
//         // b=100;
//         // console.log(b);
        
//         // const c=30
//         // c=50

//         if(true){
//             var a=10;
//             let b=20;
//             const c=30;
//              console.log(a);
//         console.log(b);
//         console.log(c);
//         }
       
        
//     </script>


const userObj = {
    name: "Mathesh",
    age: 19,
    isStudent: true,
    hobbies: ["Music", "Chess"],
    address:{
        city: "CBE",
        pincode:641008
    },
    display() {
        console.log("Hello, ",this.name);
    },
    
    display_1() {
        console.log("Hello, ",this.name);
    }
}
console.log(userObj.name);
userObj.display();
userObj.display_1();

// DECONSTRUCTION

const numbers = [1, 2, 3, 4, 5];
// const a = nums[0];
// const b = nums[1];
// const c = nums[2];
// const d = nums[3];
// const e = nums[4];

// console.log(a, b, c, d, e);

//another method;

const [a, ...nums] = numbers;

console.log(a, nums);
const { name } = userObj;
console.log(name);


//Make a copy
const {  ...obj } = userObj;
console.log(obj);

localStorage.setItem("Name", "Mathesh");
localStorage.setItem("JWT", "jadnjajkf3bk3bknln3.kk2qnlnl3njk4nk34nlqnkkn2b3k4b3k.24bkj24kj24jk4");
console.log(localStorage.getItem("JWT"));

setTimeout(() => {
    localStorage.removeItem("JWT");
}, 2000);
setTimeout(() => {
    localStorage.clear()
},10000)