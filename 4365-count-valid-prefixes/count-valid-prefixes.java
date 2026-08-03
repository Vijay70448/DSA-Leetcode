class Solution {
    public int countValidPrefixes(String s) {

        int count=0;
        for(int i=0;i<s.length();i++){
            String str = s.substring(0,i+1);
            int ones=0;
            int zeros=0;
            for(int j=0;j<str.length();j++){
                char ch= str.charAt(j);
                if(ch=='1'){
                    ones++;
                }
                else{
                    zeros++;
                }
            }
            // if(ones!=0 && zeros!=0){
            //     int a=Math.abs(ones-zeros);
            //     if(a==1||a==0){
            //         count++;
            //     }
            // }

            int a=Math.abs(ones-zeros);
                if(a==1||a==0){
                    count++;
                }
        }

        return count;
        
    }
}