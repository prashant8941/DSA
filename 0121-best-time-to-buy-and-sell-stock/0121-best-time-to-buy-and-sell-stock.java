class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length ; 
        int min = prices[0] ; 
        int ans = 0 ; 
        for(int ele : prices){
            min = Math.min( ele , min ); 
            ans = Math.max( ele-min , ans ); 
        }
        return ans ; 
        
    }
}