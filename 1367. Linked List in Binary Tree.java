class Solution {
     private boolean check(ListNode head, TreeNode root) {
        // Edge Case
        if (head == null) {
            return true;
        }
        if (root == null) {
            return false;
        }

        return head.val == root.val &&
                (check(head.next, root.left) || check(head.next, root.right));
    }

    public boolean isSubPath(ListNode head, TreeNode root) {
        // Edge Case
        if (head == null) {
            return true;
        }
        if (root == null) {
            return false;
        }

        return check(head, root)
                || isSubPath(head, root.left)
                || isSubPath(head, root.right);
    }
}
    
