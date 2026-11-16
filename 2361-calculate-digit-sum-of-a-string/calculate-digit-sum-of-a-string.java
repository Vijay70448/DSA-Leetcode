class Solution {
    public String digitSum(String s, int k) {


        if(s.length()<=k){
            return s;
        }

        boolean flag= true;
        StringBuilder sb2 = new StringBuilder();
            sb2.append(s);

        while(flag){

            int i=0;
            StringBuilder sb = new StringBuilder();
            while(i<sb2.length()){
                int l=i;
                int r=i+k;
                int min=Math.min(sb2.length(),r);
                String str=sb2.substring(l,min);
                int sum=0;

                for(int j=0;j<str.length();j++){
                    char ch=str.charAt(j);
                    sum+=Character.getNumericValue(ch);
                }

                sb.append(String.valueOf(sum));
                //System.out.println(sb);
                i+=k;

            }
            
            if(sb.length()<=k){
                flag=false;
                sb2.setLength(0);
                sb2.append(sb);
                break;
            }
            sb2.setLength(0);
            sb2.append(sb);
            sb.setLength(0);
            System.out.println(sb2);
            

        }

        return sb2.toString();
        
    }
}