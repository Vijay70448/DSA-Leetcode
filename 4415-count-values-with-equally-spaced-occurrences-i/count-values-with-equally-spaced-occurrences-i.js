/**
 * @param {number[]} nums
 * @return {number}
 */
var countSpecialIntegers = function(nums) {

    let map = new Map();

    for(let i=0;i<nums.length;i++){
        if(map.has(nums[i])){
            map.get(nums[i]).push(i);
        }
        else{
            map.set(nums[i],[]);
            map.get(nums[i]).push(i);
        }
    }

    let count=0;
    for(let key of map.keys()){
        let list = map.get(key);
        if(list.length!==3){
            continue;
        }
        let a=list[0];
        let b=list[1];
        let c=list[2];
        if(b-a===c-b){
            count++;
        }
    }
    
    return count;
};