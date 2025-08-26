class Solution {
    public int mySqrt(int n) {
        long l=1;
        long r=n;
        long ans=0;
        while(l<=r){
            long mid=(l+r)/2;
            if(mid*mid<=n){
                ans=mid;
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return (int)ans;
        
    }
}