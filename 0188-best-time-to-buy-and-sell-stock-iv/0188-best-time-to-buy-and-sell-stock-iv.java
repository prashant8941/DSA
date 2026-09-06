class Solution {
    public static int find( int[]prices , int[][][]dp , int ind , int buy ,int limit ,  int k ){
        if( ind == prices.length ||limit == k  ){
            return 0 ; 
        }
        if(dp[ind][buy][limit]!= -1 ){
            return dp[ind][buy][limit]; 
        }
        int profit = 0 ; 
        if( buy == 1 ){
            profit =  Math.max(-prices[ind]+
            find(prices , dp , ind+1 , 0, limit , k ), 
            find(prices , dp , ind+1  , 1 , limit , k )

            ); 
        }else {
            profit = Math.max( prices[ind]+
            find(prices , dp , ind+1 , 1 , limit+1, k ), 
            find(prices , dp , ind+1 , 0 , limit , k )); 
        }
        return dp[ind][buy][limit] = profit ; 
    }
    public int maxProfit(int k, int[] prices) {
        
        int n = prices.length; 
        int[][][]dp = new int[n][2][k]; 
        for(int i = 0 ;i < n ;i++){
            for(int j = 0 ;j < 2 ;j++){
                for(int s = 0 ;s < k ;s++){
                    dp[i][j][s] = -1; 
                }
            }
        }
        return find(prices , dp , 0 , 1 , 0 ,  k ); 
    }
}