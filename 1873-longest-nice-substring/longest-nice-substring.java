class Solution {
    public String longestNiceSubstring(String s) {
       ArrayList<String>  list = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                list.add(s.substring(i,j));
            }
        }
        int max_len=0;
        String res="";
        for(String str: list){
            Set<Character> set = new HashSet<>();
            for(int i=0;i<str.length();i++){
                set.add(str.charAt(i));
            }
            boolean flag= true;
            for(int j=0;j<str.length();j++){
                char c=str.charAt(j);
                char ch1=Character.toUpperCase(c);
                char ch2=Character.toLowerCase(c);
                if(!set.contains(ch1)||!set.contains(ch2)){
                    flag=false;
                    break;
                }
            }
            if(flag){
                if(max_len<str.length()){
                    max_len=str.length();
                    res=str;
                }
            }
        }
        return res;
        
    }
}