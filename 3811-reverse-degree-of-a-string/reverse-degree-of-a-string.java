class Solution {
    public int reverseDegree(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        char ch='a';
        for(int i=26;i>=1;i--){
            map.put(ch,i);
            ch++;
        }
        int sum=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int a=map.get(c)*(i+1);
            sum+=a;
        }
        return sum;
        
    }
}