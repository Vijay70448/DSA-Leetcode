class Solution {
    public int totalWaviness(int num1, int num2) {
        int count=0;
        for(int i=num1;i<=num2;i++){
            String str = String.valueOf(i);
            if(str.length()>=3){
                for(int j=1;j<str.length()-1;j++){
                    char ch1=str.charAt(j);
                    char ch2=str.charAt(j-1);
                    char ch3=str.charAt(j+1);
                    if(ch1>ch2&& ch1>ch3){
                        count++;
                    }
                    if(ch1<ch2 && ch1<ch3){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}