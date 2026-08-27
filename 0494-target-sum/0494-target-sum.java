class Solution {
    public static int find( int ind , int[]arr , int target , int[][]dp){
        if( ind == 0 ){
            if( arr[0] == 0 && target == 0 ){
                return 2 ; 

            }
            if( target == 0 || arr[0] == target){
                return 1 ; 
            }
            else{
                return  0 ; 
            }
        }
            if( dp[ind][target] != -1 )return dp[ind][target]; 
            int notPick = find( ind-1 , arr ,target , dp ); 
            int pick = 0 ; 
            if( arr[ind]<= target){
                pick = find( ind -1 , arr , target -arr[ind] , dp ); 
            }
            return dp[ind][target] = pick + notPick ; 


        }
    
    public int findTargetSumWays(int[] nums, int target) {
        // it is simple number of subsets with given difference problem 
        int n = nums.length ; 
        int tsum = 0 ; 
        for( int i = 0 ;i < n ;i++){
            tsum+=nums[i]; 
        }
        if(tsum <Math.abs(target)|| (tsum +target)%2 != 0  )return 0 ; 
        int s2 = (tsum+target)  /2 ; 
        int dp[][] = new int[n][s2+1]; 
        // for( int i = 0 ;i < n ; i++){
        //     Arrays.fill(dp[i] , -1); 
        // }
        if( nums[0] == 0 ){
            dp[0][0] = 2; 
        }else{
            dp[0][0] =1 ; 
            if( nums[0]<= s2 ){
                dp[0][nums[0]] =1 ; 
            }
        }
        for( int i = 1 ;i < n ;i++){
            for(int j = 0 ;j <= s2 ; j++){
                int nt = dp[i-1][j]; 
                int tk = 0 ; 
                if( j>= nums[i]){
                    tk =   dp[i-1][j-nums[i]]; 
                }
                dp[i][j]  = tk+nt ; 
            }

        }
        return dp[n-1][s2]; 
 
    }
}