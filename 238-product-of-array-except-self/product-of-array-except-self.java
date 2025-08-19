class Solution {
    public int[] productExceptSelf(int[] nums) {
        int arr[]=new int[nums.length];
        arr[0]=1;
        for(int i=1;i<nums.length;i++){
            arr[i]=arr[i-1]*nums[i-1];
        }
        int suffix=1;
        for(int i=nums.length-2;i>=0;i--){
            suffix=suffix*nums[i+1];
            arr[i]=arr[i]*suffix;
        }
        return arr;

        // int prefix[]=new int[nums.length];
        // int suffix[]=new int[nums.length];
        // prefix[0]=1;
        // for(int i=1;i<nums.length;i++){
        //     prefix[i]=prefix[i-1]*nums[i-1];
        // }
        // suffix[nums.length-1]=1;
        // for(int i=nums.length-2;i>=0;i--){
        //     suffix[i]=suffix[i+1]*nums[i+1];
        // }
        // for(int i=0;i<nums.length;i++){
        //     arr[i]=suffix[i]*prefix[i];
        // }
        // return arr;

        
    }
}