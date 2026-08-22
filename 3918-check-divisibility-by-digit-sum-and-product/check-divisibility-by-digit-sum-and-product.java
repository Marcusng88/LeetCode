class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int product = 1;
        int x = n;
        while(n> 0){
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;

        }
        

        int need = sum + product;
        return x % need == 0 ;
    }
}