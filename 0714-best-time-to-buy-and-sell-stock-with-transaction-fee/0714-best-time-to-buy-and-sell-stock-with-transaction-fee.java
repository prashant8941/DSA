class Solution {
    public int find(int[]prices , int[][]dp , int ind , int buy , int fee){
        if(ind == prices.length ){
            return 0 ; 
        }
        if( dp[ind][buy] != -1){
            return dp[ind][buy]; 
        }
        int profit = 0 ; 
        if( buy == 1 ){
            profit  = Math.max(-(prices[ind]+fee )+ find( prices , dp ,ind+1 , 0 , fee)  , 
            find( prices , dp , ind+1 ,  1 , fee)); 
        }else{
            profit = Math.max(prices[ind]+find(prices  , dp , ind+1 ,1 , fee) , 
            find(prices , dp , ind+1 , 0 , fee)); 
        }
        return dp[ind][buy] = profit ; 
    }
    public int maxProfit(int[] prices, int fee) {
        int n = prices.length ; 
        int[][]dp = new int[n][2]; 
        for(int i= 0 ;i < n ;i++){
            Arrays.fill(dp[i] , -1); 
        }
        return find( prices , dp , 0 , 1 , fee); 
        
    }
}