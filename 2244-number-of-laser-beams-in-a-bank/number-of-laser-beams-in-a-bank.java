class Solution {
    public int numberOfBeams(String[] bank) {
        int c=0;
        int arr[]= new int[bank.length];
        int prev=0;
        boolean flag=true;
        int index=-1;
        for(int i=0;i<bank.length;i++){
            String str=bank[i];
            int a=ones(str);
            arr[i]=a;
            if(a==0){
                c++;
            }
            if(a>0 && flag){
                prev=a;
                flag=false;
                index=i;
            }
        }
        if(c==bank.length-1){
            return 0;
        }
        int sum=0;
        for(int i=index+1;i<arr.length;i++){
            if(arr[i]!=0){
                sum+=prev*arr[i];
                prev=arr[i];
            }
        }
        return sum;
        
    }
    public int ones(String str){
        int b=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='1'){
                b++;
            }
        }
        return b;
    }
}