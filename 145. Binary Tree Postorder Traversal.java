class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer>list=new ArrayList<>();
        help(root,list);
        return list;
    }
    public void help(TreeNode root, ArrayList<Integer>list){
        if(root==null){
            return;
        }
        
        
        help(root.left,list);
        help(root.right,list);
        list.add(root.val);
    
        
    }
}
