class Solution {
  
    public int minCost(int[][] grid) {
        int n = grid.length ; 
        int m  = grid[0].length ; 
       boolean[][][]dp = new boolean[n][m][1024]; 
        dp[0][0][grid[0][0]] = true ; 
        for( int i = 0 ;i < n ;i++){
            for( int j = 0 ;j < m ;j++){
                for( int x = 0 ;x< 1024 ; x++){
                    if(!dp[i][j][x])continue ; 
                    if( i + 1 < n ){
                        int nx =x^ grid[i+1][j]; 
                        dp[i+1][j][nx] = true ; 
                    }
                    if( j+1 < m ){
                        int nx = x^ grid[i][j+1]; 
                        dp[i][j+1][nx] = true ; 
                    }
                }
            }
        }
        int ans = Integer.MAX_VALUE ; 
        for( int x = 0 ;x< 1024 ; x++){
            if( dp[n-1][m-1][x]){
                ans = Math.min(ans , x ); 
            }
        }
        return ans ; 
        
    }
}