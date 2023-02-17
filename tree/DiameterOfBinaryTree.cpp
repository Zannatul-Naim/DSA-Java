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

    int getDepth(TreeNode root) {

        if(root == null) return 0;

        int l = getDepth(root.left);
        int r = getDepth(root.right);

        return Math.max(l, r)+1;
    }

    public int diameterOfBinaryTree(TreeNode root) {

        if(root == null) return 0;

        int leftD = diameterOfBinaryTree(root.left);
        int rightD = diameterOfBinaryTree(root.right);

        int d = getDepth(root.left) + getDepth(root.right);

        d = Math.max(d, Math.max(leftD, rightD));

        return d;
        
    }
}
