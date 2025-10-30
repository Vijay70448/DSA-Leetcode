class Solution {
    public int deleteGreatestValue(int[][] grid) {
        for(int i=0;i<grid.length;i++){
            ArrayList<Integer> list = new ArrayList<>();
            for(int j=0;j<grid[i].length;j++){
                list.add(grid[i][j]);
            }
            Collections.sort(list,Collections.reverseOrder());
            for(int j=0;j<grid[i].length;j++){
                grid[i][j]=list.get(j);
            }
        }
        int ans=0;
        for(int i=0;i<grid[0].length;i++){
            int max=-1;
            for(int j=0;j<grid.length;j++){
                max=Math.max(max,grid[j][i]);
            }
            ans+=max;
        }
        return ans;
    }
}