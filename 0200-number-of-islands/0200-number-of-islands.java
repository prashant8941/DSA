class Solution {
    public static void dfs(char[][]grid , boolean[][]visited ,int i , int j ){
        int n = grid.length ;
        int m = grid[0].length ; 
         visited[i][j] = true ; 
         int[]dr = {-1, 0 , 1 ,0 }; 
         int[]dc = {0 , 1 , 0 , -1}; 
         for( int k = 0 ;k < 4 ;k++){
            int nr = i+dr[k]; 
            int nc = j+dc[k]; 
            if( nr >= 0 && nr < n  && nc >= 0 && nc <m && grid[nr][nc] =='1'  && visited[nr][nc] == false ){
                dfs( grid , visited , nr , nc ); 
            }
         }
    }

    public int numIslands(char[][] grid) {
        int n = grid.length ; 
        int m = grid[0].length ; 
        boolean[][]visited = new boolean[n][m]; 
        int count = 0 ; 
        for(int i = 0 ;i < n ;i++){
            for( int j = 0 ;j < m  ;j++){
                if( grid[i][j] == '1' && visited[i][j] == false ){
                    count++ ; 
                    dfs(grid , visited , i , j); 
                }
            }
        }
        return count ; 
        
    }
}