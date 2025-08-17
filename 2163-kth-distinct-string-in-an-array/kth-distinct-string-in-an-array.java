class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> map= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        LinkedHashSet<String> set= new LinkedHashSet<>();
        for(String key:arr){
            set.add(key);
        }
        int count=0;
        for(String key:set){
            if(map.get(key)==1){
                count++;
                if(count==k){
                    return key;
                }
            }
        }
        return "";
    }
}