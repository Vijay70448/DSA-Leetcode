class Solution {
    public int findKthLargest(int[] nums, int k) {
       Queue<Integer> q= new PriorityQueue<>(Comparator.reverseOrder());
       for(int i=0;i<nums.length;i++){
            q.add(nums[i]);
       }
       int j=0;
       while(j<k-1){
            q.remove();
            j++;
       }
       return q.remove();
    }
}