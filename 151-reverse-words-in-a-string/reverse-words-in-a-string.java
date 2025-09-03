class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        s=s.trim();
        List<String> list = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!=' '){
                sb.append(ch);
            }
            else{
                if(sb.length()==0){
                    continue;
                }
                list.add(sb.toString());
                sb.setLength(0);
            }
        }
        if(sb.length()!=0){
            list.add(sb.toString());
        }
        System.out.println(list);
        StringBuilder sb2 = new StringBuilder();
        for(int i=list.size()-1;i>=0;i--){
            sb2.append(list.get(i));
            if(i!=0){
                sb2.append(' ');
            }
        }
        return sb2.toString();
        
    }
}