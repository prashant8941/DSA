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
    public static void find( TreeMap<Integer, List<Integer>>map , TreeNode root , int level){
        if( root == null ){
            return ; 
        }
        map.computeIfAbsent(level ,k->new ArrayList<>() ).add(root.val); 
        find( map , root.left , level+1) ;
        find( map , root.right , level+1); 
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        TreeMap<Integer , List<Integer>>map = new TreeMap<>(); 
        find( map , root , 0 ); 
        List<List<Integer>>ans = new ArrayList<>(); 
        for(List<Integer>lis: map.values()){
            ans.add(lis); 

        }
        return ans ; 
        
    }
}