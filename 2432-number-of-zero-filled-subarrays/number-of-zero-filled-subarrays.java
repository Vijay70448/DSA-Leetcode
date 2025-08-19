class Solution {
    public long zeroFilledSubarray(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int ele=0;
        for(int key: nums){
            set.add(key);
            ele=key;
        }
        long n=nums.length;
        if(ele==0&& set.size()==1){
            return n*(n+1)/2;
        }
        
        long count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                continue;
            }
            for(int j=i;j<nums.length;j++){
                if(nums[j]!=0){
                    break  ;
                }
                count++;
            }
        }
        return count;
        
    }
}