class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            char c=Character.toLowerCase(ch);
            if(isAlphaNum(c)){
                sb.append(c);
            }
        }
        String str=sb.toString();
        sb.reverse();
        return sb.toString().equals(str);
    }

    public boolean isAlphaNum(char ch){
        if(ch>='a'&&ch<='z'){
            return true;
        }
        else if(ch>='0'&& ch<='9'){
            return true;
        }
        return false;
    }
}