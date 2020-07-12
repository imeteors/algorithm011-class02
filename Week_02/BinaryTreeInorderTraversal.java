/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root != null) {
            preorderTraversal(root.left);
            System.out.println(root.val + " ");
            preorderTraversal(root.right);
        }
    }
}