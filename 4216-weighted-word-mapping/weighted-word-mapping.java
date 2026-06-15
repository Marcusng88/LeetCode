class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        char[] arr = new char[words.length];
        int i = 0;
        for(String s : words){
            int res = 0;
            for(int c = 0; c<s.length();c++){
                int x = (int) s.charAt(c) - 'a';
                res += weights[x];
            }
            int map = res% 26;

            arr[i] = (char) (122- map);
            i++;
        }
        return String.valueOf(arr);
    }
}