import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class BingoBoardTest {

    @Test
    void addNumber() {
        BingoBoard bingoBoard = new BingoBoard();
        bingoBoard.addNumber(0, 0, 5);
        assertEquals(5, bingoBoard.board[0][0]);
        assertTrue(bingoBoard.bingoNumbers.contains(5));
        assertEquals(1, bingoBoard.bingoNumbers.size());
    }

    @Test
    void callNumber() {
        BingoBoard bingoBoard = new BingoBoard();
        bingoBoard.addNumber(0, 0, 5);

        assertTrue(bingoBoard.numberCalled(5));
        assertFalse(bingoBoard.numberCalled(3));
        assertTrue(bingoBoard.visited[0][0]);
    }

    @Test
    void horizontalBingo() {
        BingoBoard bingoBoard = new BingoBoard();
        addFirstRow(bingoBoard);

        assertTrue(bingoBoard.numberCalled(0));
        assertTrue(bingoBoard.numberCalled(1));
        assertTrue(bingoBoard.numberCalled(2));
        assertTrue(bingoBoard.numberCalled(3));
        assertTrue(bingoBoard.numberCalled(4));
        assertTrue(bingoBoard.hasBingo());
    }

    @Test
    void verticalBingo() {
        BingoBoard bingoBoard = new BingoBoard();
        bingoBoard.addNumber(0, 0, 0);
        bingoBoard.addNumber(1, 0, 1);
        bingoBoard.addNumber(2, 0, 2);
        bingoBoard.addNumber(3, 0, 3);
        bingoBoard.addNumber(4, 0, 4);

        assertTrue(bingoBoard.numberCalled(0));
        assertTrue(bingoBoard.numberCalled(1));
        assertTrue(bingoBoard.numberCalled(2));
        assertTrue(bingoBoard.numberCalled(3));
        assertTrue(bingoBoard.numberCalled(4));
        assertTrue(bingoBoard.hasBingo());
    }

    @Test
    void verticalBingoOnEnd() {
        BingoBoard bingoBoard = new BingoBoard();
        bingoBoard.addNumber(0, 4, 0);
        bingoBoard.addNumber(1, 4, 1);
        bingoBoard.addNumber(2, 4, 2);
        bingoBoard.addNumber(3, 4, 3);
        bingoBoard.addNumber(4, 4, 4);

        assertTrue(bingoBoard.numberCalled(0));
        assertTrue(bingoBoard.numberCalled(1));
        assertTrue(bingoBoard.numberCalled(2));
        assertTrue(bingoBoard.numberCalled(3));
        assertTrue(bingoBoard.numberCalled(4));
        assertTrue(bingoBoard.hasBingo());
    }

    @Test
    void notBingo() {
        BingoBoard bingoBoard = new BingoBoard();
        addFirstRow(bingoBoard);

        assertTrue(bingoBoard.numberCalled(0));
        assertTrue(bingoBoard.numberCalled(1));
        assertTrue(bingoBoard.numberCalled(2));
        assertTrue(bingoBoard.numberCalled(3));
        assertFalse(bingoBoard.numberCalled(5));
        assertFalse(bingoBoard.hasBingo());
    }

    private void addFirstRow(BingoBoard bingoBoard) {
        bingoBoard.addNumber(0, 0, 0);
        bingoBoard.addNumber(0, 1, 1);
        bingoBoard.addNumber(0, 2, 2);
        bingoBoard.addNumber(0, 3, 3);
        bingoBoard.addNumber(0, 4, 4);
    }

    @Test
    void sumOfUnmarkedNumbers() {
        BingoBoard bingoBoard = new BingoBoard();
        int val = 0;
        for (int i = 0; i < bingoBoard.board.length; i++) {
            for (int j = 0; j < bingoBoard.board.length; j++) {
                bingoBoard.addNumber(i, j, val);
                val++;
            }
        }
        Set<Integer> numbersCalled = new HashSet<>();
        numbersCalled.addAll(Arrays.asList(24, 23, 22, 21, 20, 19));
        assertTrue(bingoBoard.numberCalled(24));
        assertTrue(bingoBoard.numberCalled(23));
        assertTrue(bingoBoard.numberCalled(22));
        assertTrue(bingoBoard.numberCalled(21));
        assertTrue(bingoBoard.numberCalled(20));
        assertTrue(bingoBoard.numberCalled(19));
        assertTrue(bingoBoard.hasBingo());
        // 0, 1, 2, 3... 18 = n*(n+1)/2 19 * 9 = 171
        int expected = 171;
        assertEquals(expected, bingoBoard.sumOfUnmarkedNumbers(numbersCalled));
    }
}

