class Solution {
    public boolean hasAlternatingBits(int n) {
        String str="";
        while(n>0){
            int rem=n%2;
            str=rem+str;
            n/=2;
        }
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                return false;
            }
        }
        return true;
        
    }
}