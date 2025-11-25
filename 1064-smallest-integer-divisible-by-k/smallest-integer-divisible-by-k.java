class Solution {
    public int smallestRepunitDivByK(int k) {
        if (k % 2 == 0 || k % 5 == 0) return -1;
        int i = 0;
        int length = 0;
        while(true){
            i = (i * 10 + 1) % k;
            length ++;
            if (i == 0) return length;
        }
    }
}