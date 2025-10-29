class Solution {
    public int smallestNumber(int n) {
        for(int i=n;;i++){
            String str=Integer.toBinaryString(i);
            int a=Integer.bitCount(i);
            if(str.length()==a){
                return i;
            }
        }
        
    }
}