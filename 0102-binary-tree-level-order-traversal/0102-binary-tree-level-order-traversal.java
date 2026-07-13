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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();  // ans store krenge
        if(root == null) return ans;  //root null hua toh empty list return krenge
        Queue<TreeNode> q = new LinkedList<>(); 
        q.offer(root); //root aur uski val daldi queue me
        while(!q.isEmpty()){

            int size = q.size();

            List<Integer> level = new ArrayList<>(); //tree ka level wise traversal ans store krne k liye
             
            for(int i = 0; i < size; i++){
                TreeNode curr = q.poll();
                level.add(curr.val);
                if(curr.left != null){
                    q.offer(curr.left);
                }
                if(curr.right != null){
                    q.offer(curr.right);
                }
               

            }
             ans.add(level);
        }
        return ans;
    }
}