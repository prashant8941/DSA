class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length ; 
        int m = grid[0].length ; 
        int sum = 0 ; 
        boolean []arr = new boolean[n*n+1];
        int ans[]  = new int[2] ;
        Arrays.fill( arr , false); 
        int dup = 0 ;  
        for( int i = 0 ;i < n ;i++){
            int temp = 0 ; 
            for( int j = 0 ;j < m ;j++){
                int a = grid[i][j]; 
                if( arr[a]){
                    dup = a ; 
                }
                arr[a] = true ; 
                temp += a; 

            }
            sum+= temp ; 
           
        } 
        ans[0] = dup ; 
        int val = (n*n)*(n*n+1)/2 ; 
        ans[1] = (val- ( sum -ans[0])); 
        return ans ; 
        
    }
}