class Solution {
    public static boolean dfs(int[][] grid, boolean visited[][], int i, int j) {
        int n = grid.length;
        int m = grid[0].length;
        visited[i][j] = true;

   boolean ret =true ; 
                  if ( i == 0 ||i == n - 1 || j == 0 || j == m-1   ) {
                ret = false ; 
            }




        int[] dr = { -1, 0, 1, 0 };
        int[] dc = { 0, 1, 0, -1 };
        for (int k = 0; k < 4; k++) {
            int nr = i + dr[k];
            int nc = j + dc[k];
  

            if  (nr >= 0 && nr < n && nc >= 0 && nc < m && grid[nr][nc] == 0 && visited[nr][nc] == false) {

                if (!dfs(grid, visited, nr, nc)) {
                    ret = false ;
                }

            }
        }
        return ret  ;
    }

    public int closedIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        boolean[][] visited = new boolean[n][m];
        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < m - 1; j++) {
                if (grid[i][j] == 0 && visited[i][j] == false) {

                    if (dfs(grid, visited, i, j)) {
                        count++;
                    }
                }
            }
        }
        return count;

    }
}