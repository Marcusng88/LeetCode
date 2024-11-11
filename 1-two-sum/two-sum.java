class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] numlist = new int[2];
        for (int i=0 ; i<nums.length;i++){
            for (int j=0 ; j<nums.length;j++){
                if( i==j){
                    break;
                }
                else if(nums[i]+nums[j]==target){
                    numlist[0]=i;
                    numlist[1]=j;
                    return numlist;
                }
            }
        }
        return numlist;

    }
}