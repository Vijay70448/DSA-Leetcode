class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Integer> map1 = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }   
        Map<Character,Integer> map2 = new HashMap<>();
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }
        if(map1.size()!=map2.size()){
            return false;
        }
        Map<Character,Character> map3 = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);
            if(map3.containsKey(ch1)){
                if(map3.get(ch1)!=ch2){
                    return false;
                }
            }
            else{
                map3.put(ch1,ch2);
            }
        }
        return true;

    }
}