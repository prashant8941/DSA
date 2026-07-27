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
    public static boolean find(TreeNode root , long l , long r ){
        if(root == null )return true ; 
        if( root.val <= l || root.val >= r ){
            return false ; 
        }
        return find(root.left , l, root.val )&& find(root.right , root.val , r ); 
    }

    public boolean isValidBST(TreeNode root) {
        long l = Long.MIN_VALUE  ; 
        long h = Long.MAX_VALUE ; 
       return  find(root , l , h );  
        
    }
}