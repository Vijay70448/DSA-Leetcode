class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(0);
            StringBuilder sb = new StringBuilder();
            sb.append(s.substring(1,s.length()));
            sb.append(ch);
            if(sb.toString().equals(goal)){
                return true;
            }
            s=sb.toString();
        }
        return false;

    }
}