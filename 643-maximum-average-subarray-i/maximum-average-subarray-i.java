class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxavg=0;
        double sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        maxavg=sum/k;
        double avg=maxavg;
        for(int i=k;i<nums.length;i++){
            sum=sum+nums[i]-nums[i-k];
            avg=sum/k;
            maxavg=Math.max(avg,maxavg);
        }
        return maxavg;
        
    }
}