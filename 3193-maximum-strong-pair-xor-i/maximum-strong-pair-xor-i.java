class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int xor=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                int a=Math.abs(nums[i]-nums[j]);
                int b=Math.min(nums[i],nums[j]);
                if(a<=b){
                    xor=Math.max(xor,nums[i]^nums[j]);
                }
            }
        }
        return xor;
        
    }
}