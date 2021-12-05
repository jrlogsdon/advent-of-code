import java.util.HashSet;
import java.util.Set;

public class BingoBoard {

    int[][] board;
    boolean[][] visited = new boolean[5][5];
    Set<Integer> bingoNumbers = new HashSet<>();

    public BingoBoard() {
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

    public int sumOfUnmarkedNumbers(Set<Integer> numbersCalled) {
        int sumOfUnmarked = 0;
        for (Integer i : bingoNumbers) {
            if (!numbersCalled.contains(i)) {
                sumOfUnmarked += i;
            }
        }
        return sumOfUnmarked;
    }

    public boolean hasBingo() {
        if (hasHorizontalBingo(visited)) return true;
        if (hasVerticalBingo(visited)) return true;
        return false;
    }

    private boolean hasVerticalBingo(boolean[][] visited) {
        for (int i = 0; i < visited.length; i++) {
            boolean allVisited = true;
            for (int j = 0; j < visited[0].length; j++) {
                if (!visited[j][i])
                    allVisited = false;
            }
            if (allVisited) return allVisited;
        }
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
