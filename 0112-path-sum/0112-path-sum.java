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
    boolean ans = false;
    public  void fun(TreeNode root,int sum,int targetSum){
        if(root == null || ans) return;
            sum += root.val;
        
        if(root.left == null && root.right == null){
            if(sum == targetSum){
                ans = true;
            }
        }
        fun(root.left,sum,targetSum);
        fun(root.right,sum,targetSum);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
    fun(root,0,targetSum);
    return ans;

        
    }
}