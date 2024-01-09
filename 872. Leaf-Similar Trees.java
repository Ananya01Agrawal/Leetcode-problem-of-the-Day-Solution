class Solution {
    public static void findLeaves(TreeNode root,ArrayList<Integer>list){
        //base condition
        if(root==null) return;
        if(root.left==null && root.right==null)
            list.add(root.val);
        //condition
        findLeaves(root.left,list);
        findLeaves(root.right,list);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> list1=new ArrayList<>();
        findLeaves(root1,list1);
        ArrayList<Integer>list2=new ArrayList<>();
        findLeaves(root2,list2);
        if(list1.equals(list2))
            return true;
        return false;
        
    }
}
