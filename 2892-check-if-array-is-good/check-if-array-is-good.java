class Solution {
    public boolean isGood(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        if(map.get(max)!=2){
            return false;
        }
        for(int i=1;i<max;i++){
            if(!map.containsKey(i)){
                return false;
            }
            if(map.get(i)!=1){
                return false;
            }
        }
        return true;
        
    }
}