class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length ; 
        int[][]dp = new int[n][amount+1]; 
        for( int i = 0 ;i <= amount ; i++){
            if(i% coins[0] == 0 ){
                dp[0][i] = 1 ; 
            }
        }
        for( int i =1 ;i <n ;i++){
            for( int j = 0 ;j <= amount ;j++){
                int nt = dp[i-1][j]; 
                int tk = 0 ; 
                if( j>= coins[i]){
                    tk = dp[i][j-coins[i]];
                }
                dp[i][j] = tk+nt ; 

            }
        }
        return dp[n-1][amount]; 
    }
}