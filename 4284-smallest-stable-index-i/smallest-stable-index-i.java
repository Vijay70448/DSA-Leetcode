class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int stable = nums.length;

        for(int i=0;i<nums.length;i++){
            int max=Integer.MIN_VALUE;
            for(int j=i;j>=0;j--){
                max=Math.max(max,nums[j]);
            }

            int min=Integer.MAX_VALUE;

            for(int j=i;j<nums.length;j++){
                min=Math.min(min,nums[j]);
            }

            if(max!=Integer.MIN_VALUE && min!=Integer.MAX_VALUE){
                int s=max-min;
                if(s<=k){
                    stable=Math.min(stable,i);
                }
            }
        }

        if(stable==nums.length){
            return -1;
        }
        
        return stable;
    }
}