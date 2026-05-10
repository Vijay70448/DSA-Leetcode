class Solution {
    public int[] concatWithReverse(int[] nums) {

        int arr[]= new int[2*nums.length];

        int j=0;
        for(int i=0;i<nums.length;i++){
            arr[j++]=nums[i];
        }
        for(int i=nums.length-1;i>=0;i--){
            arr[j++]=nums[i];
        }
        return arr;
        
    }
}