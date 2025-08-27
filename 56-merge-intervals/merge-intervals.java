class Solution {
    public int[][] merge(int[][] arr) {
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        int nums[][]=new int[arr.length][2];
        int k=0;
        for(int i=0;i<arr.length;i++){
            // int start=arr[i][0];
            // int end=arr[i][1];
            // if(k>0&& nums[k-1][1]>=end){
            //     continue;
            // }
            // for(int j=i+1;j<arr.length;j++){
            //     if(arr[j][0]<=end){
            //         end=Math.max(end,arr[j][1]);
            //     }
            //     else{
            //         break;
            //     }
            // }
            // nums[k][0]=start;
            // nums[k][1]=end;
            // k++;

            if(k==0 || nums[k-1][1]<arr[i][0]){
                nums[k][0]=arr[i][0];
                nums[k][1]=arr[i][1];
                k++;
            }
            else{
                nums[k-1][1]=Math.max(nums[k-1][1],arr[i][1]);
            }
        }
        return Arrays.copyOfRange(nums,0,k);

        
    }
}