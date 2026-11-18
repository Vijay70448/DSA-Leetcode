class Solution {
    public int minChanges(String s) {
        String arr[]= new String[s.length()/2];
        int j=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=s.substring(j,j+2);
            j+=2;
        }
        int count=0;
        for(int i=0;i<arr.length;i++){
            char ch1=arr[i].charAt(0);
            char ch2=arr[i].charAt(1);
            if(ch1!=ch2){
                count++;
            }
        }
        return count;
        
    }
}