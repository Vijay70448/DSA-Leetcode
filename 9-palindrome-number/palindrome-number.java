class Solution {
    public boolean isPalindrome(int x) {
        if(x==0){
            return true;
        }
        int ans=0;
        int original=x;
        while(x>0){
            int rem=x%10;
            ans=ans*10+rem;
            x/=10;
        }
        return original==ans;
        
    }
}