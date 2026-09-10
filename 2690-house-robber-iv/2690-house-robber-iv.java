class Solution {
     private boolean canRob(int[] nums, int K, int cap) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] <= cap) {
                count++;
                i++; // skip adjacent house
            }

            if (count >= K) {
                return true;
            }
        }

        return false;
    }
    public int minCapability(int[] nums, int K) {
        // int n = nums.length ; 
        // int[][]dp = new int[n+1][K+1]; 
        // for( int i = 0 ;i <= n ;i++){
        //     Arrays.fill(dp[i] , (int)1e9); 
        // }
        // for(int i = 0 ;i <= n ;i++){
        //     dp[i][0] = 0 ; 
        // }
        // for( int i = 1 ;i <= n ;i++){
        //     for( int k = 1 ;k <= K ; k++){
        //         int nt = dp[i-1][k]; 
        //         int tk = (int)1e9; 
        //         if( i >= 2 && dp[i-2][k-1]!= (int)1e9){
        //             tk =Math.max( nums[i-1] , dp[i-2][k-1]); 
        //         }
          
        //         if( i == 1 && k == 1 ){
        //             tk =  nums[0]; 
        //         }
        //               dp[i][k] = Math.min( nt , tk ); 



        //     }
        // }
        // return dp[n][K] == (int)1e9? -1 : dp[n][K];
         int low = 0;
        int high = 0;

        for (int num : nums) {
            high = Math.max(high, num);
        }

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (canRob(nums, K, mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

    

        return low;
    

        
    
       
}
}