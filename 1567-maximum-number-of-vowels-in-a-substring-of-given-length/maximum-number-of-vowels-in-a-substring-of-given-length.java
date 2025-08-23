class Solution {
    public int maxVowels(String s, int k) {
        int max=0;
        for(int i=0;i<k;i++){
            if(isvowel(s.charAt(i))){
                max++;
            }
        }
        int count=max;
        for(int i=k;i<s.length();i++){

            if(isvowel(s.charAt(i))){
                count++;
            }
            if(isvowel(s.charAt(i-k))){
                count--;
            }
            max=Math.max(max,count);
        }
        return max;
    }
    public boolean isvowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return true;
        }
        return false;
    }
}