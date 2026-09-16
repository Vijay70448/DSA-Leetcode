/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function(nums) {

    let map= new Map();
    for(let i=0;i<nums.length;i++){
        let a=nums[i];
        if(map.has(a)){
            map.set(a,map.get(a)+1);
        }
        else{
            map.set(a,1);
        }
    }
    for(let key of map.keys()){
        let a=map.get(key);
        if(a>(nums.length/2)){
            return key;
        }
    }
    
};