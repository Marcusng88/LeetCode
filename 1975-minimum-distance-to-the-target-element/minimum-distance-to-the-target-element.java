class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int res = Integer.MAX_VALUE;
        for(int i =0 ; i<nums.length;i++){
            if(nums[i]== target){
                res = Math.min(Math.abs(i-start), res);
            }
        }
        return res;
        
    }
}