class Solution {
    public boolean checkDivisibility(int n) {
        int digit_sum=0;
        int digit_product=1;
        int temp=n;
        while(n>0){
            int rem = n%10;
            digit_sum+=rem;
            digit_product*=rem;
            n/=10;
        }
        if(temp%(digit_sum+digit_product)==0){
            return true;
        }
        return false;
        
    }
}