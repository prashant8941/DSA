class Solution {
    public int countServers(int[][] grid) {
        int n = grid.length ; 
        int m = grid[0].length ; 
        List<Integer>row = new ArrayList<>(); 
        List<Integer>col = new ArrayList<>(); 
        for( int i = 0  ;i < n ;i++){
            for( int j = 0 ;j < m ;j++){
                if( grid[i][j] == 1 ){
                    row.add(i); 
                    col.add(j); 
                }
            }

        }
        int count = 0 ; 
        for( int i = 0 ;i < n ;i++){
            for( int j = 0 ;j < m; j++){
                if( grid[i][j] == 1 ){
                    row.remove(Integer.valueOf(i)); 
                    col.remove(Integer.valueOf(j)); 
                    if( row.contains(i) || col.contains(j)){
                        count++ ; 
                    }
                    row.add(i); 
                    col.add(j); 
                }
            }
        }
        return count ; 
        
    }
}