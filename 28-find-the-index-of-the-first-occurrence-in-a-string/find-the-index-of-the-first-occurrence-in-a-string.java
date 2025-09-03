class Solution {
    public int strStr(String s, String needle) {
        int index=-1;
        if(!s.contains(needle)){
            return -1;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==needle.charAt(0)){
                int j=0;
                int k=i;
                boolean flag=true;
                while(j<needle.length()){
                    if(needle.charAt(j)!=s.charAt(k)){
                        flag=false;
                        break;
                    }
                    k++;
                    j++;
                }
                if(flag){
                    index=i;
                    break;
                }
            }
        }
        return index;
        
    }
}