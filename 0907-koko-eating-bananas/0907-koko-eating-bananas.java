class Solution {
    public static boolean valid( int[]arr , int speed , int h ){
        long  count = 0 ; 
        for( int ele : arr ){
            long add = (int)Math.ceil((double)ele/speed);
            count+=add ; 
        }
        return count<= h ; 

    }
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length ; 
        int low = 1 ; 
        int high = (int)1e9 ; 
        int ans = 0 ; 
        while( low <= high ){
            int mid = low+(high-low)/2 ; 
            if( valid( piles , mid , h )){
                high = mid-1 ; 
                ans = mid ; 
            }else{
               low = mid+1 ; 
            }
        }
        return ans ; 
        
    }
}