class Solution {
    public int findBottomLeftValue(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        helper(root,ans,0);
        // Return the value at the last index of the list,
        // which represents the leftmost value in the bottom row
        return ans.get(ans.size()-1);
    }
    public void helper(TreeNode root,List<Integer>ans,int level){
        if(root==null) return;
         // If the current level equals the size of the list 'ans',
        // it implies we are visiting this level for the first time,
        // so add the value of the current node to the list.
        if(level==ans.size()){
            ans.add(root.val);
        }
        // Traverse left and right subtrees, incrementing the level by 1
        helper(root.left,ans,level+1);
        helper(root.right,ans,level+1);
    }
}
