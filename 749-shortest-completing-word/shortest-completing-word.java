class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        for(int i=0;i<licensePlate.length();i++){
            char ch=licensePlate.charAt(i);
            char c=Character.toLowerCase(ch);
            if(c>='a'&&c<='z'){
                map1.put(c,map1.getOrDefault(c,0)+1);
            }
        }
        String result="";
        for(int i=0;i<words.length;i++){
            String str=words[i];
            HashMap<Character,Integer> map2= new HashMap<>();
            for(int j=0;j<str.length();j++){
                char ch=str.charAt(j);
                map2.put(ch,map2.getOrDefault(ch,0)+1);
            }
            boolean flag=true;
            for(char key:map1.keySet()){
                if(map2.containsKey(key)){
                    int a=map1.get(key);
                    int b=map2.get(key);
                    if(a>b){
                        flag=false;
                        break;
                    }
                }
                else{
                    flag=false;
                    break;
                }
            }
            if(flag){
                if(result.length()>str.length()||result.length()==0){
                    result=str;
                }
            }
        }
        return result;

    }
}