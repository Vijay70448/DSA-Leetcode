class Solution {
    public int bitwiseComplement(int n) {
        String str=Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder();
        for(char ch:str.toCharArray()){
            if(ch=='1'){
                sb.append('0');
            }
            else{
                sb.append('1');
            }
        }
        int base=1;
        int num=0;
        for(int i=sb.length()-1;i>=0;i--){
            char ch=sb.charAt(i);
            if(ch=='1'){
                num+=base;
            }
            base*=2;
        }
        return num;
        
    }
}