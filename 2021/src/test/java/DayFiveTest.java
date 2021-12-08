import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class DayFiveTest {

    String sampleInput = "day5-sample.txt";
    String actualInput = "day5.txt";
    DayFive dayFive = new DayFive();

    @Test
    void dayFiveSamplePartOne() throws IOException {
        int expected = 5;
        int actual = dayFive.getDangerousPoints(sampleInput);

        assertEquals(expected, actual);
    }

    @Test
    void dayFivePartOne() throws IOException {
        System.out.println(dayFive.getDangerousPoints(actualInput));
    }


    @Test
    void dayFiveSamplePartTwo() throws IOException {
        int expected = 12;
        int actual = dayFive.getDangerousPointsWithDiagonals(sampleInput);

        assertEquals(expected, actual);
    }

    @Test
    void dayFivePartTwo() throws IOException {
        System.out.println(dayFive.getDangerousPointsWithDiagonals(actualInput));
    }


}