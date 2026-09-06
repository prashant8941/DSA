class Solution {
    public static int find( int[]prices , int[][][]dp , int ind , int buy , int limit ){
        if( ind ==  prices.length || limit == 2 ){
            return  0 ; 
        }
        if( dp[ind][buy][limit]!= -1){
            return dp[ind][buy][limit]; 
        }
        int profit =  0 ; 
        if(buy == 1 ){
            profit = Math.max(-prices[ind]+find(prices , dp , ind+1 , 0 , limit), 
                                   find(prices , dp , ind+1 , 1, limit)); 

        }
        else {
            profit =Math.max( prices[ind]+find( prices , dp , ind+1  , 1 , limit+1), 
                                  find(prices , dp , ind+1 , 0 , limit)); 
        }
       return  dp[ind][buy][limit] = profit ; 
    }
    public int maxProfit(int[] prices) {
        int n = prices.length ; 
        int[][][]dp = new int[n][2][2]; 
        for( int i = 0 ;i < n ;i++){
           for( int j = 0 ;j < 2 ;j++){
            for( int k = 0 ; k < 2 ;k++){
                dp[i][j][k] = -1 ; 
            }
           }
        }
        return find( prices , dp , 0 , 1 , 0 ); 
        
    }
}