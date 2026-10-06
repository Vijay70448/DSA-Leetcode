class Solution {
    public boolean isPalindrome(String s) {

        int i=0;
        int j=s.length()-1;

        while(i<j){
            char ch1= Character.toLowerCase(s.charAt(i));
            char ch2=Character.toLowerCase(s.charAt(j));
            boolean flag1=alphaNum(ch1);
            boolean flag2=alphaNum(ch2);
            if(flag1==false && flag2==false){
                i++;
                j--;
            }
            else if(flag1==false&&flag2==true){
                i++;
            }
            else if(flag1==true&&flag2==false){
                j--;
            }
            else if(ch1!=ch2){
                return false;
            }
            else{
                i++;
                j--;
            }
        }
        return true;
        
    }

    public boolean alphaNum(char ch){
        if(ch>='a'&&ch<='z'){
            return true;
        }
        else if(ch>='0'&&ch<='9'){
            return true;
        }
        return false;
    }
}