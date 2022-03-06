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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null){
            return true;
        }
        
        if (p == null || q == null) {
            return false;
        }
        // check root value
        if (p.val == q.val) {
            boolean leftEqual = isSameTree(p.left, q.left);
            boolean rightEqual = isSameTree(p.right, q.right);
            return leftEqual & rightEqual;
        } else {
            return false;
        }     
        
    }
}