class Solution {
    public int countValidSelections(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                list.add(i);
            }
        }
        int count=0;
        int arr[]= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
        }
        for(int index:list){
            //go left
            for(int i=0;i<nums.length;i++){
                nums[i]=arr[i];
            }
            int a=index-1;
            boolean left_flag=true;
            while(a>=0 && a<nums.length){
                if(nums[a]==0){
                    if(left_flag){
                        a--;
                    }
                    else{
                        a++;
                    }
                }
                else if(nums[a]>0){
                    nums[a]=nums[a]-1;
                    if(left_flag){
                        left_flag=false;
                    }
                    else{
                        left_flag=true;
                    }
                    if(left_flag){
                        a--;
                    }
                    else{
                        a++;
                    }
                }
            }
            boolean f1=true;
            for(int key:nums){
                if(key!=0){
                    f1=false;
                    break;
                }
            }
            if(f1){
                count++;
            }
            for(int i=0;i<nums.length;i++){
                nums[i]=arr[i];
            }
            int b=index+1;
            boolean right_flag=true;
            while(b>=0 && b<nums.length){
                if(nums[b]==0){
                    if(right_flag){
                        b++;
                    }
                    else{
                        b--;
                    }
                }
                else if(nums[b]>0){
                    nums[b]=nums[b]-1;
                    if(right_flag){
                        right_flag=false;
                    }
                    else{
                        right_flag=true;
                    }
                    if(right_flag){
                        b++;
                    }
                    else{
                        b--;
                    }
                }
            }
            boolean f2=true;
            for(int key:nums){
                if(key!=0){
                    f2=false;
                    break;
                }
            }
            if(f2){
                count++;
            }
        }
        return count;
        
    }
}