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
    boolean flag= true;
    public boolean isBalanced(TreeNode root) {
        int res = is(root);
        return flag;
    }
    public int is(TreeNode root){
        if(root == null){
            return 0;
        }
        int l=is(root.left);
        int r=is(root.right);
        if(l-r <-1 || l-r > 1) flag =false;
        return 1 + Math.max(l,r);
    }
}