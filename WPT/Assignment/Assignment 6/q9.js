function fun(...input){
    let sum= 0;
    for(let i of input)
    {
        sum+=i;
    }
    return sum;
}
console.log(fun(1,2,3));
console.log(fun(4,5,6,7,8,9));