class Solution {
    public int sumOfPrimesInRange(int n) {

        int rev= 0;
        int temp=n;
        while(temp!=0){
            int rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }

        int min=Math.min(rev,n);
        int max=Math.max(rev,n);

        int sum=0;
        for(int i=min;i<=max;i++){
            if(isPrime(i)){
                sum+=i;
            }
        }
        return sum;
        
    }

    public static boolean isPrime(int num){
        if(num==1||num==0){
            return false;
        }
        if(num==2){
            return true;
        }
        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}