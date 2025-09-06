class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character,Integer> map1 = new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        String arr[]=s.split(" ");
        Map<String,Integer> map2 = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map2.put(arr[i],map2.getOrDefault(arr[i],0)+1);
        }
        if(map1.size()!=map2.size()){
            return false;
        }
        if(pattern.length()!=arr.length){
            return false;
        }
        Map<Character,String> map3 = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            char ch=pattern.charAt(i);
            if(map3.containsKey(ch)){
                if(!(map3.get(ch).equals(arr[i]))){
                    return false;
                }
            }
            else{
                map3.put(ch,arr[i]);
            }
        }
        return true;
        
    }
}