/**
 * @param {string} s
 * @param {number} k
 * @return {number}
 */
var countRotations = function(s, k) {

    let count=0;
    let sb=s.split("");

    for(let i=0;i<s.length;i++){
        let c=0;
        for(let j=0;j<s.length-1;j++){
            let ch1=sb[j];
            let ch2=sb[j+1];
            if(ch1===ch2){
                c++;
            }
        }
        if(c==k){
            count++;
        }
        let ch=sb[0];
        sb.shift();
        sb.push(ch);
    }
    return count;
    
};