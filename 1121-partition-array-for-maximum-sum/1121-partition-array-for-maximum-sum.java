class Solution {
    public static int find(int[]arr ,int[] dp , int k  , int ind ){
        if( ind == arr.length ){
            return  0 ; 
        }
        if(dp[ind]!= -1)return dp[ind]; 
        int len = 0 ; 
        int max  = 0 ; 
        int maxi = 0 ; 
        for( int i = ind ;i<Math.min( arr.length , ind+k) ;i++){
            len++ ; 
            maxi = Math.max( maxi , arr[i]); 
            int sum = (len*maxi )+find( arr , dp , k , i+1); 
            max = Math.max( max , sum ) ; 
        }
        return dp[ind] = max ; 
    }
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n = arr.length ; 
        int[]dp  = new int[n]; 
        Arrays.fill(dp , -1); 
        return find( arr , dp , k ,  0 ); 

        
    }
}