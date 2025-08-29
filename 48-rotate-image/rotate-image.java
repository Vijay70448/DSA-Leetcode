class Solution {
    public void rotate(int[][] matrix) {
        int arr[][]= new int[matrix.length][matrix.length];
        int a=0;
        for(int j=0;j<matrix.length;j++){
            int b=0;
            for(int i=matrix.length-1;i>=0;i--){
                arr[a][b]=matrix[i][j];
                b++;
            }
            a++;
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                matrix[i][j]=arr[i][j];
            }
        }
        
        
    }
}