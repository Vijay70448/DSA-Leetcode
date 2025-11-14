class Solution {
    public int minDeletionSize(String[] strs) {
        int count=0;
        for(int i=0;i<strs[0].length();i++){
            char c=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                char ch=strs[j].charAt(i);
                if(c>ch){
                    count++;
                    break;
                }
                else {
                    c=ch;
                }
            }
        }
        return count;
    }
}