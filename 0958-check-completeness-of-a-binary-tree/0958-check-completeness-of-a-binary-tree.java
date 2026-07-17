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
    public boolean fun(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean nullfound = false;
        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            if(curr == null){ //first time null milega toh true mark krlo 
                nullfound = true;
            }else{
                if(nullfound) return false; //again null mila toh false return krdo 
                q.offer(curr.left);
                q.offer(curr.right);
            }
        }
        return true;
    }
    public boolean isCompleteTree(TreeNode root) {
        return fun(root);
        
    }
}