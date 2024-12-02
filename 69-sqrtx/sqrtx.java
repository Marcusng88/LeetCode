class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        
        int low = 1;
        int high = x;
        int result = 0;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (mid <= x / mid) {  // Avoid overflow by using division instead of multiplication
                low = mid + 1;
                result = mid;  // Update result when mid^2 <= x
            } else {
                high = mid - 1;
                result = high;  // Update result when mid^2 > x
            }
        }
        
        return result;
}
}