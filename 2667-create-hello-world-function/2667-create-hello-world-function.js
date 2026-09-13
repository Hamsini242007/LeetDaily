/**
 * @return {Function}
 */
var createHelloWorld = function() {
    
    return function(...args) {
        return "Hello World";
    }
    //instead of the above return block
    // return (...args)=>"Hello World"
};
// single line solution
// var createHelloWorld =()=>(...args)=>"Hello World";

/**
 * const f = createHelloWorld();
 * f(); // "Hello World"
 */