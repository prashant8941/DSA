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
    public static boolean isNull(TreeNode root ){
        if( root.left == null && root.right == null ){
            return true  ; 
        }
        return false ; 
    }
    public static int find( TreeNode root , int max[]){
        if( root == null ){
            return 0 ; 
        }
        int lh =Math.max(0,  find(root.left , max  )); 
        int rh =Math.max(0 ,  find(root.right , max )); 
        max[0] = Math.max(max[0] , lh +rh +root.val); 
        return  root.val + Math.max(lh , rh ); 
    }
    public int maxPathSum(TreeNode root) {
        // if( root== null ){
        //     return 0 ; 
        // }
        // if( root.left == null && root.right == null ){
        //     return root.val ; 
        // }
        int max[] = new int[]{Integer.MIN_VALUE};
       
        find(root, max); 
        return max[0];

        
    }
}