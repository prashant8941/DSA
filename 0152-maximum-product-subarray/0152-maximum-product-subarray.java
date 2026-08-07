class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length ; 
        int pf = 1 ; 
        int sf  = 1 ; 
        int ans =- (int)1e9 ; 
        for( int i  = 0  ;i < n ;i++){
            if( pf == 0 )pf = 1 ; 
            if( sf  == 0 )sf = 1 ;
            pf*= nums[i]; 
            sf*=nums[n-i-1]; 
 
            ans = Math.max( ans , Math.max(pf , sf)); 
        }
        return ans ; 
        
    }
}