class Solution {
    public char findTheDifference(String s, String t) {
    //  char ch=0;
    //  for(int i=0;i<s.length();i++){
    //     ch^=s.charAt(i);
    //  }
    //  for(int j=0;j<t.length();j++){
    //     ch^=t.charAt(j);
    //  }
    //  return ch;
        // if(s.length()==0){
        //     return t.charAt(0);
        // }
        // HashMap<Character,Integer> map1 = new HashMap<>();
        // HashMap<Character,Integer> map2= new HashMap<>();
        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
        //     map1.put(ch,map1.getOrDefault(ch,0)+1);
        // }
        // for(int i=0;i<t.length();i++){
        //     char ch=t.charAt(i);
        //     map2.put(ch,map2.getOrDefault(ch,0)+1);
        // }
        // for(char key:map2.keySet()){
        //     if(map1.containsKey(key)){
        //         if(map1.get(key)!=map2.get(key)){
        //             return key;
        //         }
        //     }
        //     else{
        //         return key;
        //     }
        // }
        // return ' ';

        if(s.length()==0){
            return t.charAt(0);
        }
        char ch1[]=s.toCharArray();
        char ch2[]=t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for(int i=0;i<ch1.length;i++){
            if(ch1[i]!=ch2[i]){
                return ch2[i];
            }
        }
        return ch2[ch2.length-1];

    }
}