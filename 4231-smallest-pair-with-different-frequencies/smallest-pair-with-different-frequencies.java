class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        if(nums.length==1||nums.length==2){
            return new int[]{-1,-1};
        }

        TreeSet<Integer> set = new TreeSet<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
            set.add(nums[i]);
        }
        ArrayList<Integer> list = new ArrayList<>();

        for(int key:set){
            list.add(key);
        }
        int arr[]= new int[2];
        int sum=Integer.MAX_VALUE;
        for(int i=0;i<list.size();i++){
            int f=map.get(list.get(i));
            for(int j=i+1;j<list.size();j++){
                if(f!=map.get(list.get(j))){
                    int a=list.get(i);
                    int b=list.get(j);
                    if((a+b)<sum){
                        sum=a+b;
                        arr[0]=a;
                        arr[1]=b;
                    }
                }
            }
        }
        if(sum==Integer.MAX_VALUE){
            return new int[]{-1,-1};
        }
        return arr;
        
    }
}