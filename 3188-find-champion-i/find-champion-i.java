class Solution {
    public int findChampion(int[][] grid) {
        int index=-1;
        int max=0;
        for(int i=0;i<grid.length;i++){
            int count=0;
            for(int j=0;j<grid.length;j++){
                if(grid[i][j]==1&&i!=j){
                    count++;
                }
            }
            if(count>max){
                max=count;
                index=Math.max(index,i);
            }
        }
        return index;
        
    }
}