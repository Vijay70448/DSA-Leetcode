class Solution {
    public int totalHammingDistance(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int num1=nums[i];
                int num2=nums[j];
                int a=num1^num2;
                int b=Integer.bitCount(a);
                count+=b;
            }
        }
        return count;
        
    }
}