class Solution {
    public int[] evenOddBit(int n) {
        String str="";
        while(n>0){
            int rem=n%2;
            str=rem+str;
            n=n/2;
        }
        int even=0;
        int odd=0;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='1'){
                if(i%2==0){
                    even++;
                }
                else{
                    odd++;
                }
            }
        }
        return new int[]{even,odd};

    }
}