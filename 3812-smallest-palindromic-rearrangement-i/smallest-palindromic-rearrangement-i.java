class Solution {
    public String smallestPalindrome(String s) {
        // return s if the length is 1
        if (s.length()==1) return s;
        int[] arr = new int[26];
        for(int i = 0;i<s.length();i++){
            int currAlphabet = s.charAt(i) - 'a';
            arr[currAlphabet]++;
        }
        StringBuilder res = new StringBuilder();

        
        char[] resArr = new char[s.length()];
        int currentIdx = 0;
        int startIdx = 0;
        int endIdx = s.length()-1;
        while(currentIdx<arr.length){
            if(arr[currentIdx]<=0){
                currentIdx ++;
                continue;
            }

            // remember this mistake made , when frequency is one , do not insert at start index , should be insert at middle , then only the palindrome conditions hold
            if(arr[currentIdx]==1){
                resArr[s.length() / 2] =(char)( currentIdx + 'a');
                --arr[currentIdx];
                continue;
            }

            resArr[startIdx] = (char)(currentIdx +'a');
            resArr[endIdx] = (char)(currentIdx +'a');
            startIdx++;
            endIdx--;
            arr[currentIdx] -=2;
        }

        return new String(resArr);
    }
}