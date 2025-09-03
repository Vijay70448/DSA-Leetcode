class Solution {
    public int[] finalPrices(int[] prices) {
        int arr[]= new int[prices.length];
        for(int i=0;i<prices.length;i++){
            boolean flag=true;
            for(int j=i+1;j<arr.length;j++){
                if(prices[j]<=prices[i]){
                    arr[i]=prices[i]-prices[j];
                    flag=false;
                    break;
                }
            }
            if(flag){
                arr[i]=prices[i];
            }
        }
        return arr;
        
    }
}