class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i=0;i<mat.length;i++){
            ArrayList<Integer> l = new ArrayList<>();
            int count=0;
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==1){
                    count++;
                }
            }
            l.add(i);
            l.add(count);
            list.add(l);
        }
        Collections.sort(list,(a,b)->{
            if(a.get(1)!=b.get(1)){
                return Integer.compare(a.get(1),b.get(1));
            }
            return Integer.compare(a.get(0),b.get(0));
        });
        int arr[]= new int[k];
        int a=0;
        for(ArrayList<Integer> key:list){
            arr[a++]=key.get(0);
            if(a==k){
                break;
            }
        }
        return arr;
        
    }
}