class Solution {
    int maxans;

    public int cal(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int l = Math.max(0, cal(root.left));
        int r = Math.max(0, cal(root.right));

        // Path passing through current node
        int maxwithroot = l + root.val + r;

        // Update global answer
        maxans = Math.max(maxans, maxwithroot);

        // Return only one side to parent
        return root.val + Math.max(l, r);
    }

    public int maxPathSum(TreeNode root) {
        maxans = Integer.MIN_VALUE;
        cal(root);
        return maxans;
    }
}