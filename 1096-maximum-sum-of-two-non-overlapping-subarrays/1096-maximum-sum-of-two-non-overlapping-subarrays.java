class Solution {
    public int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) {
        int n = nums.length ; 
        int[]prefix = new int[n+1]; 
        prefix[0] = 0 ; 
        for( int i = 1 ;i <= n; i++){
            prefix[i] = nums[i-1]+prefix[i-1]; 
        }
        int max = 0 ; 
        for( int i = firstLen-1 ; i< n ;i++){
            int fs = prefix[i+1] - prefix[i-firstLen+1]; 
            int f = (i-firstLen)+1  ; 
            int l = i ;
            for( int j = secondLen-1 ;j < n ;j++){
                if( (j>l && (j-secondLen+1) >l ) || 
                  (j<f && (j-secondLen+1) < f ) ){
                    int ss = prefix[j+1] - prefix[j-secondLen+1]; 
                    max = Math.max( max , ss+fs); 

                }  
            } 

        }
        return max ; 
        
    }
}