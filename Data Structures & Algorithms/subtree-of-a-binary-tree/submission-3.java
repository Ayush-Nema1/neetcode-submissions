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
    public boolean isSame(TreeNode r,TreeNode s){
        if(s == null && r == null) return true;
        else if(r == null || s == null || r.val != s.val) return false;

       else  if(!isSame(r.left , s.left)){
            return false;
        }
        else if(!isSame(r.right , s.right)){
            return false;
        }
        return true;
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
           if(root == null ) return false;
        
            if(root.val == subRoot.val){
            if(isSame(root,subRoot)){
                   return true;
            }
            }
                return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
           
    }
}
