class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st= new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String s=tokens[i];
            if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/")){
                String str1=st.pop();
                String str2=st.pop();
                int num1=Integer.parseInt(str1);
                int num2=Integer.parseInt(str2);
                int num3=0;
                if(s.equals("+")){
                    num3=num2+num1;
                }
                else if(s.equals("-")){
                    num3=num2-num1;
                }
                else if(s.equals("*")){
                    num3=num2*num1;
                }
                else{
                    num3=num2/num1;
                }
                st.push(String.valueOf(num3));
            }
            else{
                st.push(s);
            }
        }
        //string s=st.pop();
        return Integer.parseInt(st.pop());
        
    }
}