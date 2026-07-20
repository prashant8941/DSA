class Solution {
    public static void clone (int[][]grid , int[][]temp){
        int n = grid.length ; 
        int m = grid[0].length ; 
        for( int i = 0 ;i < n; i++){
            for( int j = 0 ;j < m ;j++){
                grid[i][j] = temp[i][j]; 
            }
        }
    }
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>>blank= new ArrayList<>(); 
  

        int n = grid.length ; 
        int m = grid[0].length ; 
            int[][]temp = new int[n][m]; 
        for( int i = 0 ;i < n; i++){
            List<Integer>s = new ArrayList<>(); 
            for( int j = 0 ;j < m ;j++){
                s.add(grid[i][j]); 
            }
            blank.add(s); 
        }
        if( k == 0 )return blank ; 
        
        for(int l = 0 ;l < k; l++){
            for( int i = 0 ;i < n ;i++){
                for( int j = 0 ;j < m ;j++){
                    if( j< m-1){
                        temp[i][j+1] = grid[i][j]; 
                    }
                    if(i<n-1 &&   j== m-1){
                        temp[i+1][0] = grid[i][j]; 
                        
                    }
                    if( i == n-1 && j == m-1){
                        temp[0][0] = grid[n-1][m-1]; 
                    }
                }
            }
            clone(grid , temp ); 
        }
        

        List<List<Integer>>ans = new ArrayList<>(); 


            for( int i = 0 ;i < n ;i++){
            List<Integer>tp = new ArrayList<>(); 
            for( int j = 0 ;j < m ;j++){
                tp.add(temp[i][j]); 
            }
            ans.add(tp); 
        }


    
        return ans ; 
        
    }
}