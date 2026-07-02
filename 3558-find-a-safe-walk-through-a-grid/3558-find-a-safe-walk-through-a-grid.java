class Solution {
   static  class Pair{
        int row ; 
        int col ; 
        int health ; 
        Pair( int row , int col , int health  ){
            this.row = row; 
            this.col = col ; 
            this.health = health ; 
        }
    }
    public static boolean bfs( List<List<Integer>>list , int health , boolean visited[][], int row , int col ){
     int n = list.size();
        int m = list.get(0).size();

        int[][] maxHealth = new int[n][m];
        Queue<Pair> q = new LinkedList<>();

        int startHealth = health - list.get(0).get(0);
        if (startHealth <= 0) return false;

        q.add(new Pair(0, 0, startHealth));
        maxHealth[0][0] = startHealth;

        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, 1, 0, -1};

        while (!q.isEmpty()) {
            Pair p = q.poll();

            if (p.row == n - 1 && p.col == m - 1) return true;

            for (int k = 0; k < 4; k++) {
                int nr = p.row + dr[k];
                int nc = p.col + dc[k];

                if (nr >= 0 && nr < n && nc >= 0 && nc < m) {
                    int newHealth = p.health - list.get(nr).get(nc);

                    if (newHealth > 0 && newHealth > maxHealth[nr][nc]) {
                        maxHealth[nr][nc] = newHealth;
                        q.add(new Pair(nr, nc, newHealth));
                    }
                }
            }
        }

        return false;
    } 
    

    public boolean findSafeWalk(List<List<Integer>>list, int health) {
        int row = list.size(); 
        int col =list.get(0).size(); 
        int[][]grid = new int[row][col]; 
        for( int i = 0 ;i < row ; i++){
            for( int j = 0 ;j < col ;j++){
                grid[i][j] = list.get(i).get(j); 
            }
        }
        boolean visited[][] = new boolean[row][col]; 
        return bfs(list , health ,visited ,  0 , 0 ); 

        
    }
}