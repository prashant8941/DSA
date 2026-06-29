class Solution {
    public static boolean valid( int[]rank , long time , int cars ){
        long count = 0 ; 
        for( int i = 0 ;i < rank.length ; i++){
            int val  =1; 
            while ((long) rank[i] * val * val <= time){
                val++ ; 
            }
            val--  ; 
            count+=val ;
             if (count >= cars) return true;

        }
      return false ; 
    }
    public long repairCars(int[] ranks, int cars) {
        int n = ranks.length ; 
        long  low = 1 ; 
        long  high = 1L * Arrays.stream(ranks).min().getAsInt() * cars * cars; ; 
        long  ans =0  ; 
        while( low <= high ){
            long  mid = low + (high -low)/2 ; 
            if( valid( ranks , mid , cars )){
               ans = mid ; 
                high = mid-1 ; 
                 
            }else{
                low = mid+1 ; 
            }
        }
        return ans ; 
         
    }
}