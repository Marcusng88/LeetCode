class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==1) return s;
        if(s.length()==0) return "";
        String res = "";
        for(int i =0;i<s.length();i++){
            String odd = expand(s, i, i );
            String even = expand(s, i, i+1);
            String longer = odd.length() > even.length() ? odd : even;
            if(longer.length()> res.length()){
                res=  longer;
            }
        }
        return res;
    }

    static String expand(String s, int left, int right){
        while(left>=0 && right < s.length() && s.charAt(right) == s.charAt(left)){
            left--;
            right ++;
        }
        return s.substring(left+1, right);
    }
}