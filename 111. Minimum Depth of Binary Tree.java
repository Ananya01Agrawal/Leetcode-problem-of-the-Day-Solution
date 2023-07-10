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
    public int minDepth(TreeNode root) {
       // if the subtree is empty i.e root is null
       if(root==null) return 0;
       int leftDepth=minDepth(root.left);
       int rightDepth=minDepth(root.right);
       // if both the subtrees are empty
       if(root.left==null && root.right==null)
            return 1;
       // if the left subtree is empty, return the right subtree after adding 1 to it
       if(root.left==null)
            return 1+rightDepth;
        // if the right subtree is empty, return the left subtree after adding 1 to it
        if(root.right==null)
            return 1+leftDepth;

        // when the two child function return its depth..
        // pick the minimum out of these two subtrees and return this value after adding 1 to it
        return Math.min(leftDepth,rightDepth)+1;
    }
}
