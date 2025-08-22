class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        HashMap<Integer,Set<Integer>> map = new HashMap<>();
        for(int i=0;i<logs.length;i++){
            int key=logs[i][0];
            int value=logs[i][1];
            if(map.containsKey(key)){
                map.get(key).add(value);
            }
            else{
                map.put(key,new HashSet<>());
                map.get(key).add(value);
            }
        }
        int arr[]=new int[k];
        int j=0;
        for(int key:map.keySet()){
            int a=map.get(key).size();
            arr[a-1]+=1;
        }
        return arr;
        
    }
}