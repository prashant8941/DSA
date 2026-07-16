class Solution {
    public static long gcd(long a  , long b ){
        if( b== 0 )return a;  
        return gcd(b , a%b); 
    }
    public long gcdSum(int[] nums) {
        int n = nums.length ; 
        long []pfx = new long[n]; 
        int max = nums[0]; 
        for( int i = 0 ;i < n ;i++){
                if( nums[i]> max ){
                max = nums[i]; 
            }
            long add = gcd(nums[i] , max); 
            pfx[i] = add ; 

        }
        int i = 0 ; 
        int j = n-1 ; 
        Arrays.sort(pfx); 
        long sum = 0 ; 
        while( i < j ){
            long ad = gcd(pfx[i] , pfx[j]); 
            sum+=ad ; 
            i++ ; 
            j-- ; 
        }
        return sum  ;

        
    }
}