class Solution {
    public int minBitFlips(int x, int y) {
         int num=x^y;
        int count=0;
        while(num>0){
            if(num%2==1){
                count++;
            }
            num/=2;
        }
        return count;
        
    }
}