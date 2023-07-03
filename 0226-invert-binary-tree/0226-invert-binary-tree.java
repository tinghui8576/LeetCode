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
    public TreeNode invertTree(TreeNode root) {
        TreeNode ans = root;
        
        if(root != null){
            TreeNode cur_l = root.left;
            TreeNode cur_r = root.right;

            root.left = cur_r;
            root.right = cur_l;   
            
            invertTree(root.left);
            invertTree(root.right);
        }
        
        
        return ans;
    }
}