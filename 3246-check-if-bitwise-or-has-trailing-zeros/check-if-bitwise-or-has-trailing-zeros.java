class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int a=nums[i]|nums[j];
                String str=Integer.toBinaryString(a);
                if(str.charAt(str.length()-1)=='0'){
                    return true;
                }
            }
        }
        
        return false;
    }
}