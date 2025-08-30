class Solution {
    public int[][] sortMatrix(int[][] grid) {
        for(int i=0;i<grid.length;i++){
            int r=i;
            int c=0;
            ArrayList<Integer> list = new ArrayList<>();
            while(r<grid.length && c<grid.length){
                    list.add(grid[r][c]);
                    r++;
                    c++;
            }
            Collections.sort(list,Collections.reverseOrder());
            int rows=i;
            int col=0;
            for(int key:list){
                grid[rows][col]=key;
                rows++;
                col++;
            }
        }
        for(int i=1;i<grid.length;i++){
            int r=0;
            int c=i;
            ArrayList<Integer> list = new ArrayList<>();
            while(r<grid.length && c<grid.length){
                    list.add(grid[r][c]);
                    r++;
                    c++;
            }
            Collections.sort(list);
            int rows=0;
            int col=i;
            for(int key:list){
                grid[rows][col]=key;
                rows++;
                col++;
            }
        }

        return grid;
    }
}