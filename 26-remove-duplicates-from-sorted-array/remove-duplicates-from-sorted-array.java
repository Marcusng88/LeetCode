class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length==0) return 0;

        // use two pointers technique,initialize i =0 ,then iterate through the nums
        // if find current element is unique and not same as i,move i pointer one step to the
        // right and replace the current element of index i with the element of index j
        int i =0;
        for(int j = 1;j<nums.length;j++){
            if(nums[i]!= nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;


        
    }
}