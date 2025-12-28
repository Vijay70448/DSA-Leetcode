class Solution {
    public int countNegatives(int[][] grid) {
      //  Arrays.sort(grid[]);
        int neg_count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]<0){
                    neg_count++;
                }
            }
        }
        return neg_count;
        
    }
}