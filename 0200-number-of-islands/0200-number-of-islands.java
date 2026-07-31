class Solution {
    class Pair{
        int a; 
        int b ; 
        Pair( int a , int b ){
            this.a = a ; 
            this.b = b ; 
        }
    }
    public  void bfs(char [][]grid , boolean[][]visited , int i , int j ){
         Queue<Pair>q = new LinkedList<>(); 
        int n = grid.length ; 
        int m  = grid[0].length ; 
    int dr[] = {-1 , 0 , 1 , 0 }; 
    int dc[] ={0 , 1 , 0 , -1}; 
        q.add( new Pair(i , j )); 
        while(!q.isEmpty()){
            Pair p = q.poll(); 
            int row = p.a ; 
            int col = p.b ; 
            for( int k = 0 ; k< 4 ; k++){
                int nr = row+dr[k]; 
                int nc = col+dc[k]; 
                if( nr >= 0 && nr < n && nc >= 0 &&nc < m && visited[nr][nc] == false && grid[nr][nc] == '1'){
                    visited[nr][nc] = true ; 
                    q.add(new Pair(nr , nc )); 
                }
            }
        }
    }
    public int numIslands(char[][] grid) {
        // solve using bfs 
        int n = grid.length ; 
        int m  = grid[0].length ;
        int count = 0 ; 
        boolean visited[][] = new boolean[n][m]; 

        for( int i = 0 ;i < n ;i++ ){
            for( int j = 0 ;j < m ;j++){
                if(grid[i][j] == '1' && visited[i][j] == false ){
                    bfs(grid  , visited  ,  i , j  ); 
                    count++ ; 
                }
            }
        }
        return count ; 


        
    }
}