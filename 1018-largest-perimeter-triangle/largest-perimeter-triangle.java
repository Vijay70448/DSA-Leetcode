class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        if(nums.length<3){
            return 0;
        }
        int max=0;
       for(int i=0;i<nums.length-2;i++){
        int p=0;
        int a=nums[i];
        int b=nums[i+1];
        int c=nums[i+2];
        if(a+b>c && b+c>a && c+a>b){
            p=a+b+c;
        }
        max=Math.max(max,p);
       }
        return max;
    }
}