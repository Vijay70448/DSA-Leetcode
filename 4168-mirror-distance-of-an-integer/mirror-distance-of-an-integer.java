class Solution {
    public int mirrorDistance(int n) {
        int num=n;
        int r=0;
        while(num>0){
            int rem=num%10;
            r=r*10+rem;
            num/=10;
        }
        return Math.abs(r-n);
        
    }
}