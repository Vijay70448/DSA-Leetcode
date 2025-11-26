class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int ans=0;
        while(i<j){
            int width=j-i;
            int breadth=Math.min(height[i],height[j]);
            int a=width*breadth;
            ans=Math.max(ans,a);
            if(height[i]>height[j]){
                j--;
            }
            else{
                i++;
            }
        }
        return ans;
    }
}