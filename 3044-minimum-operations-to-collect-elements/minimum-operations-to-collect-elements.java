class Solution {
    public int minOperations(List<Integer> nums, int k) {
        Set<Integer> set1 = new HashSet<>();
        for(int i=1;i<=k;i++){
            set1.add(i);
        }
        int count=0;
        Set<Integer> set2 = new HashSet<>();
        for(int i=nums.size()-1;i>=0;i--){
            if(set1.contains(nums.get(i))){
                set2.add(nums.get(i));
            }
            count++;
            if(set1.equals(set2)){
                break;
            }
        }
        return count;
        
    }
}