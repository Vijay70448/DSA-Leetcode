class Solution {
    public String[] assignUmbrella(int[] rain) {

        int c1=0;
        int c2=0;
        String arr[]= new String[rain.length];

        for(int i=0;i<rain.length-1;i++){
            int a=rain[i];
            if(a==0){
                arr[i]="None";
            }
            else if(a==1 && rain[i+1]==1 &&c1<=c2){
                arr[i]="Alice";
                c1++;
            }
            else{
                arr[i]="Bob";
                c2++;
            }

        }

        if(rain[rain.length-1]==0){
            arr[arr.length-1]="None";
        }
        else{
            arr[arr.length-1]="Bob";
        }

        return arr;
        
    }
}