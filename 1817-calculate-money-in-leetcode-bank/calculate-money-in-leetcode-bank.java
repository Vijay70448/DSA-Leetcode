class Solution {
    public int totalMoney(int n) {
        int money=0;
        int c=1;
        int b=c;
        int count=1;
        while(n-->0){
            money+=b;
            if(count==7){
                c++;
                b=c;
                count=0;
            }
            else {
                b++;
            }
            count++;
            System.out.println(money);
        }
        return money;
    }
}