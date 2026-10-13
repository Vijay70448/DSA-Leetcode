class Solution {
    public long maxAlternatingSum(int[] nums) {
        int arr[]= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                arr[i]=(-1)*(nums[i]);
            }
            else{
                arr[i]=nums[i];
            }
        }
        Arrays.sort(arr);
        long sum=0;
        if(nums.length%2==0){
            int a=0;
            int b=arr.length-1;
            while(a<b){
                sum+=arr[b]*arr[b];
                sum-=arr[a]*arr[a];
                a++;
                b--;
            }
        }
        else{
            int c=nums.length/2;
            for(int i=c;i<arr.length;i++){
                sum+=arr[i]*arr[i];
            }
            for(int i=0;i<c;i++){
                sum-=arr[i]*arr[i];
            }
        }
        return sum;
        
    }
}