class Solution {
    public int minDeletions(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        Set<Integer> set = new HashSet<>();
        int count=0;
        for(int key:map.values()){
            while(key>0&& set.contains(key)){
                count++;
                key--;
            }
            if(key>0){
                set.add(key);
            }
        }
        return count;
        
    }
}