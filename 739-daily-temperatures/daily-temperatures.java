class Solution {
    public int[] dailyTemperatures(int[] nums) {
        int arr[]= new int[nums.length];
        Stack<ArrayList<Integer>> st= new Stack<>();
        for(int i=nums.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek().get(0)<=nums[i]){
                st.pop();
            }
            if(st.isEmpty()){
                arr[i]=0;
            }
            else{
                arr[i]=st.peek().get(1)-i;
            }
            ArrayList<Integer> list = new ArrayList<>();
            list.add(nums[i]);
            list.add(i);
            st.push(list);
        }
        return arr;
        
    }
}