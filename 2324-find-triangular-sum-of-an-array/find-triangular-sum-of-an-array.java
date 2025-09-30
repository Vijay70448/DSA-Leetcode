class Solution {
    public int triangularSum(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int len= nums.length;
        while(len-->1){
            int arr[]=new int[len];
            for(int i=0;i<len;i++){
                arr[i]=(nums[i]+nums[i+1])%10;
            }
            for(int i=0;i<arr.length;i++){
                nums[i]=arr[i];
            }
        }
        return nums[0];
        
    }
}