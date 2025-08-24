class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> nested_list = new ArrayList<>();
        Set<List<Integer>> s = new HashSet<>();
        int subsets=1<<nums.length;
        Arrays.sort(nums);
        for(int num=0;num<subsets;num++){
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                if((num&(1<<i))!=0){
                    list.add(nums[i]);
                }
            }
            s.add(list);
        }
        for(List<Integer> l: s){
            nested_list.add(l);
        }
        return nested_list;
        
    }
}