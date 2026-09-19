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
    public static void find( TreeNode root , int level , int[]lev  , List<Integer>list ){
        if( root == null ){
            return ; 
        }
        if( level > lev[0]){
            list.add(root.val); 
        }
        lev[0] = Math.max(lev[0], level ); 
        find(root.right , level+1 , lev  , list ); 
        find(root.left , level+1 , lev , list ); 
    }
    public List<Integer> rightSideView(TreeNode root) {
        int[]lev = new int[1]; 
      List<Integer>list = new ArrayList<>(); 
       find( root , 1 , lev , list ); 
       return list ; 
        
    }
}