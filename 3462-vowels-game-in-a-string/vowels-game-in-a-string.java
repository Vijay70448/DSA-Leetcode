class Solution {
    public boolean doesAliceWin(String s) {
        // int alice=0;
        // int vowel=0;
        // int i=0;
        // boolean a_flag=false;
        // boolean b_flag=false;
        // while(i<s.length()){
        //     char ch=s.charAt(i);
        //     if(isvowel(ch)){
        //         vowel++;
        //     }
        //     if(vowel%2!=0 && (!a_flag)){
        //         a_flag=true;
        //         b_flag=false;
        //         vowel=0;
        //     }
        //     else if(vowel!=0 && (!b_flag) && vowel%2==0){
        //         b_flag=true;
        //         a_flag=false;
        //         vowel=0;
        //     }
        //     i++;
        // }
        // return a_flag;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(isvowel(s.charAt(i))){
                count++;
            }
        }
        return count!=0;
        
    }
    public boolean isvowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return true;
        }
        return false;
    }
}