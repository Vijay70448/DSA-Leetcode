class Solution {
    public String frequencySort(String s) {
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            String str=String.valueOf(ch);
            if(map.containsKey(str)){
                map.put(str,map.get(str)+1);
            }
            else{
                map.put(str,1);
            }
        }
        ArrayList<ArrayList<String>> list = new ArrayList<>();
        for(String key: map.keySet()){
            ArrayList<String> l = new ArrayList<>();
            l.add(key);
            l.add(String.valueOf(map.get(key)));
            list.add(l);
        }
        Collections.sort(list,(a,b)->{
            if(b.get(1).equals(a.get(1))){
                return b.get(0).compareTo(a.get(0));
            }
             return Integer.compare(map.get(b.get(0)),map.get(a.get(0)));
        });
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<list.size();i++){
            int a=map.get(list.get(i).get(0));
            String st=list.get(i).get(0);
            while(a-->0){
                sb.append(st);
            }
        }
        return sb.toString();

        
    }
}