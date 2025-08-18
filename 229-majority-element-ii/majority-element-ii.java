class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // int appearance=nums.length/3;
        // HashMap<Integer,Integer> map=new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     if(map.containsKey(nums[i])){
        //         map.put(nums[i],map.get(nums[i])+1);
        //     }
        //     else{
        //         map.put(nums[i],1);
        //     }
        // }
        // ArrayList<Integer> list=new ArrayList<>();
        // for(int key: map.keySet()){
        //     if(map.get(key)>appearance){
        //         list.add(key);
        //     }
        // }
        // return list;

        int count_1=0;
        int count_2=0;
        int ele_1=0;
        int ele_2=0;
        for(int i=0;i<nums.length;i++){
            if(count_1==0&& ele_2!=nums[i]){
                ele_1=nums[i];
                count_1++;
            }
            else if(count_2==0 && ele_1!=nums[i]){
                ele_2=nums[i];
                count_2++;
            }
            else if(ele_1==nums[i]){
                count_1++;
            }
            else if(ele_2==nums[i]){
                count_2++;
            }
            else{
                count_1--;
                count_2--;
            }
        }
        int cnt_1=0;
        int cnt_2=0;
        for(int i=0;i<nums.length;i++){
            if(ele_1==nums[i]){
                cnt_1++;
            }
            else if(ele_2==nums[i]){
                cnt_2++;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        if (cnt_1 > nums.length / 3) list.add(ele_1);
        if (cnt_2 > nums.length / 3) list.add(ele_2);
        return list;
    }
}