class Solution {
    public int countDominantElements(int[] nums) {

        if(nums.length==1){
            return 1;
        }

        int count=0;

        for(int i=0;i<nums.length;i++){
            if(i==0){
                if(nums[i]>=nums[i+1]){
                    count++;
                }
            }
            else if(i==nums.length-1){
                if(nums[i]>=nums[i-1]){
                    count++;
                }
            }
            else{
                double a=nums[i-1];
                double b=nums[i+1];
                double c=(a+b)/2.0;
                if(nums[i]>=c){
                    count++;
                }
            }

        }
        return count;
    }
}