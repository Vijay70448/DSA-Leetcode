class Solution {
    public void setZeroes(int[][] matrix) {
        boolean arr[][]= new boolean[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    arr[i][j]=true;
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0&& arr[i][j]){
                    int r=i;
                    int c=0;
                    while(c<matrix[0].length){
                        matrix[r][c]=0;
                        c++;
                    }
                    int row=0;
                    int col=j;
                    while(row<matrix.length){
                        matrix[row][col]=0;
                        row++;
                    }
                }
            }
        }
        
    }
}