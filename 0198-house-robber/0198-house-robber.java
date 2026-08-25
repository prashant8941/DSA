class Solution {
    public int rob(int[] nums) {
        int n = nums.length ; 
        int[]dp = new int[n]; 
        if( n == 1 ){
            return  nums[0]; 
        }
        dp[0] = nums[0]; 
        dp[1] = nums[1]; 
        for( int i = 1 ;i < n ;i++){
            int ntake = dp[i-1]; 
            int take = nums[i]; 
            if( i >= 2 ){
                take+=dp[i-2]; 
            }
            dp[i] = Math.max(take , ntake ); 
        }
        return dp[n-1]; 
        
    }
}