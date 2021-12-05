import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class DayFourTest {

    String sampleInput = "day4-sample.txt";
    String dayFourInput = "day4.txt";

    @Test
    void sampleInput() throws IOException {
        DayFour dayFour = new DayFour();
        int expected = 4512;
        int actual = dayFour.playBingo(sampleInput);
        assertEquals(expected, actual);
    }

    @Test
    void partOne() throws IOException {
        DayFour dayFour = new DayFour();
        int actual = dayFour.playBingo(dayFourInput);
        System.out.println(actual);
    }

    @Test
    void sampleTwo() throws IOException {
        DayFour dayFour = new DayFour();
        int expected = 1924;
        int actual = dayFour.playBingoWithLosingCard(sampleInput);
        assertEquals(expected, actual);
    }

    @Test
    void partTwo() throws IOException {
        DayFour dayFour = new DayFour();
        int actual = dayFour.playBingoWithLosingCard(dayFourInput);
        System.out.println(actual);

    }

}