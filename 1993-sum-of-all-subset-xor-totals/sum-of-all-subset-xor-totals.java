class Solution {
    public int subsetXORSum(int[] nums) {
        int sum=0;
        int subsets=1<<nums.length;
        for(int num=0;num<subsets;num++){
            int xor_sum=0;
            for(int i=0;i<nums.length;i++){
                if((num &(1<<i))!=0){
                    xor_sum^=nums[i];
                }
            }
            sum+=xor_sum;
        }
        return sum;
        
    }
}