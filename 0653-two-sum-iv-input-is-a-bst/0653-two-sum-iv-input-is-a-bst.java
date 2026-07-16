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
    List<Integer> ans = new ArrayList<>();
    public  void fun(TreeNode root){
        if(root == null) return;
        fun(root.left);
        ans.add(root.val);
        fun(root.right);
        
    }
    public boolean findTarget(TreeNode root, int k) {
        fun(root);
        int i = 0;
        int j = ans.size() - 1;
        while(i < j){
        if(ans.get(i) + ans.get(j) == k) return true;
        else if(ans.get(i) + ans.get(j) < k){
            i++;
        }else{
            j--;
        }
        }
        return false;
        
    }
}