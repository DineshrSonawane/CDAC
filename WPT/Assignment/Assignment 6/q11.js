function call(dial,callback){
    setTimeout(callback,3000);
    console.log("Call Strated");
}

call("dial", function(){
    console.log("Call Ended");
})