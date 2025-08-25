class Solution {
    public int maxProduct(String[] words) {
        // List<List<String>> nested_list = new ArrayList<>();
        // for(int i=0;i<words.length;i++){
        //     List<String> list = new ArrayList<>();
        //     list.add(words[i]);
        //     list.add(words[i].length());
        //     nested_list.add(list);
        // }        
        // Collections.sort(nested_list,(a,b)->b.get(1)-a.get(1));
        int max=0;
        for(int i=0;i<words.length;i++){
            String str=words[i];
            Set<Character> set = new HashSet<>();
            for(int j=0;j<str.length();j++){
                set.add(str.charAt(j));
            }
            for(int k=i+1;k<words.length;k++){
                boolean flag=true;
                for(int x=0;x<words[k].length();x++){
                    if(set.contains(words[k].charAt(x))){
                        flag=false;
                        break;
                    }
                }
                if(flag){
                    max=Math.max(max,str.length()*words[k].length());
                }
            }
        }
        return max;

    }
}