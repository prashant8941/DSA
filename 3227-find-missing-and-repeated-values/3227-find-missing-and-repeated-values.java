class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length ; 
        boolean[]arr = new boolean[n*n+1];
        int[]ans = new int[2]; 
        int sum = 0 ;  
        for( int[]ar : grid){
            for( int j =  0 ; j < ar.length  ; j++){
                if( arr[ar[j]] == false ){
                    arr[ar[j]] = true ; 
                }else{
                    ans[0] = ar[j]; 
                    // break ; 
                }
                sum+=ar[j]; 
            }
        }
        int x = n*n; 
      int ret  = x*(x+1)/2 - (sum-ans[0]); 
     ans[1] = ret ; 
     return ans ; 
        
        
    }
}