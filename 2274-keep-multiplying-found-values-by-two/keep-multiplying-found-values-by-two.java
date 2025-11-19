class Solution {
    public int findFinalValue(int[] nums, int original) {
        // ArrayList<Integer> list=new ArrayList<>();
        // for(int i=0;i<nums.length;i++){
        //     list.add(nums[i]);
        // }
        // while(list.contains(original)){
        //     original=2*original;
        // }
        // return original;

        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        while(set.contains(original)){
            original=2*original;
        }
        return original;
    }
}