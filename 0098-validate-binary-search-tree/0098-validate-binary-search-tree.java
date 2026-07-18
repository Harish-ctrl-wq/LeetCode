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
    // List<Integer> list = new ArrayList<>();
    TreeNode prev = null;
    boolean ans = true;
   
    public void fun(TreeNode root){
       
        if(root == null || !ans ) return;
        fun(root.left);
    
        if(prev != null && root.val <= prev.val){
            ans = false;
            return;
        }
        prev = root;
        // list.add(root.val);
        fun(root.right);

    }
    public boolean isValidBST(TreeNode root) {
        
        fun(root);
        // for(int i = 0; i < list.size()-1; i++){
        //     if(list.get(i) >= list.get(i+1)) return false;

        // }
        return ans;

        
    }
}