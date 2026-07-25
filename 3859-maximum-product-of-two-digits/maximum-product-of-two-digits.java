class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> list =new ArrayList<>();
        int num=n;
        while(num>0){
            list.add(num%10);
            num/=10;
        }
        Collections.sort(list,Collections.reverseOrder());
        int a=list.get(0);
        int b=list.get(1);
        return a*b;
        
    }
}