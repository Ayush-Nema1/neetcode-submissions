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
    public List<Integer> rightSideView(TreeNode root) {
        if(root == null) return new ArrayList<>();
       Queue<TreeNode> q = new LinkedList<>();
       List<Integer>  a = new ArrayList<>();
         q.add(root);
         q.add(null);
       while(!q.isEmpty()){
        TreeNode r = q.remove();
        if(r == null){
            if(q.isEmpty()){
                break;
            }else{
                q.add(null);
            }
        }else{
            if(q.peek() == null) a.add(r.val);
            if(r.left!= null) q.add(r.left);
            if(r.right!= null) q.add(r.right);
        }
       }
       return a;
    }
}
