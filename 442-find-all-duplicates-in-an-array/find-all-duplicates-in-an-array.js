/**
 * @param {number[]} nums
 * @return {number[]}
 */
var findDuplicates = function(nums) {
    if(nums.length==1){
        return [];
    }

    let arr= new Array();
    let set = new Set();
    for(let i=0;i<nums.length;i++){
        if(set.has(nums[i])){
            arr.push(nums[i]);
        }
        else{
            set.add(nums[i]);
        }
    }
    return arr;
    
};