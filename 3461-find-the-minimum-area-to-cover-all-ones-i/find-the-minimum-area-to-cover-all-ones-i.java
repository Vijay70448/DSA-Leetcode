class Solution {
    public int minimumArea(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int fr=n;
        int lr=-1;
        int fc=m;
        int lc=-1;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    fr=Math.min(fr,i);
                    lr=Math.max(lr,i);
                    fc=Math.min(fc,j);
                    lc=Math.max(lc,j);
                    count++;
                }
            }
        }
        if(count==0){
            return 0;
        }
        int a=lr-fr+1;
        int b=lc-fc+1;
        return a*b;
        
    }
}