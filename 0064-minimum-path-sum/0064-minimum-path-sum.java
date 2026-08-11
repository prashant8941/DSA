class Solution {
    public int minPathSum(int[][] grid) {
        int n = grid.length ; 
        int m = grid[0].length ; 
        int[][]dp = new int[n][m];
        for( int i = 0 ;i < n ;i++){
            for( int j = 0;j < m ;j++){
                int left = (int)1e9 ; 
                int right = (int)1e9 ; 
                if( i>0 ){
                    left = dp[i-1][j]; 
                }
                if( j > 0 ){
                    right = dp[i][j-1]; 
                }
                if(left == (int)1e9  && right == (int)1e9){
                    left = 0 ; 
                }
                dp[i][j] = grid[i][j]   +Math.min(left , right ); 
 
            }
        } 
        return dp[n-1][m-1];
        
    }
}