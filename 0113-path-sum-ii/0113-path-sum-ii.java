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
    List<List<Integer>> ans = new ArrayList<>(); //list add krne k liye

    public void fun(TreeNode root,int sum,int targetsum,List<Integer> list){
        if(root == null ) return;
        sum += root.val;
        list.add(root.val);
        if(root.right == null && root.left == null){
            if(sum == targetsum){
                ans.add(new ArrayList<>(list));  // isme hmesha new ArrayList use krna backtracking choices list  k liye
               
            }
        }
        fun(root.left,sum,targetsum,list);
        fun(root.right,sum,targetsum,list);
        list.remove(list.size()-1); // backtracking

    }
    public List<List<Integer>> pathSum(TreeNode root, int targetsum) {
        ans.clear();
        List<Integer> list = new ArrayList<>();
        fun(root,0,targetsum,list);
        return ans;

        
    }
}