class Solution {
    public int longestMountain(int[] arr) {
        int n = arr.length ; 
        int[]left = new int[n]; 
        int[]right = new int[n]; 
        left[0] = 1 ; 
        for(int i = 1 ;i < n ;i++){
            if( arr[i] > arr[i-1]){
                left[i] = 1+left[i-1]; 
            }else{
                left[i] =1 ; 
            }

        }
        right[n-1] = 1 ; 
        for( int i = n-2 ; i>= 0 ; i--){
            if( arr[i] > arr[i+1]){
                right[i] = 1+ right[i+1]; 
            }else{
                right[i] =1  ; 
            }
        }
        int max = 0  ; 
        for( int i = 0 ;i < n;i++){
            int val =( left[i]+right[i]) -1 ; 
            if( left[i] > 1 && right[i] > 1 ){
            max = Math.max( max , val ); 
            }
        }
        return max; 

        
    }
}