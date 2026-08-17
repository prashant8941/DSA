class Solution {
    public static boolean isSafe(int row, int col, int k, char[][] board, int n) {
        // finding the horizontal 
        char check = (char) (k + '0');
        for (int i = 0; i < n; i++) {
            if (board[i][col] == check) {
                return false;
            }
        }
        // checking vertical 
        for (int j = 0; j < n; j++) {
            if (board[row][j] == check) {
                return false;
            }
        }
        // checking grid 
        int sr = row / 3 * 3;
        int sc = col / 3 * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == check) {
                    return false;
                }
            }
        }
        return true;

    }

    public static boolean solve(char[][] board, int n, int row, int col) {
        if (row == n) {
            return true;
        }

        if (col == n) {
            return solve(board, n, row + 1, 0);
        }

        if (board[row][col] != '.') {
            return solve(board, n, row, col + 1);
        }
       
            for (int k = 1; k <= 9; k++) {
                if (isSafe(row, col, k, board, n)) {
                    board[row][col] = (char) (k + '0');
                  
                       if( solve(board, n, row, col + 1)){
                        return true ; 
                       }

                    
                    board[row][col] = '.';

                }
            }
            return false ; 
       
    }

    public void solveSudoku(char[][] board) {
        int n = board.length;
        solve(board, n, 0, 0);

    }
}