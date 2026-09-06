class Solution {
    public static int find( int[]nums , int[][]dp , int prev , int ind ){
        if( ind == nums.length){
        //    if( prev == -1 || nums[ind]> nums[prev])return 1 ; 
           return  0 ; 
        }
        if( dp[ind][prev+1]!= -1 ){
            return dp[ind][prev+1];
        }
        int nt = find( nums , dp , prev , ind+1); 
        int tk = 0 ; 
        if( prev == -1 || nums[ind]> nums[prev] ){
            tk =1+ find( nums , dp , ind , ind+1); 
        }
        return dp[ind][prev+1]= Math.max(tk , nt ); 
    }
    public int lengthOfLIS(int[] nums) {
        int n  = nums.length ;
        int[][]dp = new int[n][n+1]; 
        for( int i = 0 ;i < n ;i++){
            Arrays.fill(dp[i] , -1); 
        } 
        return find(nums , dp , -1 , 0  ); 
        
    }
}