class Solution {
    public int maximumSum(int[] arr) {
        int n= arr.length ; 
        int dp0 = arr[0]; 
        int dp1 = 0 ; 
        int ans = arr[0] ; 
        for(int i =1 ;i < n;i++){
            int nd1 = Math.max(dp0 , dp1+arr[i]); 
            int nd0  = Math.max( dp0+arr[i] , arr[i]) ; 
            dp0 = nd0 ; 
            dp1 = nd1 ; 
            ans = Math.max( ans , Math.max( dp0 , dp1)); 

        }   
        return ans ;      
        
    }
}