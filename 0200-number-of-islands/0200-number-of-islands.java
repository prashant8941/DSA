class Solution {
    public static void  dfs(char[][]grid , boolean[][]visited , int i , int j){
        int n = grid.length ; 
        int m = grid[0].length ; 
        visited[i][j] = true ; 
        int[]dr ={-1, 0 , 1 , 0 }; 
        int []dc ={ 0, 1 , 0 , -1 }; 
        for(int k  =0  ;k < 4 ;k++){
            int nr = i+dr[k]; 
            int nc = j+dc[k]; 
            if( nr >= 0 && nr < n && nc >= 0 && nc< m &&visited[nr][nc] == false  && grid[nr][nc] == '1'){
                dfs(grid, visited , nr , nc ); 
            }
        }
    }

    public int numIslands(char[][] grid) {
        int n = grid.length ; 
        int m = grid[0].length ; 
        int count =  0 ; 
        boolean visited[][] =new boolean[n][m];
        for( int i = 0 ;i < n ;i++){
            for(int j =0 ;j <m ;j++){
                if( visited[i][j] == false&& grid[i][j] == '1' ){
                    dfs(grid , visited , i , j  ); 
                    count++ ; 
                }
            }
        }
        return count ; 


        
    }
}