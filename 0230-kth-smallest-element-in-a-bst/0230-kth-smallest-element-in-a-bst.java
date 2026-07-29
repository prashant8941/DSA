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
    public static int count  ; 
    public static   void find(TreeNode root , int[]arr ){
        if( root == null ){
            return ; 
        }

        find( root.left  , arr); 
           count-- ;  
        if( count == 0 ){
            arr[0] = root.val ; 
        }
            
        find(root.right , arr); 
    }
    public int kthSmallest(TreeNode root, int k) {
        count  = k  ; 
        int[]arr = new int[1]; 
        find(root , arr);
        return arr[0];  
        
    }
}