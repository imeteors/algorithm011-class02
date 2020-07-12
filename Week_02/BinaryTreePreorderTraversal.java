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
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root != null) {
            System.out.println(root.val + " ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
    }
}