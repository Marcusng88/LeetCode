class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int sumLength = nums1.length+nums2.length;
        int[] arr = new int[sumLength];
        boolean odd = sumLength % 2 == 0 ? false : true ;
        int idx = (sumLength) /2;
        int left = 0; // nums1
        int right = 0; // nums2
        int counter = 0;
        while(right<nums2.length && left<nums1.length){
            if(nums1[left] <= nums2[right]){
                arr[counter] = nums1[left];
                left ++;
            }
            else{
                arr[counter] = nums2[right];
                right ++;
            }
            counter ++;

        }
        while(left<nums1.length){
            arr[counter] = nums1[left];
            left++;
            counter++;

        }
        while(right<nums2.length){
            arr[counter] = nums2[right];
            right++;
            counter++;
        }
        if(odd){
            return (double)arr[idx];
        }
        else{
            return ((double)(arr[idx-1]+arr[idx])/2);
        }
                

    }
}