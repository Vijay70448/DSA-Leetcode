class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                list.add(i+1);
            }
        }
        if(list.size()==0){
            return true;
        }
        for(int i=0;i<list.size()-1;i++){
            int a=list.get(i);
            int b=list.get(i+1);
            int c=b-a-1;
            if(c<k){
                return false;
            }
        }
        return true;
    }
}