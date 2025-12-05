class Solution {
    public int countPartitions(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int i=0;
        int p_sum=0;
        int count=0;
        while(i<nums.length-1){
            int a=nums[i];
            p_sum+=a;
            sum-=a;
            int b=sum-p_sum;
            if(b%2==0){
                count++;
            }
            i++;
        }
        return count;
    }
}