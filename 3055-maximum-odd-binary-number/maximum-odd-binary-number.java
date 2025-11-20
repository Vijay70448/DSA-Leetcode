class Solution {
    public String maximumOddBinaryNumber(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='1'){
                count++;
            }
        }
        int arr[]= new int[s.length()];
        arr[arr.length-1]=1;
        count-=1;
        int j=0;
        while(count-->0){
            arr[j++]=1;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                sb.append('1');
            }
            else{
                sb.append('0');
            }
        }
        return sb.toString();
    }
}