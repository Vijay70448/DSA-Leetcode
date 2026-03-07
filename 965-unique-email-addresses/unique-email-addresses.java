class Solution {
    public int numUniqueEmails(String[] emails) {

        HashSet<String> set = new HashSet<>();
        for(int i=0;i<emails.length;i++){
            String str=emails[i];
            String arr[]=str.split("@");
            StringBuilder sb = new StringBuilder();
            String s=arr[0];
            for(char ch:s.toCharArray()){
                if(ch=='+'){
                    break;
                }
                if(ch!='.'){
                    sb.append(ch);
                }
            }
            sb.append('@');
            sb.append(arr[1]);
            set.add(sb.toString());
        }
        System.out.println(set);
        return set.size();
    }
}