class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int res = 0;
        
        for(int i = 0; i<nums.length; i++){
            int targetCount = 0;
            for(int j = i; j<nums.length;j++){
                if(nums[j]== target) targetCount++;
                if(2*targetCount > j-i +1){
                    res++;
                }
            }
        }
        return res;
    }
}