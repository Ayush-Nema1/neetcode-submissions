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
    public int h(TreeNode root){
        if(root == null){
            return 0;
        }
        int l = h(root.left);
        int r = h(root.right);

        return Math.max(l,r)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        int lh = h(root.left);
        int dl = diameterOfBinaryTree(root.left);
        int rh = h(root.right);
        int dr = diameterOfBinaryTree(root.right);

        int self = Math.max(Math.max(dl , dr),lh+ rh );
        return self;
    }
}
