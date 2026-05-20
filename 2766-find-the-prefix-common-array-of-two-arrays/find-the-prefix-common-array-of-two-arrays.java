class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int arr[]= new int[A.length];
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        int sum=0;
        for(int i=0;i<A.length;i++){
            set1.add(A[i]);
            set2.add(B[i]);
            int count=0;
            for(int key:set1){
                if(set2.contains(key)){
                    count++;
                }
            }
            arr[i]=count;
        }
        return arr;
        
    }
}