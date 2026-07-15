/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Base Case
        if(root == null || root == p || root == q) return root; // 2nd call = 5 than we get 1 

        TreeNode left = lowestCommonAncestor(root.left,p,q); // 2nd call me 5 milega left me 
        TreeNode right = lowestCommonAncestor(root.right,p,q); 

        if(left != null && right != null) return root; // agr dono null nhi he mtlb boss unki common root hi he 
//         if (left != null && right != null)
//     return root;

// Iske baad sirf 3 possibilities bachti hain:

// left 	right 	Return
// Node 	null	left
// null 	Node	right
// null 	null	null

        return left != null ? left : right; 
      

    }
}