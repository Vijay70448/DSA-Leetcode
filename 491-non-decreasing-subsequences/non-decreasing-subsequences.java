class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> nested_list= new ArrayList<>();
        int subsets=1<<nums.length;
        Set<List<Integer>> set = new HashSet<>();
        for(int num=0;num<subsets;num++){
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                if((num&(1<<i))!=0){
                    if(list.size()==0){
                        list.add(nums[i]);
                    }
                    else{
                        if(list.get(list.size()-1)<=nums[i]){
                            list.add(nums[i]);
                        }
                    }
                }
            }
            if(list.size()>1){
                set.add(list);
            }
        }
        for(List<Integer> key: set ){
            nested_list.add(key);
        }
        return nested_list;
        
    }
}