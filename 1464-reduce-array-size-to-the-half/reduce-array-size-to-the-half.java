class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int half_len=0;
        if(arr.length%2==0){
            half_len=arr.length/2;
        }
        else{
            half_len=(arr.length/2)+1;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int key:map.values()){
            list.add(key);
        }
        Collections.sort(list,Collections.reverseOrder());
        int sum=0;
        int count=0;
        for(int key:list){
            sum+=key;
            count++;
            if(sum>=half_len){
                break;
            }
        }
        return count;
        
    }
}