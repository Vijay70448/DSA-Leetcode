class Solution {
    public int maxDigitRange(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();
        int m=0;
        for(int i=0;i<nums.length;i++){
            int a=nums[i];
            int max=0;
            int min=10;
            while(a>0){
                int rem=a%10;
                max=Math.max(max,rem);
                min=Math.min(min,rem);
                a=a/10;
            }
            int b=max-min;
            map.put(nums[i],b);
            System.out.println(b);
            m=Math.max(m,b);
        }

        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])==m){
                sum+=nums[i];
            }
        }
        return sum;
        
    }
}