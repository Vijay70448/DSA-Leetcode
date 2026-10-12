class Solution {
    public boolean threeFibonacciSum(int n) {

        int sum=2;

        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(1);


        int i=0;
        while(sum<=n){
            if(sum==n){
                return true;
            }
            int a =list.get(i);
            int b= list.get(list.size()-1)+list.get(list.size()-2);
            list.add(b);
            sum-=a;
            sum+=b;
            i++;
        }

        return false;
        
    }
}