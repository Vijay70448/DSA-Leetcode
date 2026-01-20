class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int arr[]= new int[nums.size()];
        for(int i=0;i<nums.size();i++){
            boolean flag=false;
            int b=-1;
            for(int j=0;j<=nums.get(i);j++){
                int a= j|(j+1);
                if(a==nums.get(i)){
                    flag=true;
                    b=j;
                    break;
                }
            }
            if(flag){
                arr[i]=b;
            }
            else{
                arr[i]=-1;
            }
        }
        return arr;
        
    }
}