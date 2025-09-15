class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String arr[]=text.split(" ");
        int count=0;
        for(int i=0;i<arr.length;i++){
            String str=arr[i];
            boolean flag=true;
            for(int j=0;j<brokenLetters.length();j++){
                if(str.contains(String.valueOf(brokenLetters.charAt(j)))){
                    flag=false;
                    break;
                }
            }
            if(flag){
                count++;
            }
        }
        return count;
        
    }
}