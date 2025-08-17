class Solution {
    public int countLargestGroup(int n) {
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        for(int i=1;i<=n;i++){
             int sum=0;
            if(i>9){
                int num=i;
                while(num>0){
                    int rem= num%10;
                    sum+=rem;
                    num=num/10;
                }

            }
            else{
                sum=i;
            }
            if(map.containsKey(sum)){
                map.get(sum).add(i);
            }
            else{
                map.put(sum,new ArrayList<>());
                map.get(sum).add(i);
            }
        }
        int max_size=0;
        for(ArrayList<Integer> list: map.values()){
            if(list.size()>max_size){
                max_size=list.size();
            }
        }
        int count=0;
        for(ArrayList<Integer> list: map.values()){
            if(list.size()==max_size){
                count++;
            }
        }
        return count;
    }
}