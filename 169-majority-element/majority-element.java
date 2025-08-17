class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int ele=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                ele=nums[i];
                count++;
            }
            else if(nums[i]==ele){
                count++;
            }
            else{
                count--;
            }
        }
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==ele){
                cnt++;
            }
        }
        if(cnt>nums.length/2){
            return ele;
        }
        return -1;

    }
}