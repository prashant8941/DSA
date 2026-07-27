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
    public static TreeNode ret = null ; 
    public static void find(TreeNode root , int val  ){
        if( root  == null )return ; 
        if(root.val == val ){
            ret = root ;  
        }
        find(root.left, val ); 
        find( root.right , val); 
    }
    public TreeNode searchBST(TreeNode root, int val) {
       ret = null ;  
        find( root , val ); 
        return ret ; 
        
    }
}