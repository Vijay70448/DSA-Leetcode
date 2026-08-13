class Solution {
    public double minPrice(int[] prices, int[] discounts) {

        ArrayList<Integer> price = new ArrayList<>();
for (int p : prices) {
    price.add(p);
}

ArrayList<Integer> d = new ArrayList<>();
for (int dis : discounts) {
    d.add(dis);
}


        Collections.sort(price,Collections.reverseOrder());
        Collections.sort(d,Collections.reverseOrder());

        int min=Math.min(prices.length,discounts.length);

        double sum=0;


        for(int i=0;i<min;i++){
             sum+=(price.get(i)*(100-d.get(i)))/100.0;
        }
       

        for(int i=min;i<prices.length;i++){
            sum+=price.get(i);
        }

        return sum;

        
        
    }
}