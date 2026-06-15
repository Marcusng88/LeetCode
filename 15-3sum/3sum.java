class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        HashSet<List<Integer>> check = new HashSet<>();
        for(int i = 0; i<nums.length;i++){
            int left = i+1;
            int right = nums.length -1;
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum == 0){
                    List<Integer> x = List.of(nums[i],nums[left], nums[right]);
                    if(!check.contains(x)){
                        check.add(x);
                        res.add(x);
                    }
                    left++;
                    right--;
                }
                else if(sum < 0) {
                    left++;
                }
                else if(sum > 0){
                    right --;
                }
            }
        }
        return res;
    }
}