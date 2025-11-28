class Solution {
    public int[] sortArray(int[] nums) {
        Queue<Integer> pq= new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }
        int j=0;
        while(!pq.isEmpty()){
            nums[j++]=pq.poll();
        }
        return nums;
    }
}