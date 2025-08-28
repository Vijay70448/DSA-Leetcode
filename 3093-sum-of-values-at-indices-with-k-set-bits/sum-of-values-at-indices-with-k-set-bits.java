class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum=0;
        for(int i=0;i<nums.size();i++){
            int a=Integer.bitCount(i);
            if(a==k){
                sum+=nums.get(i);
            }
        }
        return sum;
        
    }
}