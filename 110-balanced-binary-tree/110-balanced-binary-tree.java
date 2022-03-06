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
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }   
        // calc left tree height
        int leftTreeHeight = calcHeight(root.left);
        boolean isLeftBalanced = isBalanced(root.left);
        // calc right tree height
        int rightTreeHeight = calcHeight(root.right);
        boolean isRightBalanced = isBalanced(root.right);
        
        if (Math.abs(leftTreeHeight - rightTreeHeight) <= 1) {
            return isLeftBalanced & isRightBalanced;
        }
        
        return false;
    }
    
    
    public int calcHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        int leftHeight = calcHeight(root.left);
        int rightHeight = calcHeight(root.right);
        
        return Math.max(leftHeight, rightHeight) + 1;
    }
}