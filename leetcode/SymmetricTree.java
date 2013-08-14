public class Solution {
  public boolean isSymmetric(TreeNode root) {
    if (root == null) {
      return true;
    } else {
      return isMirroring(root.left, root.right);
    }
  }
  public boolean isMirroring(TreeNode l, TreeNode r) {
    if (l != null && r != null) {
      if (l.val == v.val) {
        return isMirroring(l.left, r.right) && isMirroring(l.right, r.left);
      }
    } else if ( l == null && r == null) {
      return true;
    }
    return false;
  }
}

