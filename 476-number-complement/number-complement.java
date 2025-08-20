class Solution {
    public int findComplement(int num) {
        String str= "";
        while(num>0){
            int rem=num%2;
            str=rem+str;
            num=num/2;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='1'){
                sb.append('0');
            }
            else{
                sb.append('1');
            }
        }
        int decimal=0;
        int base=1;
        for(int i=sb.length()-1;i>=0;i--){
            if(sb.charAt(i)=='1'){
                decimal=decimal+base;
            }
            base=base*2;
        }
        return decimal;
        
    }
}