class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<words.length;i++){
            if(map.containsKey(words[i])){
                map.put(words[i],map.get(words[i])+1);
            }
            else{
                map.put(words[i],1);
            }
        }
        ArrayList<ArrayList<String>> list = new ArrayList<>();
        for(String str:map.keySet()){
            ArrayList<String> l= new ArrayList<>();
            l.add(str);
            String s=String.valueOf(map.get(str));
            l.add(s);
            list.add(l);
        }
        Collections.sort(list,(a,b)->{
            int x=Integer.parseInt(a.get(1));
            int y=Integer.parseInt(b.get(1));
            if(x!=y){
                return Integer.compare(y,x);
            }
            return a.get(0).compareTo(b.get(0));
        });
        ArrayList<String> ls= new ArrayList<>();
        int a=1;
        for(ArrayList<String> key :list){
            ls.add(key.get(0));
            if(a==k){
                break;
            }
            a++;
        }
        return ls;

        
    }
}