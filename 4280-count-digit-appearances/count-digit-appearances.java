class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int key:nums){
            String str=String.valueOf(key);
            for(char ch: str.toCharArray()){
                if(map.containsKey(ch)){
                    map.put(ch,map.get(ch)+1);
                }
                else{
                    map.put(ch,1);
                }
            }
        }

        char c= (char)('0'+digit);
        if(map.containsKey(c)){
            return map.get(c);
        }
        return 0;
        
    }
}