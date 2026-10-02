class Solution {
    public long maximumOr(int[] nums, int k) {
        int n = nums.length ; 
        int[]prefix =  new int[n]; 
        prefix[0] = nums[0]; 
    
        for( int i = 1 ;i < n ;i++){
            prefix[i] = prefix[i-1]|nums[i]; 
             
        }

        int suffix[] = new int[n]; 
        suffix[n-1] =nums[n-1]; 
        for( int i = n-2 ;i >= 0 ;i--){
            suffix[i] = suffix[i+1] | nums[i]; 

        }
        long or = 0  ; 
        for( int ele : nums ){
            or|= ele ; 
        }
        for( int i = 0 ;i < n; i++){
            long ele = nums[i];

            int left = 0 ; 
            if( i > 0 ){
            left  = prefix[i-1]; 
            }
            long right =0; 
            if( i < n-1){
            right = suffix[i+1]; 
            }
            long  val =(long) ele<<k ; 
            or= Math.max( or , left|right|val); 
        }
        return or ; 

        
    }
}