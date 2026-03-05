class Solution {
    public int minOperations(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            sb.append('1');
            i++;
            if(i!=s.length()){
                sb.append('0');
            }
        }
        StringBuilder sb2 = new StringBuilder();
        for(int i=0;i<s.length();i++){
            sb2.append('0');
            i++;
            if(i!=s.length()){
                sb2.append('1');
            }
        }

        int count1=0;
        int count2=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!=sb.charAt(i)){
                count1++;
            }
            if(ch!=sb2.charAt(i)){
                count2++;
            }
        }
        
        return Math.min(count1,count2);
        
    }
}