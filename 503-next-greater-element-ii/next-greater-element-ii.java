class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int arr[]= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            boolean flag= true;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]>nums[i]){
                    arr[i]=nums[j];
                    flag=false;
                    break;
                }
            }
            if(flag){
                for(int k=0;k<=i-1;k++){
                    if(nums[k]>nums[i]){
                        arr[i]=nums[k];
                        flag=false;
                        break;
                    }
                }
            }
            if(flag){
                arr[i]=-1;
            }
        }
        return arr;
        
    }
}