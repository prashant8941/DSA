class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length ; 
        int[]dp=  new int[n+1]; 
        dp[0] = cost[0]; 
        dp[1] = cost[1]; 
        for(int i = 2 ;i <=  n ;i++){
            int p = dp[i-1]; 
            int q = dp[i-2] ; 
            if( i == n ){
                return Math.min( p , q); 
            }
            dp[i] = cost[i]+Math.min( p , q ); 

        }
        return 0 ; 
    
    }
}