class Solution {
    public int removeElement(int[] nums, int val) {
        int j = 0; // Pointer for non-val elements
            
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != val) {
                    nums[j] = nums[i];
                    j++;
                }
            }
            
            return j; // Number of elements not equal to val
        
    }
}