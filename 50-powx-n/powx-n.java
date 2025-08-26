class Solution {
    public double myPow(double x, int n) {
        double ans = 1;
        boolean neg=n<0;
        long a=n;
        a=Math.abs(a);
        while (a > 0) {
            if (a % 2 == 1) {
                ans = ans * x;
                a--;
            } else {
                x=x*x;
                a/=2;
            }
        }
        if(neg){
            return 1/ans;
        }
        return ans;

    }
}