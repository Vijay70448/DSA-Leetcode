class Solution {
    public double[] internalAngles(int[] sides) {
        Arrays.sort(sides);
        double a=sides[0];
        double b = sides[1];
        double c= sides[2];
        if(a+b>c){
             double angleA = Math.toDegrees(
            Math.acos((b*b + c*c - a*a) / (2*b*c))
        );

        double angleB = Math.toDegrees(
            Math.acos((a*a + c*c - b*b) / (2*a*c))
        );

        double angleC = 180.0 - angleA - angleB;

        double[] ans = {angleA, angleB, angleC};
        Arrays.sort(ans);

        return ans;
        }
        return new double[0];
        
    }
}