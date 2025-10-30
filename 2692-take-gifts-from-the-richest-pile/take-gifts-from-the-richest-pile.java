class Solution {
    public long pickGifts(int[] gifts, int k) {
        Queue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<gifts.length;i++){
            pq.add(gifts[i]);
        }
        long ans=0;
        while(k-->0){
            int a=(int)Math.sqrt(pq.poll());
            pq.add(a);
        }
        while(!pq.isEmpty()){
            ans+=pq.poll();
        }
        return ans;
        
    }
}