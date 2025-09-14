class Solution {
    public int earliestTime(int[][] arr) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            min=Math.min(min,arr[i][0]+arr[i][1]);
        }
        return min;
        
    }
}