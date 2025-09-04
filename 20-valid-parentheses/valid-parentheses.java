class Solution {
    public boolean isValid(String s) {
        Stack<Character> st= new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==')'||ch=='}'||ch==']'){
                if(st.isEmpty()){
                    return false;
                }
                char c=st.pop();
                if(c!='('&&ch==')'){
                    return false;
                }
                else if(ch=='}'&&c!='{'){
                    return false;
                }
                else if(ch==']'&&c!='['){
                    return false;
                }
            }
            else {
                st.push(ch);
            }
        }
        if(!st.isEmpty()){
            return false;
        }
        return true;
        
    }
}