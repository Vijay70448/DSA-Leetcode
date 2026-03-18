class Solution {
    public int firstUniqueEven(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int key:nums){
            if(map.containsKey(key)){
                map.put(key,map.get(key)+1);
            }
            else{
                map.put(key,1);
            }
        }
        for(int key:nums){
            if(map.get(key)==1&& key%2==0){
                return key;
            }
        }
        return -1;
        
    }
}