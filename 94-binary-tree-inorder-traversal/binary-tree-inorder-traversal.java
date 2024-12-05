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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root,list);
        return list;   
    }
    private void inorder(TreeNode node, ArrayList<Integer> list) {
        if (node == null) {
            return;
        }
        // Traverse the left subtree
        inorder(node.left, list);
        // Visit the current node
        list.add(node.val);
        // Traverse the right subtree
        inorder(node.right, list);
    }
}