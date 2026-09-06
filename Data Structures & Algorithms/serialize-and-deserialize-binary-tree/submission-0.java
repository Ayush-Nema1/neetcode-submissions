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

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);
        

        while(!q.isEmpty()){
            TreeNode curr = q.remove();
              if (curr == null) {
        sb.append("#,");
    }else{
                      sb.append(curr.val).append(",");
             q.add(curr.left);
    q.add(curr.right);
            }

        }
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String s) {
            if (s == null || s.isEmpty()) return null;
        String[] arr = s.split(",");
           if (arr[0].equals("#")) return null;
        int i = 0;
        Queue<TreeNode> q = new LinkedList<>();
          TreeNode root = new TreeNode(Integer.parseInt(arr[i]));
          i++;
        q.add(root);
        while(!q.isEmpty() && i < arr.length){
            TreeNode curr = q.remove();
            if(i<arr.length &&   !arr[i].equals("#")) {
                curr.left = new TreeNode(Integer.parseInt(arr[i]));
                q.add(curr.left);
            }
             i++;
            if(i<arr.length && !arr[i].equals("#") ){
                curr.right = new TreeNode(Integer.parseInt(arr[i]) );
                q.add(curr.right);
            }
            i++;
        }
        return root;
    }
}
