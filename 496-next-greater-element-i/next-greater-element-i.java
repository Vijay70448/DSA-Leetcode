class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            int count=0;
            for(int j=i+1;j<nums2.length;j++){
                if(nums2[i]<nums2[j]){
                    count=nums2[j];
                    break;
                }
            }
            map.put(nums2[i],count);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            if(map.get(nums1[i])==0){
                list.add(-1);
            }
            else{
                list.add(map.get(nums1[i]));
            }
        }
        int arr[]= new int[list.size()];
        int k=0;
        for(int key:list){
            arr[k++]=key;
        }
        return arr;
    }
}