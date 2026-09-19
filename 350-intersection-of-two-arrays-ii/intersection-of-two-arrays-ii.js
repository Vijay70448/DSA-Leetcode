/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[]}
 */
var intersect = function(nums1, nums2) {

    let map1 = new Map();
    let map2 = new Map();

    for(let i=0;i<nums1.length;i++){
        if(map1.has(nums1[i])){
            map1.set(nums1[i],map1.get(nums1[i])+1);
        }
        else{
            map1.set(nums1[i],1);
        }
    }

    for(let i=0;i<nums2.length;i++){
        if(map2.has(nums2[i])){
            map2.set(nums2[i],map2.get(nums2[i])+1);
        }
        else{
            map2.set(nums2[i],1);
        }
    }

    let arr  = new Array();
    for(let key of map1.keys()){
        if(map2.has(key)){
            let a = map1.get(key);
            let b=map2.get(key);
            let c=Math.min(a,b);
            for(let i=0;i<c;i++){
                arr.push(key);
            }
        }
    }
    return arr;
    
};