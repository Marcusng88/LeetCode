class Solution {
    public boolean canJump(int[] nums) {
        if (nums.length ==1) return true;

        int furthest = nums[0];

        for(int i =1;i<nums.length;i++){
            if(furthest >= nums.length-1) return true;
            if(furthest < i) return false;
            furthest = Math.max(furthest, i+nums[i]);
            
            
        }
        return false;
    }
}