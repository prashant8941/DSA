import java.util.*;

class Solution {
    static class Cell {
        int r, c, safe;

        Cell(int r, int c, int safe) {
            this.r = r;
            this.c = c;
            this.safe = safe;
        }
    }

    int[] dr = {-1, 0, 1, 0};
    int[] dc = {0, 1, 0, -1};

    public int maximumSafenessFactor(List<List<Integer>> grid) {
        int n = grid.size();

        int[][] dist = new int[n][n];

        for (int[] row : dist) {
            Arrays.fill(row, -1);
        }

        Queue<int[]> q = new LinkedList<>();

        // Step 1: Add all thieves in queue
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid.get(i).get(j) == 1) {
                    q.add(new int[]{i, j});
                    dist[i][j] = 0;
                }
            }
        }

        // Multi-source BFS
        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int r = curr[0];
            int c = curr[1];

            for (int k = 0; k < 4; k++) {
                int nr = r + dr[k];
                int nc = c + dc[k];

                if (nr >= 0 && nr < n && nc >= 0 && nc < n && dist[nr][nc] == -1) {
                    dist[nr][nc] = dist[r][c] + 1;
                    q.add(new int[]{nr, nc});
                }
            }
        }

        // Step 2: Max heap for safest path
        PriorityQueue<Cell> pq = new PriorityQueue<>((a, b) -> b.safe - a.safe);

        boolean[][] visited = new boolean[n][n];

        pq.add(new Cell(0, 0, dist[0][0]));

        while (!pq.isEmpty()) {
            Cell curr = pq.poll();

            int r = curr.r;
            int c = curr.c;
            int safe = curr.safe;

            if (visited[r][c]) continue;
            visited[r][c] = true;

            if (r == n - 1 && c == n - 1) {
                return safe;
            }

            for (int k = 0; k < 4; k++) {
                int nr = r + dr[k];
                int nc = c + dc[k];

                if (nr >= 0 && nr < n && nc >= 0 && nc < n && !visited[nr][nc]) {
                    int newSafe = Math.min(safe, dist[nr][nc]);
                    pq.add(new Cell(nr, nc, newSafe));
                }
            }
        }

        return 0;
    }
}