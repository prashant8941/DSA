class Solution {
    public boolean canPartition(int[] nums) {
        int  n = nums.length ; 
        int sum = 0 ; 
        for( int ele : nums ){
            sum+= ele ; 
        }
        if( sum%2 != 0 ){
            return false ; 
        }
        int target = sum/2 ; 
        boolean[][]dp = new boolean[n][target+1]; 
        dp[0][0] = true ; 
        if( nums[0]<= target){
            dp[0][nums[0]] = true ; 
        }
        for( int i =1 ;i < n ;i++){
            for( int j = 0 ;j <= target ;j++){
                boolean nt  = dp[i-1][j]; 
                boolean tk = false ; 
                if( j>= nums[i] ){
                    tk = dp[i-1][j-nums[i]]; 
                }
                dp[i][j] = tk|nt ; 
            }
        }
        return dp[n-1][target]; 
        
    }
}