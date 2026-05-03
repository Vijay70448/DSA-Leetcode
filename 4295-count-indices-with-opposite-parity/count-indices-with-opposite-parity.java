class Solution {
    public int[] countOppositeParity(int[] nums) {

        int arr[]= new int[nums.length];

        for(int i=0;i<nums.length;i++){
            int a=nums[i]%2;
            int c=0;
            for(int j=i+1;j<nums.length;j++){
                int b=nums[j]%2;
                if(a!=b){
                    c++;
                }
            }
            arr[i]=c;
        }

        return arr;
        
    }
}