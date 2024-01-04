class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;
        
        // Map to store the indices of elements in the inorder traversal
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++)
            map.put(inorder[i], i);

        // Call the helper function to build the tree
        return buildTree(inorder, 0, n - 1, postorder, 0, n - 1, map);
    }
    
    private TreeNode buildTree(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd, HashMap<Integer, Integer> map) {

        // Base case: If the start indices exceed the end indices, return null (no elements)
        if (inStart > inEnd || postStart > postEnd) 
            return null;

        // The root value of the current subtree is at the end of postorder array
        int rootVal = postorder[postEnd];
        TreeNode root = new TreeNode(rootVal);
        
        // Find the index of the root value in the inorder traversal
        int rootIndex = map.get(rootVal);

        // Calculate the sizes of left and right subtrees
        int leftSize = rootIndex - inStart;
        int rightSize = inEnd - rootIndex;
        
        // Recursively build left and right subtrees
        root.left = buildTree(inorder, inStart, rootIndex - 1, postorder, postStart, postStart + leftSize - 1, map);
        root.right = buildTree(inorder, rootIndex + 1, inEnd, postorder, postEnd - rightSize, postEnd - 1, map);
        
        return root; // Return the constructed root of the subtree
    }
}
