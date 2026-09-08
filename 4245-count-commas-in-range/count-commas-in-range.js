/**
 * @param {number} n
 * @return {number}
 */
var countCommas = function(n) {

    if(n<=999){
        return 0;
    }

    let count=0;
    for(let i=n;i>=1000;i--){
        count++;
    }
    return count;
    
};