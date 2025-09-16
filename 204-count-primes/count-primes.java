class Solution {
    public int countPrimes(int n) {
        if(n<=1){
            return 0;
        }
        boolean arr[]=new boolean[n];
        for(int i=2;i<n;i++){
            arr[i]=true;
        }
        int count=0;
        for(int i=2;i<n;i++){
            if(arr[i]==true){
                for(int j=i+i;j<n;j+=i){
                    arr[j]=false;
                }
            }
        }
        for(int i=2;i<n;i++){
            if(arr[i]==true){
                count++;
            }
        }
        return count;
        
    }
}