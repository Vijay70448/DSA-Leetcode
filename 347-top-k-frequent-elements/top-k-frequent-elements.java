class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        ArrayList<ArrayList<Integer>> list1=new ArrayList<>();
        for(int key:map.keySet()){
            ArrayList<Integer> list = new ArrayList<>();
            list.add(key);
            list.add(map.get(key));
            list1.add(list);
        }
        Collections.sort(list1,(a,b)->b.get(1)-a.get(1));
        int limit=Math.min(k,list1.size());
        int arr[]= new int[limit];
        for(int i=0;i<limit;i++){
            arr[i]=list1.get(i).get(0);
        }
        return arr;
        

    }
}