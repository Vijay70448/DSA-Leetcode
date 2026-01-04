class Solution {
    public String largestEven(String s) {
        //StringBuilder sb = new StringBuilder();
        int index=s.lastIndexOf('2');
        if(index==-1){
            return "";
        }
        return s.substring(0,index+1);
        
    }
}