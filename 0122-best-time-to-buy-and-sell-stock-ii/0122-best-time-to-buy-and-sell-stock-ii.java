class Solution {
    public static int find(int[]prices , int[][]dp , int ind , int buy){
        if( ind == prices.length ){
            return 0 ; 
        }
        int profit = 0 ;
        if( dp[ind][buy] != -1 ){
            return dp[ind][buy]; 
        } 
        if( buy == 1 ){
            profit = Math.max(-prices[ind]+find(prices , dp , ind+1 , 0) , find(prices , dp , ind+1 ,  1)); 
        }else{
            profit = Math.max(prices[ind] +find(prices , dp , ind+1 , 1 ) ,  find(prices , dp , ind+1 , 0 ) ); 
        }
       return  dp[ind][buy] = profit ; 
    }
    public int maxProfit(int[] prices) {
        int n = prices.length; 
        int[][]dp = new int[n][2];
        for(int i = 0 ;i < n ;i++){
            Arrays.fill(dp[i] , -1); 
        } 
        return find(prices , dp , 0 , 1 ); 
        
    }
}