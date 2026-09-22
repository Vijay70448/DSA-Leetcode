/**
 * @param {number[]} nums
 * @return {number[]}
 */
var findDuplicates = function(nums) {
    if(nums.length==1){
        return [];
    }

    let arr= new Array();
    //let set = new Set();
    nums.sort((a,b)=>a-b);
    for(let i=0;i<nums.length-1;i++){
        if(nums[i]===nums[i+1]){
            arr.push(nums[i]);
        }
    }
    return arr;
    
};