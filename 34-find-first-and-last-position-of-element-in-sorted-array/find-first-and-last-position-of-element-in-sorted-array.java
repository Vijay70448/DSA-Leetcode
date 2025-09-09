class Solution {
    public int[] searchRange(int[] nums, int target) {
        int min=-1;
        int max=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                min=i;
                break;
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==target){
                max=i;
                break;
            }
        }
        return new int[]{min,max};
        
    }
}