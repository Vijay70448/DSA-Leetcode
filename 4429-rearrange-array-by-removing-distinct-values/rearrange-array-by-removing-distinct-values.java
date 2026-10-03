class Solution {
    public int[] rearrangeArray(int[] nums) {

        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i=0;i<nums.length;i++){
            int a = nums[i];
            if(map.containsKey(a)){
                map.put(a,map.get(a)+1);
            }
            else{
                map.put(nums[i],1);
            }
        }

        int arr[]= new int[nums.length];

        int j=0;
        while(j<nums.length){

            for(int key:map.keySet()){
                int a=map.get(key);
                if(a>0){
                    arr[j++]=key;
                    map.put(key,a-1);
                }
                
            }
        }

        return arr;
        
    }
}