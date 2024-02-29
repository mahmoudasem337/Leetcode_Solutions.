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
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
            return true;
        return issymmetric(root.left,root.right);
    }
    private boolean issymmetric(TreeNode left , TreeNode right){
        if (left == null || right == null)
            return left == null && right == null;
        if(left.val != right.val)
            return false;

        return issymmetric(left.left , right.right) && issymmetric (left.right , right.left);
    }
}