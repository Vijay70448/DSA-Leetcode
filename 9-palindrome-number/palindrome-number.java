class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int original=x;
        int reverse =0;
        while(x>0){
          int a =x%10;
          reverse = a+reverse*10;
          x=x/10;
        }
        // if(reverse==original){
        //     return true;
        // }
        return reverse==original;
    }
}