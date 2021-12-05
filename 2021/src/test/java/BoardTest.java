import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    @Test
    void addNumber() {
        Board board = new Board();
        board.addNumber(0, 0, 5);
        assertEquals(5, board.board[0][0]);
        assertTrue(board.bingoNumbers.contains(5));
        assertEquals(1, board.bingoNumbers.size());
    }

    @Test
    void callNumber() {
        Board board = new Board();
        board.addNumber(0, 0, 5);

        assertTrue(board.numberCalled(5));
        assertFalse(board.numberCalled(3));
        assertTrue(board.visited[0][0]);
    }

    @Test
    void horizontalBingo() {
        Board board = new Board();
        board.addNumber(0, 0, 0);
        board.addNumber(0, 1, 1);
        board.addNumber(0, 2, 2);
        board.addNumber(0, 3, 3);
        board.addNumber(0, 4, 4);

        assertTrue(board.numberCalled(0));
        assertTrue(board.numberCalled(1));
        assertTrue(board.numberCalled(2));
        assertTrue(board.numberCalled(3));
        assertTrue(board.numberCalled(4));
        assertTrue(board.isBingo());
    }

    @Test
    void notBingo() {
        Board board = new Board();
        board.addNumber(0, 0, 0);
        board.addNumber(0, 1, 1);
        board.addNumber(0, 2, 2);
        board.addNumber(0, 3, 3);
        board.addNumber(0, 4, 4);

        assertTrue(board.numberCalled(0));
        assertTrue(board.numberCalled(1));
        assertTrue(board.numberCalled(2));
        assertTrue(board.numberCalled(3));
        assertFalse(board.numberCalled(5));
        assertFalse(board.isBingo());
    }

}

