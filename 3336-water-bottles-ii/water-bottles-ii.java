class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int bottles =numBottles;
        int empty=numBottles;
        //numExchange++;
        while(empty>=numExchange){
            bottles++;
            empty-=numExchange;
            empty++;
            numExchange++;
        }
        return bottles;
        
    }
}