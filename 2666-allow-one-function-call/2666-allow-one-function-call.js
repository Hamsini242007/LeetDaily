/**
 * @param {Function} fn
 * @return {Function}
 */
var once = function(fn) {
    let called=false;
    // return function(...args){
    //     if(!called){
    //         called=true;
    //         return fn(...args);
    //     }
    //     return undefined;
    // }
    return (...args)=>called?undefined:(called=true, fn(...args));
};

/**
 * let fn = (a,b,c) => (a + b + c)
 * let onceFn = once(fn)
 *
 * onceFn(1,2,3); // 6
 * onceFn(2,3,6); // returns undefined without calling fn
 */
