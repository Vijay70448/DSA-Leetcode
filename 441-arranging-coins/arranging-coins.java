class Solution {
    public int arrangeCoins(int n) {
        if(n==1){
            return 1;
        }
        int count=0;
        int k=1;
        while(n>0){
            int a=n-k;
            if(a>=0){
                count++;
                n=n-k;
                k++;
            }
            else{
                break;
            }
        }
        return count;
        
    }
}