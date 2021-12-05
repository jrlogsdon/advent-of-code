import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TextParserTest {


    @Test
    void bingoMoveParser() {
        String moves = "7,4,9,5,11,17,23,2,0,14,21,24,10,16,13,6,15,25,12,22,18,20,8,19,3,26,1";

        List<Integer> expected = new ArrayList<>();
        expected.addAll(Arrays.asList(7,4,9,5,11,17,23,2,0,14,21,24,10,16,13,6,15,25,12,22,18,20,8,19,3,26,1));

        assertEquals(expected, TextParser.parseMoves(moves));
    }

    @Test
    void parseBoard() {
        String input = "\n22 13 17 11 0\n 8  2 23  4 24\n21  9 14 16  7\n" +
                " 6 10  3 18  5\n" +
                " 1 12 20 15 19";
        Reader stringReader = new StringReader(input);
        BufferedReader bufferedReader = new BufferedReader(stringReader);

        int[][] actual = TextParser.parseBoard(bufferedReader);
        assertEquals(22, actual[0][0]);
        assertEquals(13, actual[0][1]);
        assertEquals(0, actual[0][4]);
        assertEquals(8, actual[1][0]);
        assertEquals(1, actual[4][0]);
        assertEquals(19, actual[4][4]);
    }

}