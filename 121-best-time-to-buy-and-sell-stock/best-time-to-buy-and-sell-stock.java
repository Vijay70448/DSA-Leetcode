class Solution {
    public int maxProfit(int[] prices) {
        int max=Integer.MIN_VALUE;
        int min=prices[0];
        for(int i=1;i<prices.length;i++){
            max=Math.max(max,prices[i]-min);
            if(prices[i]<min){
                min=prices[i];
            }
        }
        if(max<=0){
            return 0;
        }
        return max;
        
    }
}