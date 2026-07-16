class Solution {
    public long gcdSum(int[] nums) {
        long[] prefix = new long[nums.length];
        long mx = nums[0];
        // construct predix gcd
        for(int i = 0; i<nums.length;i++){
            mx = Math.max(nums[i], mx);
            if(mx >nums[i]){
                prefix[i] = gcd(mx, nums[i]);
            }
            else{
                prefix[i] = gcd(nums[i], mx);
            }
            
        }

        Arrays.sort(prefix);
        // find sum , two pointer
        int left = 0;
        int right = prefix.length -1;
        long sum = 0;
        while(left<right){
            sum += gcd(prefix[right],prefix[left]);
            left++;
            right--;
        }
        return sum;

    }

    private long gcd(long a, long b){
        while(b!= 0){
            long r = a % b;
            long temp = a;
            a = b;
            b = r;

        }
        return a;
    }


}