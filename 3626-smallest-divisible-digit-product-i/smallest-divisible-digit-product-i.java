class Solution {
    public int smallestNumber(int n, int t) {

        int min=Integer.MAX_VALUE;

        for(int i=n;i<=100;i++){
            int p=1;
            int num=i;
            while(num>0){
                int a=num%10;
                p*=a;
                num/=10;
            }
            
            if(p%t==0){
                min=Math.min(min,i);
            }
        }

        return min;
        
    }
}