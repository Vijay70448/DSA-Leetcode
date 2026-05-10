class Solution {
    public int[] scoreValidator(String[] events) {

        int score =0;
        int counter =0;
        for(int i=0;i<events.length;i++){
            String str=events[i];
            if(str.equals("W")){
                counter+=1;
                if(counter==10){
                    break;
                }
            }
            else if(str.equals("WD")){
                score+=1;
            }
            else if(str.equals("NB")){
                score+=1;
            }
            else {
                int a=Character.getNumericValue(str.charAt(0));
                score+=a;
            }
        }

        return new int[]{score,counter};
        
    }
}