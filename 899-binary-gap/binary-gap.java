class Solution {
    public int binaryGap(int n) {
        String str="";
        while(n>0){
            int rem=n%2;
            str=rem+str;
            n=n/2;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='1'){
                list.add(i);
            }
        }
        if(list.size()<=1){
            return 0;
        }
        int dis=0;
        for(int i=1;i<list.size();i++){
            dis=Math.max(dis,list.get(i)-list.get(i-1));
        }
        return dis;
        
    }
}