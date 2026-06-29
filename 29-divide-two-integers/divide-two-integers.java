class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }

        // xor to check whether res is negative
        boolean negative = (dividend < 0) ^ (divisor <0);
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        int res = 0;

        while(a>=b){
            long temp = b;
            int multiple = 1;
            while(a>=(temp << 1)){
                temp <<=1;
                multiple <<=1;
            }

            res += multiple;
            a-=temp;



        }



        return negative? -res:res;
        
    }
}