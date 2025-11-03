class Solution {
    public int minCost(String colors, int[] neededTime) {
        int time=0;
        StringBuilder sb = new StringBuilder();
        sb.append(colors);
        ArrayList<Integer> list = new ArrayList<>();
        for(int key:neededTime){
            list.add(key);
        }
        for(int i=0;i<sb.length()-1;i++){
            char ch1=sb.charAt(i);
            char ch2=sb.charAt(i+1);
            if(ch1==ch2){
               if(list.get(i)<list.get(i+1)){
                time+=list.get(i);
                sb.deleteCharAt(i);
                list.remove(i);
               }
               else{
                time+=list.get(i+1);
                sb.deleteCharAt(i+1);
                list.remove(i+1);
               }
               i--;
            }
        }
        return time;
        
    }
}