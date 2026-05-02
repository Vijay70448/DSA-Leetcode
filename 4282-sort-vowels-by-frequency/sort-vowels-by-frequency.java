class Solution {
    public String sortVowels(String s) {

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='i'||ch=='e'||ch=='o'||ch=='u'){
                if(map.containsKey(ch)){
                    map.put(ch,map.get(ch)+1);
                }
                else{
                    map.put(ch,1);
                }
            }
        }

        ArrayList<ArrayList<String>> list = new ArrayList<>();

        for(char key:map.keySet()){
            ArrayList<String> l= new ArrayList<>();
            String s1=String.valueOf(key);
            l.add(s1);
            String s2=String.valueOf(map.get(key));
            l.add(s2);

            list.add(l);
        }

        Collections.sort(list,(a,b)->{
            int v1=Integer.parseInt(a.get(1));
            int v2=Integer.parseInt(b.get(1));
            if(v1!=v2){
                return Integer.compare(v2,v1);
            }
            int index1=s.indexOf(a.get(0));
            int index2=s.indexOf(b.get(0));
            return Integer.compare(index1,index2);
        });

       // System.out.println(list);

        StringBuilder sb = new StringBuilder();
        ArrayList<Character> vijay = new ArrayList<>();

        for(ArrayList<String> key : list){
            char ch=key.get(0).charAt(0);
            int a=Integer.parseInt(key.get(1));
            for(int i=0;i<a;i++){
                vijay.add(ch);
            }
        }

        int j=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='i'||ch=='e'||ch=='o'||ch=='u'){
                sb.append(vijay.get(j));
                j++;
            }
            else{
                sb.append(ch);
            }
        }
        
        return sb.toString();
        
    }
}