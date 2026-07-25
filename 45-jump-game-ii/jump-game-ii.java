class Solution {
    public int jump(int[] nums) {
        // eg 2,3,1,1,4
        // 2
        // 0->1, 1->4 
        // (choose step (1,2) in the first step)
        // (choose step (1,2,3) in the second step)
        int lastIdx = nums.length-1;

        // x to loop to find the earliest index that can reach the lastidx
        int x = nums.length-1;
        int sum = 0;
        while(x>0){
            for(int i = 0 ; i<x;i++){

                // if current index can reach last index
                // set last index to current index, add 1 to the path
                if(i+nums[i]>=lastIdx){
                    lastIdx = i;
                    sum++;
                    x = lastIdx;
                    break;
                }
            }
        }

        return sum;
        
    }
}