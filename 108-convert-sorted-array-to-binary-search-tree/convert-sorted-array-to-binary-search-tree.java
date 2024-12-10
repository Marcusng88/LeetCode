/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length==0) return null;
        return mergeArray(nums,0,nums.length-1);
        
    }
    public TreeNode mergeArray(int[] nums, int left,int right){
        if (left>right) return null;
        int middle = left+(right - left)/2;
        TreeNode node = new TreeNode(nums[middle]);
        node.left = mergeArray(nums,left,middle-1);
        node.right = mergeArray(nums,middle+1,right);
        return node;
    }
}