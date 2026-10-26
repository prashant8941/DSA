class Solution {
    class Pair {
        int a;
        int b;

        Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    public int countIslands(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];
        int count = 0;
        int[] dr = { -1, 0, 1, 0 };
        int[] dc = { 0, 1, 0, -1 };
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                
                if (grid[i][j] > 0 && visited[i][j] == false ) {
                    Queue<Pair> q = new LinkedList<>();
                    q.add(new Pair(i, j));
                    visited[i][j] = true;
                     long  sum = 0;
                    while (!q.isEmpty()) {
                        Pair p = q.poll();
                        int r = p.a;
                        int c = p.b;
                        sum += grid[r][c];

                        for (int l = 0; l < 4; l++) {
                            int nr = r + dr[l];
                            int nc = c + dc[l];
                            if (nr >= 0 && nr < n && nc >= 0 && nc < m && 
                            grid[nr][nc] > 0
                                    && visited[nr][nc] == false) {
                                visited[nr][nc] = true;
                                q.add(new Pair(nr, nc));
                            }
                        }

                    }
                     if (sum % k == 0){
                    count++ ; 
                 }
                   
                }
                
                
            }
        }
        return count;

    }
}