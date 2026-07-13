class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < n - 3; i++) {
            // Skip duplicate first pivot
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < n - 2; j++) {
                // Skip duplicate second pivot
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                long needed = (long) target - nums[i] - nums[j];

                int left = j + 1;
                int right = n - 1;

                while (left < right) {
                    long curr = (long) nums[left] + nums[right];

                    if (curr == needed) {
                        res.add(List.of(
                            nums[i],
                            nums[j],
                            nums[left],
                            nums[right]
                        ));

                        left++;
                        right--;

                        while (left < right && nums[left] == nums[left - 1]) {
                            left++;
                        }
                        while (left < right && nums[right] == nums[right + 1]) {
                            right--;
                        }

                    } else if (curr < needed) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return res;
    }
}