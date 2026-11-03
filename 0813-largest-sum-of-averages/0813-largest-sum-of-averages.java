class Solution {
//    static  double  max ; 
    public static double  find( double[]prefix ,int[]arr , int ind , int k,  double[][]dp){
        if( ind == arr.length ){
           return 0 ;  
        }
         if( k == 0)return Double.NEGATIVE_INFINITY; ; 
        if( dp[ind][k]!= -1 ){
            return dp[ind][k]; 
        }
        double profit  = Double.NEGATIVE_INFINITY;  ; 
       
  
        for( int i = ind ; i < arr.length ; i++){
            double  s = prefix[i+1] - prefix[ind]; 
            int len = (i+1) - ind ; 
    
            double add = s/len ; 

          profit = Math.max( profit  ,add +   find(prefix , arr , i+1 , k-1 , dp )); 
        }
        return dp[ind][k] = profit ; 
        
    } 
    public double largestSumOfAverages(int[] nums, int k) {
        int n = nums.length ;
        // max = -(int)1e9 ; 
        double  dp[][] = new double[n][k+1]; 
        for( int i =0 ; i < n ;i++){
            Arrays.fill(dp[i]  , -1); 
        }
         double[]prefix = new double[n+1]; 
        for(int i = 1 ;i<= n ;i++){
            prefix[i] = prefix[i-1]+nums[i-1]; 
        }
       return  find( prefix , nums , 0 , k, dp  ); 
       

        
    }
}