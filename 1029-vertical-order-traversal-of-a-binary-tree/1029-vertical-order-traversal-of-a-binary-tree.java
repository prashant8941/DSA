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
    public static void find(TreeMap<Integer, TreeMap<Integer , PriorityQueue<Integer>>>map, TreeNode root , int row , int col  ){
        if( root == null ){
            return ; 
        }
        map.computeIfAbsent(col, k-> new TreeMap<>()).
        computeIfAbsent(row , k->new PriorityQueue<>()).add(root.val); 

            find( map , root.left , row+1 , col-1); 
         find(map , root.right ,row+1 , col+1 ); 
   
       
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>>ans = new ArrayList<>()  ; 
        TreeMap<Integer, TreeMap<Integer , PriorityQueue<Integer>>>map = new TreeMap<>(); 
        find( map , root , 0 , 0 ); 


        for( TreeMap<Integer ,  PriorityQueue<Integer> >rows :map.values() ){
            List<Integer>column = new ArrayList<>(); 
            for( PriorityQueue<Integer>values : rows.values()){
                while(!values.isEmpty()){
                    column.add(values.poll()); 
                }

            }
            ans.add(column); 
        }
       
        return ans ; 
        
    }
}