class Solution {
    public int minimumPushes(String word) {
        int min = 0;
        int idx = 0;
        int count = 0;
        int current = 1;
        while(idx<word.length()){
            if(count == 8){
                current ++;
                count = 0 ;
            }
            min+=current;
            count++;
            idx++;
        }

        return min;

    }
}