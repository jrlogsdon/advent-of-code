import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TextParserTest {


    @Test
    void bingoMoveParser() {
        String moves = "7,4,9,5,11,17,23,2,0,14,21,24,10,16,13,6,15,25,12,22,18,20,8,19,3,26,1";

        List<Integer> expected = new ArrayList<>();
        expected.addAll(Arrays.asList(7,4,9,5,11,17,23,2,0,14,21,24,10,16,13,6,15,25,12,22,18,20,8,19,3,26,1));

        assertEquals(expected, TextParser.parseMoves(moves));
    }

    @Test
    void parseBoard() throws IOException {
        String input = "22 13 17 11 0\n 8  2 23  4 24\n21  9 14 16  7\n" +
                " 6 10  3 18  5\n" +
                " 1 12 20 15 19";
        Reader stringReader = new StringReader(input);
        BufferedReader bufferedReader = new BufferedReader(stringReader);

        BingoBoard bingoBoard = TextParser.parseBoard(bufferedReader);
        assertTrue(bingoBoard.bingoNumbers.containsAll(Arrays.asList(22, 13, 17, 11,
                0, 8, 2, 23, 24, 21, 9, 14, 16, 7,
        6, 10, 3, 18, 5, 1, 12, 20, 15, 19)));
    }

    @Test
    void parseHorizontal() {
        String input = "0,9 -> 5,9";
        List<Point> actual = TextParser.getLine(input);
        List<Point> expected = new ArrayList<>();
        expected.add(new Point(0,9));
        expected.add(new Point(1, 9));

        expected.add(new Point(2, 9));
        expected.add(new Point(3, 9));
        expected.add(new Point(4, 9));
        expected.add(new Point(5, 9));
        assertEquals(expected, actual);

    }

    @Test
    void parseVerticalLine() {
        String input = "5,8 -> 5,9";
        List<Point> actual = TextParser.getLine(input);
        List<Point> expected = new ArrayList<>();
        expected.add(new Point(5, 8));
        expected.add(new Point(5, 9));
        assertEquals(expected, actual);
    }

    @Test
    void parseHigherVertNumber() {
        String input = "5,9 -> 5,8";
        List<Point> actual = TextParser.getLine(input);
        List<Point> expected = new ArrayList<>();
        expected.add(new Point(5, 8));
        expected.add(new Point(5, 9));
        assertEquals(expected, actual);
    }

    @Test
    void parseLowerNumberOnEnd() {
        String input = "5,9 -> 0,9";
        List<Point> actual = TextParser.getLine(input);
        List<Point> expected = new ArrayList<>();
        expected.add(new Point(0,9));
        expected.add(new Point(1, 9));

        expected.add(new Point(2, 9));
        expected.add(new Point(3, 9));
        expected.add(new Point(4, 9));
        expected.add(new Point(5, 9));
        assertEquals(expected, actual);
    }

    @Test
    void diagonalLine() {
        String input = "1,1 -> 3,3";
        List<Point> expected = new ArrayList<>();
        expected.add(new Point(1,1));
        expected.add(new Point(2,2));
        expected.add(new Point(3,3));

        List<Point> actual = TextParser.getLineWithDiagonal(input);
        assertEquals(expected, actual);
    }

    @Test
    void testLeadingNumberDiaganol() {
        String input = "9,7 -> 7,9";

        List<Point> expected = new ArrayList<>();
        expected.add(new Point(7,9));
        expected.add(new Point(8,8));
        expected.add(new Point(9,7));

        List<Point> actual = TextParser.getLineWithDiagonal(input);
        assertEquals(expected, actual);
    }

    @Test
    void lanternFishInitialState() {
        String str = "Initial state: 3,4,3,1,2";
        List<Integer> expected = new ArrayList<>();
        expected.add(3);
        expected.add(4);
        expected.add(3);
        expected.add(1);
        expected.add(2);
        List<Integer> actual = TextParser.parseLanternFishInitialState(str);
        assertEquals(expected, actual);
    }

    @Test
    void parseLanternFile() throws IOException {
        List<Integer> expected = new ArrayList<>();
        expected.add(3);
        expected.add(4);
        expected.add(3);
        expected.add(1);
        expected.add(2);
        List<Integer> actual = TextParser.getInitialLanternFishState("day6-sample.txt");
        assertEquals(expected, actual);
    }




}