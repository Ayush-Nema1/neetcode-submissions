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
    int c = 0;
    public int dfs(TreeNode root,int max){
        if(root == null){
            return 0;
        }
        if(root.val >= max){
            max = root.val;
            c++;
        }
        dfs(root.left,max);
        dfs(root.right,max);
        return c;
    }
    public int goodNodes(TreeNode root) {
      c = 0;
        return dfs(root,root.val);
    }
}
