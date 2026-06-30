class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length-1;
        int i = n-1;

        while(i>=0 && nums[i] >= nums[i+1]){
            i--;
        }
        if(i>=0){
            swap(nums, i);
        }
        reverse(nums, i+1);

    }

    static void swap(int[] nums,int i){
        int idx = i+1;
        for(int j = i+1;j<nums.length;j++){
            // check current minimum greater than current looping element , maybe need swap , then check whether current looping element is bigger than pivot or not
            if(nums[idx]>=nums[j] && nums[j] > nums[i]){
                idx = j;
            }
        }
        int temp = nums[idx];
        nums[idx] = nums[i];
        nums[i] = temp;

    }

    static void reverse(int[] nums, int start){
        int left = start;
        int right = nums.length-1;
        while(left<right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}