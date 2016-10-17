package Medium;

/**
 * Created by Tianshan on 10/17/16.
 */
public class BattleshipsInBoard {
    public int countBattleships(char[][] board) {
        if (board == null) return 0;
        int m = board.length, n = board[0].length;
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == '.') continue;
                if (i > 0 && board[i - 1][j] == 'X') continue; // part of the ship
                if (j > 0 && board[i][j - 1] == 'X') continue; // part of the ship
                count++; // the first valid part of ship we found
            }
        }
        return count;
    }
}
