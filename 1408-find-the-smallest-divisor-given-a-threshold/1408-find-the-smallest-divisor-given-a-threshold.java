class Solution {
    public static boolean valid(int[]arr , int th  , int mid ){
        int count =0 ; 
        for( int ele : arr ){
            int add = (int)Math.ceil((double)ele/  mid); 
            count+=add ; 
        }
        return count<= th ; 
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length ; 
        int low = 1  ; 
        int high = (int)1e9;
        int ans =-1 ; 
        while( low <= high ){
            int mid = low+(high-low)/2 ; 
            if( valid( nums , threshold , mid )){
                ans = mid ; 
                high = mid-1  ; 
            }else{
                low = mid+1 ; 

            }
        }
        return ans ;
        
    }
}