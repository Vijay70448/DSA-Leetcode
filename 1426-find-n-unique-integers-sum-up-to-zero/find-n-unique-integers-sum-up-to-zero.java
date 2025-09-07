class Solution {
    public int[] sumZero(int n) {
        if(n==1){
            return new int[]{0};
        }
        ArrayList<Integer> list = new ArrayList<>();
        if(n%2!=0){
            list.add(0);
        }
        int a=1;
        int b=-1;
        for(int i=0;i<n/2;i++){
            list.add(a);
            list.add(b);
            a++;
            b--;
        }
        int arr[]= new int[list.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=list.get(i);
        }
        return arr;
        
    }
}