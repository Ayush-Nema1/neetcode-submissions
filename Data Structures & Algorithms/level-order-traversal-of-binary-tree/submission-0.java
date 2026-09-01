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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) return new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>>  ans = new ArrayList<>();

        q.add(root);
        
        while(!q.isEmpty()){
            int s = q.size();
            List<Integer> a = new ArrayList<>();
            for(int i = 0;i<s;i++){
             TreeNode r = q.remove();
            if(r != null){ a.add(r.val);
            if(r.left !=null) q.add(r.left); 
            if(r.right !=null) q.add(r.right); 
            }

            }
            ans.add(a);
        }
        return ans;
    }
}
