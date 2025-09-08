class Solution {
    public int[] getNoZeroIntegers(int n) {
        int arr[]= new int[2];
        int a=1;
        int b=n-1;
        boolean flag=true;
        while(flag){
            int num=b;
            int zeros=0;
            while(num>0){
                if(num%10==0){
                    zeros++;
                    break;
                }
                num/=10;
            }
            int num2=a;
            while(num2>0){
                if(num2%10==0){
                    zeros++;
                    break;
                }
                num2/=10;
            }
            if(zeros>0){
                a++;
                b--;
            }
            else{
                flag=false;
            }
        }
        return new int[]{a,b};
        
    }
}