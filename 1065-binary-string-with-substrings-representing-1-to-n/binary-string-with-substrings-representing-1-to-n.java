class Solution {
    public boolean queryString(String s, int n) {
        for(int i=1;i<=n;i++){
            String str1=Integer.toBinaryString(i);
            if(!s.contains(str1)){
                return false;
            }
        }
        return true;
        
    }
}