import java.util.HashSet;
import java.util.Set;

public class Board {

    int[][] board;
    boolean[][] visited = new boolean[5][5];
    Set<Integer> bingoNumbers = new HashSet<>();

    public Board() {
        board = new int[5][5];
        for (int i =0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = Integer.MIN_VALUE;
            }
        }
    }

    public void addNumber(int i, int j, int num) {
        board[i][j] = num;
        bingoNumbers.add(num);
    }

    public boolean numberCalled(int num) {
        boolean numberSeen = false;
        if (!bingoNumbers.contains(num)) return numberSeen;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == num) {
                    visited[i][j] = true;
                    numberSeen = true;
                }
            }
        }
        return numberSeen;
    }


    public boolean isBingo() {
        if (hasHorizontalBingo(visited)) return true;
        return false;
    }

    private boolean hasHorizontalBingo(boolean[][] visited) {
        for (int i = 0; i < visited.length; i++) {
            boolean allVisited = true;
            for (int j = 0; j < visited[0].length; j++) {
                if (!visited[i][j])
                    allVisited = false;
            }
            if (allVisited) return allVisited;
        }
        return false;
    }
}
