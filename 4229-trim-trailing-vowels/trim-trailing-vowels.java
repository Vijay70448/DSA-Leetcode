class Solution {
    public String trimTrailingVowels(String s) {
        StringBuilder sb = new StringBuilder();
        boolean flag=true;
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(flag){
                if(ch=='a'||ch=='i'||ch=='e'||ch=='o'||ch=='u'){
                    continue;
                }
                else{
                    flag=false;
                    sb.append(ch);
                }
            }
            else{
                sb.append(ch);
            }
        }
        return sb.reverse().toString();
        
    }
}