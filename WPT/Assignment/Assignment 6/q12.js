const myPromise = new Promise((resolve, reject) => {
    setTimeout(() => {
      resolve();
    }, 3000);
  });
  console.log("Program in progress...");