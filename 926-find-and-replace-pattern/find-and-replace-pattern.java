class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        Map<Character,Integer> map1 = new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        List<String> list = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String str=words[i];
            Map<Character,Integer> map2 = new HashMap<>();
            for(int j=0;j<str.length();j++){
                char ch=str.charAt(j);
                map2.put(ch,map2.getOrDefault(ch,0)+1);
            }
            if(map1.size()!=map2.size()){
                continue;
            }
            Map<Character,Character> map3= new HashMap<>();
            boolean flag= true;
            for(int k=0;k<str.length();k++){
                char ch2=str.charAt(k);
                char ch1=pattern.charAt(k);
                if(map3.containsKey(ch1)){
                    if(map3.get(ch1)!=ch2){
                        flag=false;
                        break;
                    }
                }
                else{
                        map3.put(ch1,ch2);
                    }
            }
            if(flag){
                list.add(str);
            }
        }
        return list;
        
    }
}