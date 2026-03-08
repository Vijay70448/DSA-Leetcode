class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int index=Integer.MAX_VALUE;
        int diff=Integer.MAX_VALUE;
        for(int i=0;i<capacity.length;i++){
            if(capacity[i]>=itemSize){
                int a=capacity[i]-itemSize;
                if(a<diff){
                    diff=a;
                    index=i;
                }
                else if(a==diff){
                    index=Math.min(index,i);
                }
            }
        }
        if(index==Integer.MAX_VALUE){
            return -1;
        }
        return index;
        
    }
}