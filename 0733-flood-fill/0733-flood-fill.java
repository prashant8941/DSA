class Solution {
    class Pair {
        int row  ; 
        int col ; 
        Pair( int row ,  int col ){
            this.row  = row ; 
            this.col =  col ; 
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n = image.length; 
        int m = image[0].length;
        int grid[][] = new int[n][m];  
        for( int i = 0 ;i < n ;i++){
            for( int j = 0 ;j < m ;j++){
                grid[i][j] = image[i][j] ; 
            }
        }
        Queue<Pair>q =new LinkedList<>(); 
        q.add(new Pair( sr , sc )) ; 
        grid[sr][sc] =color ; 
        int[]dr = {-1, 0 , 1, 0}; 
        int[]dc = {0 , 1 , 0 , -1}; 
        boolean[][]visited = new boolean[n][m]; 
        while(!q.isEmpty()){
            Pair p = q.poll(); 
            int r = p.row ; 
            int c= p.col ; 
            for( int i = 0 ;i < 4 ;i ++){
                int nr = r+ dr[i]; 
                int nc = c+dc[i]; 
                if( nr>= 0 && nr < n && nc >= 0 && nc < m && visited[nr][nc]== false && grid[nr][nc] == image[sr][sc]){
                    visited[nr][nc] = true ; 
                    grid[nr][nc] = color; 
                    q.add(new Pair (nr , nc )); 
                }
            }

        }
        return grid ; 

        
    }
}