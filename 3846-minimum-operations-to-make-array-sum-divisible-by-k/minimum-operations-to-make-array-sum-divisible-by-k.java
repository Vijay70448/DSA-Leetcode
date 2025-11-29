class Solution {
    public int minOperations(int[] nums, int k) {
        int sum=0;
        for(int key:nums){
            sum+=key;
        }
        return sum%k;
        
    }
}