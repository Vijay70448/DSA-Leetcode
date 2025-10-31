class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        Queue<int []> pq= new PriorityQueue<>((a,b)->
            a[0]!=b[0] ? a[0]-b[0]: a[1]-b[1]
        );
        for(int i=0;i<nums.length;i++){
            pq.add(new int[]{nums[i],i});
        }
        while(k-->0){
            int arr[]=pq.poll();
            pq.add(new int[]{arr[0]*multiplier,arr[1]});
        }
        while(!pq.isEmpty()){
            int arr[]=pq.poll();
            nums[arr[1]]=arr[0];
        }
        return nums;
        
    }
}