class Solution {
    public int climbStairs(int n, int[] costs) {
        int[]dp = new int[n+1]; 
        Arrays.fill(dp , (int)1e9); 
        dp[0] = 0 ; 
        for( int i = 1 ;i <= n ;i++){
            int one =dp[i-1]+  1+costs[i-1];
            int two  =(int)1e9 ; 
            int three = (int)1e9 ; 
            if( i > 1 ){
                two =dp[i-2]+  4+costs[i-1]; 

            }
            if( i > 2 ){
                three =dp[i-3]+  9+costs[i-1]; 
            }
            dp[i] = Math.min(dp[i] , Math.min( one , Math.min( two , three))); 
        }
     
        return dp[n];  
        
    }
}