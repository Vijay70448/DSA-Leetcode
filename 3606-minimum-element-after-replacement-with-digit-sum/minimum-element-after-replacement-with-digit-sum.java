class Solution {
    public int minElement(int[] nums) {
        int arr[]=new int [nums.length];
        for(int i=0;i<nums.length;i++){
            int sum=0;
            if(nums[i]>9){
                while(nums[i]>0){
                    int a=nums[i]%10;
                    sum=sum+a;
                    nums[i]=nums[i]/10;
                }
                arr[i]=sum;
            }
            else{
                arr[i]=nums[i];
            }
        }
        Arrays.sort(arr);
        return arr[0];
        
    }
}