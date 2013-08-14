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
    public int minDepth(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (root == null) {
            return 0;
        } else {
            if (root.left == null && root.right == null) {
                return 1;
            } else if (root.left == null && root.right != null) {
                return minDepth(root.right) + 1;
            } else if (root.left != null && root.right == null) {
                return minDepth(root.left) + 1;
            } else {
                int minLeft = minDepth(root.left) + 1;
                int minRight = minDepth(root.right) + 1;
                if (minLeft > minRight) {
                    return minRight;
                } else {
                    return minLeft;
                }
            }
        }
        
    }
}