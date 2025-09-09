class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->(a[0]-b[0]));
        ArrayList<ArrayList<Integer>> list= new ArrayList<>();
        for(int i=0;i<intervals.length;i++){
            int start=intervals[i][0];
            int end=intervals[i][1];
            if(!list.isEmpty() && end<=list.get(list.size()-1).get(1)){
                continue;
            }
            for(int j=i+1;j<intervals.length;j++){
                if(end>=intervals[j][0]){
                    end=Math.max(end,intervals[j][1]);
                }
            }
            ArrayList<Integer> l= new ArrayList<>();
            l.add(start);
            l.add(end);
            list.add(l);
        } 
        int arr[][]= new int[list.size()][2];
        int a=0;
        for(ArrayList<Integer> chintu :list){
            arr[a][0]=chintu.get(0);
            arr[a][1]=chintu.get(1);
            a++;
        }
        return arr;
    }
}