class Solution {
    public int timeRequiredToBuy(int[] nums, int k) {
        int time=0;
        while(nums[k]!=0){
            for(int i=0;i<nums.length;i++){
                if(nums[i]!=0){
                    nums[i]=nums[i]-1;
                    time++;
                }
                if(nums[k]==0){
                    break;
                }
            }
        }
        return time;
        
    }
}