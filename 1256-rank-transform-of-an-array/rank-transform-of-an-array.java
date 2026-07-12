class Solution {
    public int[] arrayRankTransform(int[] arr) {
       int sa[]=arr.clone();
       Arrays.sort(sa);
       HashMap<Integer,Integer> map=new HashMap<>();
       int rank=1;
       for(int i=0;i<sa.length;i++){
        if(!map.containsKey(sa[i])){
            map.put(sa[i],rank++);
        }
       }
       int r[]=new int[arr.length];
       for(int i=0;i<arr.length;i++){
        r[i]=map.get(arr[i]);
       }
       return r;
        
    }
}