class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int bottles =numBottles;
        int empty=numBottles;
        while(empty>=numExchange){
            int a=empty/numExchange;
            bottles+=a;
            int b=empty%numExchange;
            empty=a+b;
        }
        return bottles;
        
    }
}