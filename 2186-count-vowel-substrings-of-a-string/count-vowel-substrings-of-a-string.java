class Solution {
    public int countVowelSubstrings(String word) {
        int count=0;
        char arr[]=word.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(!vowel(arr[i])){
                continue;
            }
             Set<Character> set = new HashSet<>();
            for(int j=i;j<arr.length;j++){
                    if(vowel(arr[j])){
                        set.add(arr[j]);
                    }
                    else {
                        break;
                    }
                if(set.size()==5){
                    count++;
                }
            }
        }
        return count;
        
    }

    public boolean vowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return true;
        }
        return false;
    }
}