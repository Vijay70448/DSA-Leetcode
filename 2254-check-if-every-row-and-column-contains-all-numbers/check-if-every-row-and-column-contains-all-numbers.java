class Solution {
    public boolean checkValid(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<matrix.length;i++){
            Set<Integer> set1 = new HashSet<>();
            Set<Integer> set2= new HashSet<>();
            for(int j=0;j<matrix[i].length;j++){
                set1.add(matrix[i][j]);
                set2.add(matrix[j][i]);
            }
            if(set1.size()!=n ||set2.size()!=n){
                return false;
            }
        }
        return true;

    }
}