class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid=0;
        if(nums.length%2==0){
            int a=nums.length/2;
            mid=nums[a-1];
        }
        else{
           int a=(int)(nums.length/2);
            a+=1;
            mid=nums[a-1];
        }
        int count=0;
        for(int i=0;i<nums.length;i++){
            count+=Math.abs(mid-nums[i]);
        }
        return count;

        
    }
}