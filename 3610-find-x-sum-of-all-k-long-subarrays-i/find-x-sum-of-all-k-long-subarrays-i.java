class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length-k+1;i++){
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int j=i;j<i+k;j++){
                map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            }
            List<Integer> l= new ArrayList<>();
            for(int key:map.keySet()){
                l.add(key);
            }
            Collections.sort(l,(a,b)->{
                int f1=map.get(a);
                int f2=map.get(b);
                if(f1!=f2){
                    return Integer.compare(f2,f1);
                }
                return Integer.compare(b,a);
            });
            int sum=0;
            int count=0;
            for(int key:l){
                int a=map.get(key);
                sum+=a*key;
                count++;
                if(count==x){
                    break;
                }
            }
            list.add(sum);
        }
        int arr[]= new int[list.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=list.get(i);
        }
        return arr;
        
    }
}