class Solution {
    public int gcd(int a  , int b ){
        if( b == 0 ){
            return a  ; 
        }
        return gcd( b , a%b); 
    }

    public int lcm (int a , int b ){
        return (a / gcd(a, b))*b ; 
    }
    public int maxLength(int[] nums) {
        int n = nums.length ; 
        int max = 0 ; 
        for( int i = 0 ;i < n ;i++){
            int prod = 1  ; 
            int gc =0 ; 
            int lc = 1 ; 
            for( int j = i ;j  < n ;j++){
                prod*= nums[j]; 
                gc = gcd(gc , nums[j]); 
                lc = lcm( lc , nums[j]); 
                if( prod ==(lc*gc)){
                    max = Math.max( max , j-i+1); 
                }


            }
        }
        return max ; 

        
    }
}