class Solution {
    public long smallestNumber(long num) {
        ArrayList<Long> list = new ArrayList<>();
        if(num<0){
            num=Math.abs(num);
            while(num>0){
                list.add(num%10);
                num/=10;
            }
            Collections.sort(list,Collections.reverseOrder());
            long decimal=0;
            for(int i=0;i<list.size();i++){
                decimal=decimal*10+list.get(i);
            }
            return -decimal;
        }
        long min=Long.MAX_VALUE;
        int z_count=0;
        while(num>0){
            list.add(num%10);
            if(num%10==0){
                z_count++;
            }
            if(num%10!=0 && num%10<min){
                min=num%10;
            }
            num/=10;
        }
        Collections.sort(list);
        if(z_count>0){
        list.remove(Long.valueOf(min));
        long numb=0;
        numb=numb*10+min;
        for(int i=0;i<list.size();i++){
            numb=numb*10+list.get(i);
        }
        return numb;
        }
        long numb=0;
        for(int i=0;i<list.size();i++){
            numb=numb*10+list.get(i);
        }
        return numb;
    }
}