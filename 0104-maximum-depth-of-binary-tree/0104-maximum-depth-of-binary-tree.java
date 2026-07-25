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
    public static void find(TreeNode root  , int level , int[]max){
        if(root == null )return ; 
        max[0] = Math.max( max[0], level ); 
        find(root.left , level+1 , max ); 
        find(root.right , level+1 , max ); 
    }
    public int maxDepth(TreeNode root) {
        if( root == null )return 0 ; 
        int max[] = new int[1]; 
        find(root , 0 , max); 
        return max[0]+1; 
        
    }
}