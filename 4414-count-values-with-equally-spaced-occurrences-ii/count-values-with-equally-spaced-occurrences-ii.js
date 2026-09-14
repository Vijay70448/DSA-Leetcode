/**
 * @param {number[]} nums
 * @return {number}
 */
var countSpecialIntegers = function(nums) {

    let map= new Map();
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
        if(list.length<3){
            continue;
        }
        let val=list[1]-list[0];
        let flag= true;
        for(let i=1;i<list.length-1;i++){
            let a = list[i];
            let b = list[i+1];
            if(b-a!==val){
                flag=false;
                break;
            }
        }
        if(flag){
            count++;
        }
    }
    return count;
    
};