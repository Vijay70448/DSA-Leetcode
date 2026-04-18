class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        
        if(words[startIndex].equals(target)){
            return 0;
        }
        
        // first phase 
        int var1 = 0;
        boolean flag1= false;
        for(int i=startIndex+1;i<words.length;i++){
            if(words[i].equals(target)){
                flag1=true;
            }
            var1++;
            if(flag1){
                break;
            }
        }

        if(!flag1){
            for(int i=0;i<startIndex;i++){
                if(words[i].equals(target)){
                flag1=true;
                }
                var1++;
                if(flag1){
                break;
                }
            }
        }

        // second phase 
        int var2=0;
        boolean flag2 = false;
        for(int i=startIndex-1;i>=0;i--){
            if(words[i].equals(target)){
                flag2=true;
            }
                var2++;
                if(flag2){
                break;
                }
        }

        if(!flag2){
            for(int i=words.length-1;i>startIndex;i--){
                if(words[i].equals(target)){
                flag2=true;
                }
                var2++;
                if(flag2){
                break;
                }
            }
        }

        if(!flag1&& !flag2){
            return -1;
        }

        return Math.min(var1,var2);
        
    }
}