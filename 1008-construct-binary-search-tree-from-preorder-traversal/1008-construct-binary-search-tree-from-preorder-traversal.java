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
    int idx = 0;
    public TreeNode build(int []preorder,long min,long max){
        if(idx == preorder.length) return null;

        int val = preorder[idx];
        // first call agr val -infinite se +infinite ke bich he toh root create krenge since ye preorder he isiliye phla element hi root hoga
        if(val <= min || val >= max) return null; //range ko satisfy kra toh  null
    

        TreeNode root = new TreeNode(val);
        idx++;
        root.left = build(preorder,min,val); // -infinite se current val (-inf,8)
        root.right = build(preorder,val,max);
        return root;

    }
    public TreeNode bstFromPreorder(int[] preorder) {
        return build(preorder,Long.MIN_VALUE,Long.MAX_VALUE);
        
    }
}