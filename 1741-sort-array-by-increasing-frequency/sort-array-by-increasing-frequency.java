class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }        
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int key:map.keySet()){
            ArrayList<Integer> l = new ArrayList<>();
            l.add(key);
            l.add(map.get(key));
            list.add(l);
        }
        Collections.sort(list,(a,b)->{
            if(a.get(1)!=b.get(1)){
                return a.get(1)-b.get(1);
            }
            return b.get(0)-a.get(0);
        });
        int arr[]= new int[nums.length];
        int j=0;
        for(int i=0;i<list.size();i++){
            int a=list.get(i).get(0);
            int b=list.get(i).get(1);
            while(b-->0){
                arr[j++]=a;
            }
        }
        return arr;

    }
}