class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res=strs[0];
        for(int i=1;i<strs.length;i++){
            if(strs[i].length()==0){
                return "";
            }
            int len=0;
            int j=0;
            while(j<res.length() && j<strs[i].length()){
                if(res.charAt(j)!=strs[i].charAt(j)){
                    break;
                }
                len++;
                j++;
            }
            res=res.substring(0,len);
        }
        return res;
        
    }
}