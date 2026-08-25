class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length ; 
        int m = matrix[0].length ; 
        int[][]dp = new int[n][m]; 
        for( int i = 0 ;i < m; i++){
            dp[0][i] = matrix[0][i]; 
    
        }
        for( int i = 1 ;i < n; i++){
            for( int j = 0 ;j  < m ;j++){
                int left = (int)1e9 ; 
                int mid = (int)1e9 ; 
                int right = (int)1e9 ; 
                mid = matrix[i][j]+dp[i-1][j]; 
                if( j > 0 ){
                    left = matrix[i][j]+dp[i-1][j-1]; 
                }
                if( j < n-1 ){
                    right = matrix[i][j]+dp[i-1][j+1]; 
                }
                dp[i][j] = Math.min(left , Math.min( mid  , right )); 
            }
        }
        int ans = (int)1e9 ; 
        for( int i = 0 ; i < m ;i++){
            ans = Math.min( ans , dp[n-1][i]); 
        }
        return ans; 

        
    }
}