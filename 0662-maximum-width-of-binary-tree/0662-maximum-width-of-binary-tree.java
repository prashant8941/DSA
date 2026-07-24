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
    class Pair{
        TreeNode node ; 
        long index ; 
        Pair( TreeNode node , long  index ){
            this.node = node; 
            this.index = index; 
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        if( root == null )return 0 ; 
        long ans = 0 ; 
        Queue<Pair>q = new LinkedList<>(); 
        q.add(new Pair(root, 0 )); 
        while(!q.isEmpty()){
            int size = q.size(); 
            long  f = -1 ; 
            long l = -1 ; 
            for( int i = 0 ;i < size ; i++){
                Pair p = q.poll(); 
                TreeNode  nd= p.node ; 
                long  ind =  p.index ; 
                if( i == 0 )f = ind ; 
                if( i == size-1)l = ind; 
                if( nd.left != null ){
                    q.add(new Pair(nd.left , 2*ind+1)); 
                }
                if( nd.right != null ){
                    q.add(new Pair(nd.right , 2*ind+2)); 
                }
           
            }
                 ans = Math.max(ans , l-f+1); 
        }
        return  (int) ans ; 
        
    }
}