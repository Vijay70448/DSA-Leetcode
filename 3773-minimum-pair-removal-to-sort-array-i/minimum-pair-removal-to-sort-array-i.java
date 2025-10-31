class Solution {
    public int minimumPairRemoval(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int key:nums){
            list.add(key);
        }
        int count=0;
        while(!sorted(list)){
            int sum=Integer.MAX_VALUE;
            int index=-1;
            for(int i=0;i<list.size()-1;i++){
                int a=list.get(i)+list.get(i+1);
                if(a<sum){
                    sum=a;
                    index=i;
                }
            }
            int a=list.get(index)+list.get(index+1);
            list.set(index,a);
            list.remove(index+1);
            count++;
        }
        return count;
        
    }
    public boolean sorted (ArrayList<Integer> list){
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>list.get(i+1)){
                return false;
            }
        }
        return true;
    }
}