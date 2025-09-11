class Solution {
    public String sortVowels(String s) {
        StringBuilder sb = new StringBuilder();
        ArrayList<Character> list = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(isvowel(ch)){
                list.add(ch);
            }
        }
        Collections.sort(list);
        int j=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(isvowel(ch)){
                sb.append(list.get(j));
                j++;
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
        
    }
    public boolean isvowel(char ch){
        char c=Character.toLowerCase(ch);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            return true;
        }
        return false;
    }
}