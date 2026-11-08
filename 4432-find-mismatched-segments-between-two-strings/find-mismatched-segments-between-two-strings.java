class Solution {
    public List<List<String>> findMismatchedSegments(String s1, String s2) {

        List<List<String>> list = new ArrayList<>();

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        boolean flag=false;

        for(int i=0;i<s1.length();i++){
            char ch1 = s1.charAt(i);
            char ch2 =s2.charAt(i);
            
            if(ch1!=ch2){
                sb1.append(ch1);
                sb2.append(ch2);
                flag=true;
            }
            else if(flag){
                List<String> l= new ArrayList<>();
                l.add(sb1.toString());
                l.add(sb2.toString());
                list.add(l);
                sb1.setLength(0);
                sb2.setLength(0);
                flag=false;
            }
            System.out.println(list);
        }

        if(flag){
            List<String> l= new ArrayList<>();
                l.add(sb1.toString());
                l.add(sb2.toString());
                list.add(l);
        }

        return list;
        
    }
}