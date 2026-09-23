/**
 * @param {number[]} nums
 * @return {number[]}
 */
var findDisappearedNumbers = function(nums) {

    let length = nums.length;
    let set = new Set(nums);
    let arr = new Array();

    for(let i=1;i<=nums.length;i++){
        if(!(set.has(i))){
            arr.push(i);
        }
    }
    return arr;
    
};