class Solution {
    public String arrangeWords(String text) {
        ArrayList<ArrayList<String>> list = new ArrayList<>();
        String arr[]=text.split(" ");
        for(int i=0;i<arr.length;i++){
            ArrayList<String> l= new ArrayList<>();
            l.add(arr[i]);
            l.add(String.valueOf(i));
            list.add(l);
        }
        Collections.sort(list,(a,b)->{
            if(a.get(0).length()!=b.get(0).length()){
                return Integer.compare(a.get(0).length(),b.get(0).length());
            }
            return Integer.compare(Integer.parseInt(a.get(1)),Integer.parseInt(b.get(1)));
        });
        StringBuilder sb = new StringBuilder();
        ArrayList<String> li= new ArrayList<>();
        for(ArrayList<String> key:list){
            li.add(key.get(0));
        }
        for(int i=0;i<li.size();i++){
            String str=li.get(i);
            if(i==0){
                char ch=Character.toUpperCase(str.charAt(0));
                str=ch+str.substring(1,str.length());
            }
            else{
                char ch=Character.toLowerCase(str.charAt(0));
                str=ch+str.substring(1,str.length());
            }
            sb.append(str);
            if(i!=li.size()-1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}