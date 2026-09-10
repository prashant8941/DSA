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
 class Result {
    int sum;
    int count;

    Result(int sum, int count) {
        this.sum = sum;
        this.count = count;
    }
}

class Solution {
    public static Result solve (TreeNode root, int[]ans  ){
              if (root == null) {
        return new Result(0, 0);
    }

    Result left = solve(root.left, ans );
    Result right = solve(root.right, ans );

    int sum = root.val + left.sum + right.sum;
    int count = 1 + left.count + right.count;
    if( (sum /count )== root.val ){
        ans[0]++ ; 
    }

    return new Result(sum, count); 
    }
    public int averageOfSubtree(TreeNode root  ) {
        int[]ans= new int[1]; 
        solve(root , ans ) ; 
        return ans[0]; 
    
    }
}