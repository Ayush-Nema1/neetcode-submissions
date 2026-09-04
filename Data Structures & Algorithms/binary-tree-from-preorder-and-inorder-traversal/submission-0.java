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
   public static int idx = 0;
    public int find(int[] inOrder ,int n){
    
    for(int i = 0;i<inOrder.length;i++){
        if(inOrder[i] == n){
            return i;
        }
    }
    return -1;
    }
    public TreeNode madetree(int[] preorder , int[] inorder,int l,int r){
        if(l>r) return null;

        TreeNode root = new TreeNode(preorder[idx++]);
        int mid = find(inorder,root.val);
        root.left = madetree(preorder,inorder,l,mid-1);
        root.right  = madetree(preorder,inorder,mid+1,r);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        idx = 0;
        int l = 0;
        int r = preorder.length-1;
       return  madetree(preorder,inorder,0,r);
           
             }
}
