package Easy;

/**
 * Created by Tianshan on 10/6/16.
 */
public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        int[][] row = new int[9][9];
        int[][] col = new int[9][9];
        int[][] cube = new int[9][9];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; ++j) {
                if (board[i][j] != '.') {
                    int num = board[i][j] - '0' - 1, k = i / 3 * 3 + j / 3;
                    if (row[i][num] == 1 || col[j][num] == 1 || cube[k][num] == 1) return false;
                    row[i][num] = col[j][num] = cube[k][num] = 1;
                }
            }
        }
        return true;
    }
}
