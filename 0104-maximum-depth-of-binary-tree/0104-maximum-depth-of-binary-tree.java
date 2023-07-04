/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        
        if(root == null)  
             return 0;     

        int depth_l = maxDepth(root.left);
        int depth_r = maxDepth(root.right);
        if (depth_l > depth_r)
            return depth_l+1;
        else
            return depth_r+1;
    }
}