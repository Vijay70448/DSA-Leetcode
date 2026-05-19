class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            list.add(Character.getNumericValue(ch));
        }

        if(list.size()==2){
           int a=list.get(0);
           int b=list.get(1);
           int c=Math.abs(a-b);
           if(c>2){
            return false;
           }
        }

        for(int i=1;i<list.size()-1;i++){
            int a=list.get(i-1);
            int b=list.get(i);
            int c=list.get(i+1);
            int d=Math.abs(b-a);
            int e=Math.abs(b-c);
            if(d>2||e>2){
                return false;
            }
        }
        return true;
        
    }
}