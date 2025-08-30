class Solution {
    public int getLeastFrequentDigit(int n) {
        String str= String.valueOf(n);
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int num=Character.getNumericValue(ch);
            map.put(num,map.getOrDefault(num,0)+1);
        }
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int key:map.keySet()){
            ArrayList<Integer> l= new ArrayList<>();
            l.add(key);
            l.add(map.get(key));
            list.add(l);
        }
        Collections.sort(list,(a,b)->{
            if(a.get(1)!=b.get(1)){
                return Integer.compare(a.get(1),b.get(1));
            }
            return Integer.compare(a.get(0),b.get(0));
        });
        return list.get(0).get(0);
        
    }
}