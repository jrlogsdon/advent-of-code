import org.junit.jupiter.api.Test;

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
        bingoBoard.addNumber(0, 0, 0);
        bingoBoard.addNumber(0, 1, 1);
        bingoBoard.addNumber(0, 2, 2);
        bingoBoard.addNumber(0, 3, 3);
        bingoBoard.addNumber(0, 4, 4);

        assertTrue(bingoBoard.numberCalled(0));
        assertTrue(bingoBoard.numberCalled(1));
        assertTrue(bingoBoard.numberCalled(2));
        assertTrue(bingoBoard.numberCalled(3));
        assertTrue(bingoBoard.numberCalled(4));
        assertTrue(bingoBoard.isBingo());
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
        assertTrue(bingoBoard.isBingo());
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
        assertTrue(bingoBoard.isBingo());
    }

    @Test
    void notBingo() {
        BingoBoard bingoBoard = new BingoBoard();
        bingoBoard.addNumber(0, 0, 0);
        bingoBoard.addNumber(0, 1, 1);
        bingoBoard.addNumber(0, 2, 2);
        bingoBoard.addNumber(0, 3, 3);
        bingoBoard.addNumber(0, 4, 4);

        assertTrue(bingoBoard.numberCalled(0));
        assertTrue(bingoBoard.numberCalled(1));
        assertTrue(bingoBoard.numberCalled(2));
        assertTrue(bingoBoard.numberCalled(3));
        assertFalse(bingoBoard.numberCalled(5));
        assertFalse(bingoBoard.isBingo());
    }

}

