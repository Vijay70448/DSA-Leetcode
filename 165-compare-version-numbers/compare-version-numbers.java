class Solution {
    public int compareVersion(String version1, String version2) {
        String arr1[]=version1.split("\\.");
        String arr2[]=version2.split("\\.");
        System.out.println(Arrays.toString(arr1));
        int i=0;
        int len=Math.max(arr1.length,arr2.length);
        while(i<len){
            int a=0;
            int b=0;
            if(i<arr1.length){
                a=Integer.parseInt(arr1[i]);
            }
            if(i<arr2.length){
                b=Integer.parseInt(arr2[i]);
            }
            if(a>b){
                return 1;
            }
            else if(b>a){
                return -1;
            }
            i++;
        }
        return 0;
        
    }
}