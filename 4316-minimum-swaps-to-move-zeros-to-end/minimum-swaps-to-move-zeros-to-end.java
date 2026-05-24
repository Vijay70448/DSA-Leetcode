class Solution {
    public int minimumSwaps(int[] nums) {

        int zeros = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zeros++;
            }
        }
        if(zeros==0|| zeros==nums.length){
            return 0;
        }
        int count=0;
        int j=nums.length-1;
        for(int i=0;i<zeros;i++){
            if(nums[j]!=0){
                count++;
            }
            j--;
        }

        return count;
        
    }
}