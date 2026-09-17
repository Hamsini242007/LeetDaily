/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function(arr, fn) {
    // let temp = new Array(arr.length); // declaring arr with specific len
    for(let i=0;i<arr.length;i++){
        arr[i]=fn(arr[i],i);
        // temp.push(fn(arr[i],i));
    }
    return arr;
};