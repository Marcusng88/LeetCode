class Solution {
    public long maxSubarraySum(int[] nums, int k) {

        long[] minPref = new long[k];
        Arrays.fill(minPref,Long.MAX_VALUE);
        minPref[0] = 0;
        long res = Long.MIN_VALUE;
        long prefixSum = 0;

        for(int j = 0 ; j < nums.length ; j++){
            prefixSum += nums[j];

            int r = (j+1) % k;
            if (minPref[r] != Long.MAX_VALUE){
                res = Math.max(res , prefixSum - minPref[r]);
            }
            minPref[r] = Math.min(minPref[r], prefixSum);
        }
        return res;

    }
}