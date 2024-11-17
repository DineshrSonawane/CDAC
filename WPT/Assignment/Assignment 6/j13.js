function outerFunction(outerVar) {
    return function innerFunction(innerVar) {
        console.log(`Outer Variable: ${outerVar}, Inner Variable: ${innerVar}`);
    };
}

const closureExample = outerFunction("hello");
closureExample("wait");
 