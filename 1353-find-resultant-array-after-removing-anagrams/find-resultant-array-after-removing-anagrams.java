class Solution {
    public List<String> removeAnagrams(String[] words) {
        ArrayList<String> list = new ArrayList<>();
        for(String key:words){
            list.add(key);
        }
        for(int i=1;i<list.size();i++){
            char ch1[]=list.get(i-1).toCharArray();
            char ch2[]=list.get(i).toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            if(Arrays.equals(ch1,ch2)){
                list.remove(i);
                i--;
            }
        }
        return list;
    }
}