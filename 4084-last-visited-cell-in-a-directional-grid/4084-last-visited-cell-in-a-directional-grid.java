class Solution {
    class Pair{
        int row ; 
        int col ; 
        Pair( int row , int col ){
            this.row = row ; 
            this.col = col ; 
        }
    }
    public int[] lastVisitedCell(char[][] grid) {
        int n = grid.length ; 
        int m = grid[0].length ; 
        int[]ans = new int[2]; 
        boolean visited[][] = new boolean[n][m]; 
        Queue<Pair>q = new LinkedList<>();
        q.add(new Pair( 0 ,  0 ));
        visited[0][0] = true ;  
        while( !q.isEmpty()){
            Pair p = q.poll(); 
            int r = p.row ; 
            int c = p.col ; 
            if( grid[r][c]  == 'R'){
                if( c+1 < m&& visited[r][c+1]==  false ){
                    visited[r][c+1] = true ; 
                    q.add( new Pair( r ,  c+1)); 
                }else{
                    ans[0] = r ; 
                    ans[1] = c ; 
                }
            }
            if( grid[r][c]  == 'L'){
                if( c-1 >= 0 && visited[r][c-1]==  false ){
                    visited[r][c-1] = true ; 
                    q.add( new Pair( r ,  c-1)); 
                }else{
                    ans[0] = r ; 
                    ans[1] = c ; 
                }
            }
            if( grid[r][c]  == 'U'){
                if( r-1  >= 0 && visited[r-1][c]==  false ){
                    visited[r-1][c] = true ; 
                    q.add( new Pair( r-1 ,  c)); 
                }else{
                    ans[0] = r ; 
                    ans[1] = c ; 
                }
            }
            if( grid[r][c]  == 'D'){
                if( r+1 < n && visited[r+1][c]==  false ){
                    visited[r+1][c] = true ; 
                    q.add( new Pair( r+1 ,  c)); 
                }else{
                    ans[0] = r ; 
                    ans[1] = c ; 
                }
            }

            
        } 
        return ans ; 
        
    }
}