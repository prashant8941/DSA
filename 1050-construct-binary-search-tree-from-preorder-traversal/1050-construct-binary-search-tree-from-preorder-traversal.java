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
    private static  int index = 0 ;
    public static TreeNode find(int[]preorder, int low , int high ){
        if(index == preorder.length)return null ; 
        int val = preorder[index]; 
        if( val < low || val > high)return null ; 
        index++ ; 
        TreeNode root = new TreeNode(val); 
        root.left =find(preorder , low , val); 
        root.right = find(preorder , val , high ); 
        return root; 
    } 
    public TreeNode bstFromPreorder(int[] preorder) {
        index = 0  ; 
        int min = Integer.MIN_VALUE ; 
        int max = Integer.MAX_VALUE ; 
        return find(preorder , min , max ); 
        
    }
}