class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || preorder.length == 0 || inorder == null || inorder.length == 0 || preorder.length != inorder.length) {
            return null;
        }
        return help(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    private TreeNode help(int[] preorder, int pStart, int pEnd, int[] inorder, int iStart, int iEnd) {
        if (pStart > pEnd || iStart > iEnd) {
            return null;
        }
        
        TreeNode treeNode = new TreeNode(preorder[pStart]);
        int index = 0;  
        while (inorder[iStart + index] != preorder[pStart]) {
            index++;
        }
        
        treeNode.left = help(preorder, pStart + 1, pStart + index, inorder, iStart, iStart + index - 1);
        
        treeNode.right = help(preorder, pStart + index + 1, pEnd, inorder, iStart + index + 1, iEnd);
        return treeNode;

    }
}