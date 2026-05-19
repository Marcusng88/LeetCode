class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int pointerNum1 = 0;
        int pointerNum2 = 0;
        while(pointerNum1 < nums1.length && pointerNum2 < nums2.length){
            int currNum1 = nums1[pointerNum1];
            int currNum2 = nums2[pointerNum2];

            if(currNum1 == currNum2){
                return currNum1;
            }
            if(currNum1 < currNum2){
                pointerNum1 ++;
            }
            else{
                pointerNum2 ++;
            }
        }
        return -1;
    }
}