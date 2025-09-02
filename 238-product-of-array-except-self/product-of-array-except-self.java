class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prefix[]=new int[nums.length];
        prefix[0]=1;
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]*nums[i-1];
        }
        int arr[]= new int[nums.length];
         arr[nums.length-1]=prefix[nums.length-1];
        int suffix=1;
        for(int i=nums.length-2;i>=0;i--){
            suffix=suffix*nums[i+1];
            arr[i]=suffix*prefix[i];
        }
        return arr;

        
    }
}