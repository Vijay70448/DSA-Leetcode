class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Set<Integer> set = new TreeSet<>();
        for(int key:nums){
            set.add(key);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int key:set){
            list.add(key);
        }
        int count=1;
        int max=1;
        for(int i=1;i<list.size();i++){
            if(list.get(i)==list.get(i-1)+1){
                count++;
                max=Math.max(max,count);
            }
            else{
                count=1;
            }
        }
        return max;
        
    }
}