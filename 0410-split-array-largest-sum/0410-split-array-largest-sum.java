class Solution {
    public  boolean find( int[]nums , int k  , int mid ){
        int count = 1 ; 
        int val = 0   ; 
        for( int ele : nums ){
            val+=ele ; 
            if( val > mid ){
                count++ ; 
                val = ele ; 
            }
        }
        return count <=  k ; 
    }
    public int splitArray(int[] nums, int k) {
        int n = nums.length ; 
        int l = 0 ;
        int h = 0 ; 
        int ans = 0 ; 
        for( int ele : nums ){
            l = Math.max( l , ele ); 
            h+=ele ; 
        }
        while( l <=  h){
            int m = l+ (h-l)/2 ; 
            if( find( nums , k , m )){
                ans = m ; 
                h  = m-1 ; 
            }
            else {
                l = m+1 ; 
            }
        }
        return ans; 
        
    }
}