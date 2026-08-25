class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int key:nums){
            set.add(key);
        }
        for(int i=1;;i++){
            if(!set.contains(i*k)){
                return i*k;
            }
        }
        
    }
}