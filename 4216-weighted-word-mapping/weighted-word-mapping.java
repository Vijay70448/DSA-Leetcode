class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        HashMap<Integer,Character> map = new HashMap<>();
        char c='z';
        for(int i=0;i<26;i++){
            map.put(i,c);
            c--;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<words.length;i++){
            String str=words[i];
            int sum=0;
            for(int j=0;j<str.length();j++){
                char ch=str.charAt(j);
                int a=ch-'a';
                sum+=weights[a];
            }
            int b=sum%26;
            sb.append(map.get(b));
        }
        return sb.toString();
        
    }
}