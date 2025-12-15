class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String arr[]=s.split(" ");
        int count=0;
        for(int i=0;i<arr[0].length();i++){
            char ch=arr[0].charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        sb.append(arr[0]);
        if(arr.length!=1){
        sb.append(" ");
        }
        for(int i=1;i<arr.length;i++){
            String str = arr[i];
            int c=0;
            for(int j=0;j<str.length();j++){
                char ch=str.charAt(j);
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                c++;
                }
            }
            if(c==count){
                StringBuilder sb1 = new StringBuilder();
                sb1.append(str);
                sb1.reverse();
                sb.append(sb1);
                if(i!=arr.length-1){
                    sb.append(" ");
                }
            }
            else{
                sb.append(str);
                 if(i!=arr.length-1){
                    sb.append(" ");
                }
            }
        }
        return sb.toString();
    }
}