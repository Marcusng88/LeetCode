class Solution {
    public int myAtoi(String s) {
        int result = 0;
        int i =0;
        int n = s.length();
        int sign = 1;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        while(i<n && s.charAt(i)==' '){
            i++;
        }
        if( i<n && (s.charAt(i)=='-' || s.charAt(i)=='+')){
            if(s.charAt(i) == '-'){
                sign = -1;
            }
            i++;

        }

        // process digit
        while(i<n && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i) - '0';
            if(result > (max - digit ) / 10){
                if(sign==1){
                    return max;
                }
                else{
                    return min;
                }
            }
            result = result * 10 + digit;
            i++;
        }
        return sign * result;
        
    }
}