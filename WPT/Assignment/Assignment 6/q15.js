
    function even(arr){
return arr
    .filter(num=>num%2===0)
    .map(num=>num*2)
    .reduce((acc, num) => acc + num, 0); 
}
console.log(even([1,2,3,4,5,6,7,8]));
