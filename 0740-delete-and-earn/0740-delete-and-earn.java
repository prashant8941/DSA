class Solution {
    public int deleteAndEarn(int[] nums) {
        // int n = nums.length ;
        int[]sum = new int[10001]; 
        for( int ele : nums ){
            sum[ele]+=ele ; 
        }
        int n = 10000 ; 
        int[]dp = new int[n+1]; 
        dp[0] = 0 ; 
        dp[1] = sum[1]; 
        for( int i = 2 ;i <=n ;i++){
            dp[i] = Math.max( dp[i-1] , dp[i-2]+sum[i]); 
        }
        return dp[n]; 
        
    }
}