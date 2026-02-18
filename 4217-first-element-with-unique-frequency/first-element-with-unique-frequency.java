class Solution {
    public int firstUniqueFreq(int[] nums) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int key:map.values()){
            if(set1.contains(key)){
                set2.remove(key);
            }
            else{
                set1.add(key);
                set2.add(key);
            }
        }
        if(set2.size()==0){
            return -1;
        }
        for(int i=0;i<nums.length;i++){
            if(set2.contains(map.get(nums[i]))){
                return nums[i];
            }
        }
        return -1;
    }
}