/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int sumNumbers(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        return sumSubtree(root, 0);
    }
    public int sumSubtree(TreeNode root, int sum) {
        if (root == null) {
            return sum;
        } else {
            if (root.left == null && root.right == null) {
                return 10 * sum + root.val;
            } else if (root.left != null && root.right == null) {
                return  sumSubtree(root.left, 10 * sum + root.val);
            } else if (root.left == null && root.right != null) {
                return sumSubtree(root.right, 10 * sum + root.val);
            } else {
                return sumSubtree(root.right, 10 * sum + root.val) + sumSubtree(root.left, 10 * sum + root.val);
            }
        }
    }
}