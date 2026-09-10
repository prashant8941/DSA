
class Solution {
class Pair{
        int u ; 
        int v ; 
        int  block ; 
        Pair( int u , int v  , int block ){
            this.u =u ; 
            this.v = v  ; 
            this.block = block ; 
        }
    }

    public int shortestPath(int[][] grid, int k) {
        int n= grid.length ; 
        int m = grid[0].length ; 
        if( n == 1 && m == 1 )return 0 ; 
        boolean visited[][][]= new boolean [n][m][k+1]; 
        Queue<Pair>q = new LinkedList<>(); 
        q.add(new Pair(0 , 0 , k)); 
        visited[0][0][k] = true ; 
        int steps = 0 ; 
        int[]dr = {-1, 0 , 1 , 0 }; 
        int []dc = { 0 , 1 , 0 , -1}; 

        while(!q.isEmpty()){
            int size = q.size(); 
            steps++ ; 
            while( size--> 0 ){
                Pair p = q.poll(); 
                int r = p.u ; 
                int c = p.v; 
                int blck = p.block ; 
                for( int i = 0 ;i < 4 ;i++){
                    int nr = r+dr[i]; 
                    int nc = c+dc[i]; 
                    if( nr<0 || nr>=n || nc<0 || nc >= m)continue ; 
                    int rem = blck-grid[nr][nc]; 
                    if( rem < 0 )continue ; 
                    if( nr == n-1 && nc == m-1){
                        return steps ; 
                    }
                    if( visited[nr][nc][rem]){
                        continue ; 
                    }
                    visited[nr][nc][rem] = true ; 
                    q.add(new Pair( nr , nc , rem)); 
                }


            }

        }
        return -1  ; 

        
        
    }
}