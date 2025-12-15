class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int f=0;
        int l=0;
        for(int i=0;i<k;i++){
            f+=nums[i];
        }
        for(int i=nums.length-1;i>=nums.length-k;i--){
            l+=nums[i];
        }
        return l-f;
        
    }
}