/*
    1. Print out "Program started" at the start of your code
    2. Create a Promise that resolves after 3 seconds
       and rejects after 2 seconds
    3. Log out the promise while it's pending
    4. Print out "Program in progress..." as well

    5. Print out "Program complete" if the promise fulfills
    6. Print out "Program failure" if the promise rejects

    HINT: Use setTimeout for the delay
    .then() is used to define what happens when the promise resolves.
    To handle errors in the promise, you can add a .catch() block. This catches any errors if the promise is rejected. 
*/

console.log("Program started");
const promise1= new Promise((resolve, reject) => {
    setTimeout(() => {
        resolve(20);
      }, 3000);

      setTimeout(()=>{
        reject(20);
        }, 2000);
    })

console.log(promise1);
console.log("Program in progress");
 
promise1.then(()=>{

    console.log("Program Complete");
}).catch(()=>{
console.log("Program failure");

})