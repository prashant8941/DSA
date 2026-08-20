class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length ; 
        int[][]dp = new int[n][amount+1];

Arrays.sort(coins); 
        for(int i = 0 ;i <= amount ;i++){
            if( i % coins[0] == 0   ){
              
                    dp[0][i] = i/coins[0]; 
            }
                else{
                    dp[0][i] = (int)1e9 ; 
                }
         
        }
        // dp[0][0] = 0 ; 
        for(int i = 1 ;i < n ;i++){
            for( int j = 0 ;j <= amount ;j++){
                int ntake = dp[i-1][j];
                int take  = (int)1e9  ;  
                if( coins[i] <=  j ){
                    take = 1  + dp[i][j - coins[i]];
                   
                }
                dp[i][j] = Math.min( take , ntake); 

            }
        }

       return dp[n - 1][amount] >= (int)1e9 ? -1 : dp[n - 1][amount];
        
    }
}