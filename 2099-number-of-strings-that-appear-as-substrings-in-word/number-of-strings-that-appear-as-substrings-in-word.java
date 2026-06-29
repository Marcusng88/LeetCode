class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int res = 0;
        for(String s: patterns){
            for(int i = 0 ; i<=word.length()-s.length();i++){
                System.out.println(i);
                if(s.equals(word.substring(i,i+s.length()))){
                    // System.out.println(word.substring(i,i+s.length()));
                    res++;
                    break;
                }
            }
        }
        return res;
    }
}