/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    const ans=[];
    let j=0;
    for(let i=0;i<arr.length;i++){
        if(fn(arr[i],i)){
            ans[j++]=arr[i];
            //ans.push(arr[i]);
        }
    }
    return ans;
};