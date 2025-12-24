class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum=0;
        for(int i=0;i<apple.length;i++){
            sum+=apple[i];
        }
        Arrays.sort(capacity);
        int a=0;
        int count=0;
        for(int i=capacity.length-1;i>=0;i--){
            a+=capacity[i];
            count++;
            if(a>=sum){
                break;
            }
        }
        return count;
    }
}