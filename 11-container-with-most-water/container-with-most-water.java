class Solution {
    public int maxArea(int[] height) {
        int res = 0;
        int left = 0;
        int right = height.length -1;
        while(left< right){
            int currentHeight = Math.min(height[left], height[right]);
            int currentWidth = right - left;
            res = Math.max(currentHeight * currentWidth, res);
            if (height[left] < height[right] ){
                left++;
            }
            else{
                right --;
            }

        }
        return res;
        
    }
}