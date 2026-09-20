/**
 * @param {Function[]} functions
 * @return {Function}
 */
var compose = function(functions) {
    
    return function(x) {
        for(let i=functions.length-1;i>=0;i--){
        const f=functions[i];
           x=f(x);
        }
        return x;
        // return functions.reduceRight((acc, f) => f(acc), x);
    }
};

/**
 * const fn = compose([x => x + 1, x => 2 * x])
 * fn(4) // 9
 */