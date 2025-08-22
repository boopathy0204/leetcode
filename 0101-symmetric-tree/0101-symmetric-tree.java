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
    ArrayList<Integer> list= new ArrayList<>();
    ArrayList<Integer> list1= new ArrayList<>();
    public boolean isSymmetric(TreeNode root) {
        if(root == null || root.left ==null && root.right == null) return true;
        if(root.left == null || root.right == null) return false;
        is(root.left);
        is1(root.right);
        for( int i=0;i<list.size();i++){
            if(list.get(i) != list1.get(i)) return false;
        }
        return true;
    }
    public  void is(TreeNode root){
        if(root != null){
            list.add(root.val);
            is(root.left);
            is(root.right);
        }
        list.add(100);
    }
    public  void is1(TreeNode root){
        if(root != null){
            list1.add(root.val);
            is1(root.right);
            is1(root.left);
        }list1.add(100);
    }
}