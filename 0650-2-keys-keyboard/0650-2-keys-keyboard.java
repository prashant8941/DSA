class Solution {
    public int minSteps(int n) {
        if( n == 1 )return 0 ; 
        int[]dp = new int[n+1]; 
        for( int i = 0 ;i <= n ;i++){
            dp[i] =  i ; 
        }
        dp[1] =0 ; 
        dp[2] = 2 ; 
        for( int i = 3 ;i <= n ;i++){
           for( int j = 1 ;j < i ;j++){
            if( i%j == 0 ){
                dp[i] = Math.min( dp[i] , dp[j]+i/j ); 
            }
           }
        }
        return dp[n]; 
     

        
    }
}