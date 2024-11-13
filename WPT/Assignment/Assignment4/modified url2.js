Exercise 5:
Using fetchData from Exercise 4, create another function processData that simulates processing the fetched data. Chain these functions together using nested callbacks.
Requirements:
●	First, call fetchData. Once the response is received, pass it to processData.
●	processData should modify the data and log the processed result.


function fetchData(url, callback){
 
    setTimeout(()=>{
        if (!url){
            console.log("error: failed to fetch data");
        }
  
        else{
          const arr=callback(url);
          console.log("fetched data from " + arr);
            setTimeout(()=> processData(arr) ,2000 );
        }
    },2000);  
  }
    
  function processData(arr) {
    const processedarr=arr.map(a=> a * 2);
    console.log("Processed Array: "+ processedarr);
  }
  
  fetchData("https://www.google.com/", (url) => {
    return [1,2,3];
  });
  
