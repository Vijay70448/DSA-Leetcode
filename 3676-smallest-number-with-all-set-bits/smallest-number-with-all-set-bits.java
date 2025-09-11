class Solution {
    public int smallestNumber(int n) {
        for(int i=n;;i++){
            int a=Integer.bitCount(i);
            String str=Integer.toBinaryString(i);
            if(a==str.length()){
                return i;
            }
        }
        
    }
}