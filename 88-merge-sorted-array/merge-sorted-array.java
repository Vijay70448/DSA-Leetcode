class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // for(int i=m;i<m+n;i++){
        //     nums1[i]=nums2[i-m];
        // }
        // Arrays.sort(nums1);
        int index_1=m-1;
        int index_2=n-1;
        int index=m+n-1;
        while(index_1>=0 && index_2>=0){
            if(nums1[index_1]>nums2[index_2]){
                nums1[index]=nums1[index_1];
                index_1--;
            }
            else{
                nums1[index]=nums2[index_2];
                index_2--;
            }
            index--;
        }
        while(index_2>=0){
            nums1[index]=nums2[index_2];
            index_2--;
            index--;
        }
        
    }
}