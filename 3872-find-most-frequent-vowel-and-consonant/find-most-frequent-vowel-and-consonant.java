class Solution {
    public int maxFreqSum(String s) {
        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(isvowel(ch)){
            map1.put(ch,map1.getOrDefault(ch,0)+1);
            }
            else{
                map2.put(ch,map2.getOrDefault(ch,0)+1);
            }
        }
        int max=0;
        if(map1.size()!=0){
            max=Collections.max(map1.values());
        }
        if(map2.size()!=0){
        max+=Collections.max(map2.values());
        }
        return max;
        
    }
    public boolean isvowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return true;
        }
        return false;
    }
}