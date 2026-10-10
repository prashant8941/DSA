class Solution {
    public int minPathSum(int[][] grid) {
        int n = grid.length ; 
        int m  = grid[0].length ; 
        int[][]dp =new int[n][m]; 
        for( int i = 0 ;i < n ;i++){
            for( int j = 0 ;j < m ;j++){
                int up = (int)1e9 ; 
                int left = (int)1e9 ; 
                if( i > 0 ){
                    up  = dp[i-1][j]; 
                }
                if( j  > 0  ){
                    left = dp[i][j-1]; 
                }
                if( up ==(int)1e9 && left == (int)1e9){
                    up  =  0 ; 
                }
                dp[i][j]= grid[i][j] + Math.min( up , left); 

            }
        }
            return dp[n-1][m-1]; 
        
        
    }
}