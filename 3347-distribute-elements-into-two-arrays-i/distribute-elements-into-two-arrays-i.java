class Solution {
    public int[] resultArray(int[] nums) {

        ArrayList<Integer> list1 = new ArrayList<>();

        ArrayList<Integer> list2 = new ArrayList<>();

        list1.add(nums[0]);
        list2.add(nums[1]);

        for(int i=2;i<nums.length;i++){
            int a=list1.get(list1.size()-1);
            int b = list2.get(list2.size()-1);

            if(a>b){
                list1.add(nums[i]);
            }
            else{
                list2.add(nums[i]);
            }
        }

        int arr[]= new int[nums.length];
        int j=0;
        for(int a:list1){
            arr[j++]=a;
        }
         for(int a:list2){
            arr[j++]=a;
        }

        return arr;
        
    }
}