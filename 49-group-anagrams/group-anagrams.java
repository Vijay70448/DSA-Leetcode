class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> nested_list = new ArrayList<>();
        HashMap<String,ArrayList<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String str=strs[i];
            char ch[]=str.toCharArray();
            Arrays.sort(ch);
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<ch.length;j++){
                sb.append(ch);
            }
            String s=sb.toString();
            if(map.containsKey(s)){
                map.get(s).add(str);
            }
            else{
                map.put(s,new ArrayList<>());
                map.get(s).add(str);
            }
        }
        for(ArrayList<String> key  : map.values()){
            nested_list.add(key);
        }
        return nested_list;
        
    }
}