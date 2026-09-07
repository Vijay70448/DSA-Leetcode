/**
 * @param {number[]} nums
 * @return {number[]}
 */
var runningSum = function(nums) {

    let arr= new Array(nums.length);
    let sum=nums[0];
    arr[0]=sum;
    for(let i=1;i<nums.length;i++){
        sum+=nums[i];
        arr[i]=sum;
    }
    return arr;
    
};