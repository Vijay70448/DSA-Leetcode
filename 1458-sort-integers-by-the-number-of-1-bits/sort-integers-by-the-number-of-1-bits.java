class Solution {
    public int[] sortByBits(int[] arr) {
        ArrayList<ArrayList<Integer>> nested_list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            ArrayList<Integer> list = new ArrayList<>();
            list.add(arr[i]);
            list.add(Integer.bitCount(arr[i]));
            nested_list.add(list);
        }
        Collections.sort(nested_list,(a,b)->{
            if(b.get(1)!=a.get(1)){
                return Integer.compare(a.get(1),b.get(1));
            }
            return Integer.compare(a.get(0),b.get(0));
        });
        int nums[]= new int[arr.length];
        int j=0;
        for(ArrayList<Integer> list : nested_list){
            nums[j++]=list.get(0);
        }
        return nums;
        
    }
}