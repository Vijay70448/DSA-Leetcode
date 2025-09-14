class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int key:nums){
            set.add(key);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int key:set){
            list.add(key);
        }
        int min=Math.min(list.size(),k);
        Collections.sort(list,Collections.reverseOrder());
        int arr[]= new int[min];
        for(int i=0;i<min;i++){
            arr[i]=list.get(i);
        }
        return arr;
        
    }
}