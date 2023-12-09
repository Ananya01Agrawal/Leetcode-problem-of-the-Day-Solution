class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> ans=new ArrayList<>();
        help(root,ans);
        return ans;
    }
    public void help(TreeNode root, ArrayList<Integer> ans){
        if(root==null){
            return;
        }
        help(root.left,ans);
        ans.add(root.val);
        help(root.right,ans);
    }
}
