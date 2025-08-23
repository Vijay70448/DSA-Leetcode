class Solution {
     Set<Integer> set = new HashSet<>();
    public int countPrimeSetBits(int left, int right) {
        int c=0;
        //Set<Integer> set = new HashSet<>();
        for(int i=left;i<=right;i++){
            int a=count(i);
            if(isPrime(a)){
                c++;
            }
        }
        return c;
        
    }

    public int count(int num){
        int cnt=0;
        while(num>0){
            if(num%2==1){
                cnt++;
            }
            num/=2;
        }
        return cnt;
    }

    public boolean isPrime(int num){
        if(num==1){
            return false;
        }
        if(num==2){
            return true;
        }
        if(set.contains(num)){
            return true;
        }
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                return false;
            }
        }
        set.add(num);
        return true;
    }
}