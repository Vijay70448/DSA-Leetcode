class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int arr[][]= new int [image.length][image.length];
        for(int i=0;i<image.length;i++){
            int k=0;
            for(int j=image.length-1;j>=0;j--){
                int a=image[i][j];
                arr[i][k]=a^1;
                k++;
            }
        }
        return arr;

    }
}