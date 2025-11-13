class Solution {
    public int[] shortestToChar(String s, char c) {
        int arr[]=new int[s.length()];
        int k=0;
        for(int i=0;i<s.length();i++){
            int left=Integer.MAX_VALUE;
            for(int j=i;j>=0;j--){
                char ch=s.charAt(j);
                if(ch==c){
                    left=j;
                    break;
                }
            }
            int right=Integer.MAX_VALUE;
            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);
                if(ch==c){
                    right=j;
                    break;
                }
            }
            int a=Math.abs(i-left);
            int b=Math.abs(i-right);
            arr[k++]=Math.min(a,b);
        }
        return arr;
    }
}