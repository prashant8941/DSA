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
    public static int find(TreeNode root , boolean[]ans ){
        if( root == null )return 0 ; 
        int lh = find(root.left , ans ); 
        int rh = find( root.right , ans ); 
        if( Math.abs(lh -rh )> 1 ){
            ans[0] = false ; 
        }
        return Math.max(lh , rh )+1 ; 
    }
    public boolean isBalanced(TreeNode root) {
        boolean ans[] = new boolean[1]; 
        ans[0]= true ; 
        find( root , ans); 
        return ans[0]; 
        
    }
}