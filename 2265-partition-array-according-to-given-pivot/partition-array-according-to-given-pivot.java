class Solution {
    public int[] pivotArray(int[] nums, int pivot) {

        int arr[]= new int [nums.length];

        int i=0;
        // we traverse for the small elements 

        int count=0;
        for(int j=0;j<nums.length;j++){
            int a=nums[j];
            if(a<pivot){
                arr[i++]=a;
            }
            else if(a==pivot){
                count++;
            }
        }

        for(int j=0;j<count;j++){
            arr[i++]=pivot;
        }

        // traverse for greater elements 

        for(int j=0;j<nums.length;j++){
            int a=nums[j];
            if(a>pivot){
                arr[i++]=a;
            }
        }

        return arr;
        
    }
}