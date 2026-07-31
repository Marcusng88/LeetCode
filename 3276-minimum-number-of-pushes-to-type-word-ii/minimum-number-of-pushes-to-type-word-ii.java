class Solution {
    public int minimumPushes(String word) {
        int res = 0;
        int counter = 1;
        int current = 1;
        int[] freq = new int[26];
        for(int i = 0; i<word.length();i++){
            freq[word.charAt(i)-'a']++;
        }
        Arrays.sort(freq);
        for(int j = freq.length-1; j>=0;j--){
            if(freq[j]!=0){
                if(counter ==9){
                    current ++;
                    counter = 1;
                }
                res+=current * freq[j];
                counter++;
            }
            else{
                break;
            }

        }
        return res;

        
    }
}