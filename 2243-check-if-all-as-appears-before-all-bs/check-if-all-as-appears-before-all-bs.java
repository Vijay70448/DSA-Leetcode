class Solution {
    public boolean checkString(String s) {
        int x=s.lastIndexOf('a');
        int y=s.indexOf('b');
        if(y==-1||y>x){
            return true;
        }
        return false;
    }
}