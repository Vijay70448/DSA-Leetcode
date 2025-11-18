class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<bits.length;i++){
            if(bits[i]==1){
                list.add(2);
                i++;
            }
            else{
                list.add(1);
            }
        }
        return list.get(list.size()-1)==1;
    }
}