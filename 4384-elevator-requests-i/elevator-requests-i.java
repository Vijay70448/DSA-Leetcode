class Solution {
    public int elevatorRequests(int n, int[] requests) {

        int sec=0;

        int start =0;

        for(int i=0;i<requests.length;i++){
            sec+=Math.abs(start-requests[i]);
            start=requests[i];
        }

        return sec;
        
    }
}