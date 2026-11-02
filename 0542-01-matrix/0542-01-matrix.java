class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length ; 
        int m = mat[0].length; 
        int[][]dp  = new int[n][m]; 
        for( int i = 0 ;i < n;i++){
            for( int j = 0 ;j < m;j++){
                if( mat[i][j] == 0 ){
                    dp[i][j] = 0 ; 
                }else{
                    int a = (int)1e9; 
                    int b = (int)1e9 ; 

                    if( i >  0 ){
                        a = dp[i-1][j]; 
                    }
                    if( j > 0  ){
                        b = dp[i][j-1]; 
                    }

                    dp[i][j] = 1+ Math.min( a , b); 
                }
            }
        }
        for( int i = n-1 ;i >= 0 ;i--){
            for( int j = m-1 ;j >= 0 ;j--){
                if( mat[i][j] == 0 ){
                    dp[i][j] = 0 ; 
                }else{
                    int a = (int)1e9; 
                    int b = (int)1e9 ; 

                    if( i < n-1 ){
                        a = dp[i+1][j]; 
                    }
                    if( j < m-1   ){
                        b = dp[i][j+1]; 
                    }

                    dp[i][j] =Math.min( dp[i][j]  , 1+ Math.min( a , b)); 
                }
            }
        }
        return dp ;
        
    }
}