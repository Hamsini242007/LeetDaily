/**
 * @param {number[]} nums
 * @param {Function} fn
 * @param {number} init
 * @return {number}
 */
var reduce = function(nums, fn, init) {
    let n=nums.length;
    if(n>0){
        let temp= fn(init,nums[0]);
        for(let i=1;i<n;i++){
            temp=fn(temp,nums[i]);
        }
        return temp;
    }else{
        return init;
    } 
};