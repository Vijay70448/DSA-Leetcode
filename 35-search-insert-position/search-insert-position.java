class Solution {
    public int searchInsert(int[] nums, int target) {
        int index=-1;
        int a=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
            if(nums[i]<target){
                a=i;
            }
        }
        return a+1;
        
    }
}