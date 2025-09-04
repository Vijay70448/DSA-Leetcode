class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int arr[][]= new int[m][n];
        for(int i=0;i<m;i++){
            int r=i;
            int c=0;
            ArrayList<Integer> list = new ArrayList<>();
            while(r<m && c<n){
                list.add(mat[r][c]);
                r++;
                c++;
            }
            Collections.sort(list);
            int row=i;
            int col=0;
            for(int key:list){
                arr[row++][col++]=key;
            }
        }
        for(int i=0;i<n;i++){
            int r=0;
            int c=i;
            ArrayList<Integer> list = new ArrayList<>();
            while(r<m && c<n){
                list.add(mat[r][c]);
                r++;
                c++;
            }
            Collections.sort(list);
            int row=0;
            int col=i;
            for(int key:list){
                arr[row++][col++]=key;
            }
        }
        return arr;
    }
}