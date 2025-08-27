class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == divisor) {
            return 1;
        }
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return -dividend - 1;
        }
        if (dividend == Integer.MIN_VALUE && divisor == 1) {
            return dividend;
        }
        if (dividend == Integer.MAX_VALUE && divisor == -1) {
            return -dividend;
        }
        
        boolean sign = true;
        if (dividend >= 0 && divisor < 0) {
            sign = false;
        }
        if (dividend < 0 && divisor > 0) {
            sign = false;
        }
        long n = Math.abs((long)dividend);
        long d = Math.abs((long)divisor);
        long ans = 0;
        while (n >= d) {
            long count = 0;
            while (n >= (d * (long) Math.pow(2, count + 1))) {
                count++;
            }
            ans = ans + (long) Math.pow(2, count);
            n = n - (d * (long) Math.pow(2, count));
        }
        if (ans >= Integer.MAX_VALUE && sign) {
            return Integer.MAX_VALUE;
        }
        if (ans >= Integer.MAX_VALUE && sign == false) {
            return Integer.MIN_VALUE;
        }
        if (sign) {
            return (int) ans;
        }
        return (int) (ans * -1);

    }
}