class Solution {
    public int lastStoneWeightII(int[] stones) {
        int n = stones.length ; 
         int total = 0 ; 
         for(int ele : stones){
            total+=ele ; 
         }
         int target  = total/2 ; 
         boolean[][]dp = new boolean[n][target+1]; 
         for( int i = 0 ;i < n ;i++){
            dp[i][0] = true ; 
         }
         if( stones[0]<= target ){
            dp[0][stones[0]] = true ; 
         }
         for(int i = 1 ; i < n  ; i++){
            for( int j = 1 ;j <= target ;j ++){
                boolean nt = dp[i-1][j]; 
                boolean tk = false ; 
                if( j >= stones[i]){
                    tk = dp[i-1][j-stones[i]]; 
                }
                dp[i][j] = tk||nt  ; 
            }
         }
         int best = 0 ; 
         for( int j = target ; j>= 0 ;j--){
            if( dp[n-1][j]){
                best = j ; 
                break ; 
            }
         }
         return total -2*best ; 
        
    }
}