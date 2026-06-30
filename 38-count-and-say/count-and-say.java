class Solution {
    public String countAndSay(int n) {
        return helper(n);
    }

    static String helper(int n){
        if(n==1) return "1";

        String res = helper(n-1);
        return findRle(res);
    }

    static String findRle(String res){
        int idx = 0;
        StringBuilder finalRes = new StringBuilder();
        while(idx<res.length()){
            char currentChar = res.charAt(idx);
            // count how many same char 
            int counter = 0;
            while(idx<res.length() && res.charAt(idx)==currentChar){
                counter++;
                idx ++;
            }
            finalRes.append(String.valueOf(counter));
            finalRes.append(currentChar);
        }

        return finalRes.toString();
    }
}