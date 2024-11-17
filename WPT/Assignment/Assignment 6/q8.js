const Items = [10,20 ,30]; 
function totalitem(total,values){
    return total+values;
}

const sum=Items.reduce(totalitem);
console.log(sum);