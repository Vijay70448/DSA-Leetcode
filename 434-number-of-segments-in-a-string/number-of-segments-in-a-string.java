class Solution {
    public int countSegments(String s) {
        if(s==null||s.length()==0){
            return 0;
        }
        int count=0;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==' '){
                if(sb.length()==0){
                    continue;
                }
                count++;
                sb.setLength(0);
            }
            else{
                sb.append(ch);
            }
        }
        if(sb.length()!=0){
            count++;
        }
        return count;
        
    }
}