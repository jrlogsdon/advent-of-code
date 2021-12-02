import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DayTwoTest {

    @Test
    void sample() {
        List<String> words = new ArrayList<>();
        words.add("forward 5");
        words.add("down 7");
        words.add("up 2");
        DayTwo dayTwo = new DayTwo();
        int[] actual = dayTwo.getDepthAndForwardMovement(words);
        int[] expected = new int[] {5, 5};

        assertArrayEquals(expected, actual);
    }

    @Test
    void partTwoSample() {
        List<String> words = new ArrayList<>();
        words.add("forward 5");
        words.add("down 5");
        words.add("forward 8");
        words.add("up 3");
        words.add("down 8");
        words.add("forward 2");

        DayTwo dayTwo = new DayTwo();
        long[] actual = dayTwo.getDepthAndForwardMovementWithAimIncluded(words);
        long[] expected = new long[] {60, 15};

        assertArrayEquals(expected, actual);
    }

    @Test
    void getPartOne() throws IOException {
        DayTwo dayTwo = new DayTwo();
        System.out.println(dayTwo.partOne());

    }


    @Test
    void getPartTwo() throws IOException {
        DayTwo dayTwo = new DayTwo();
        System.out.println(dayTwo.partTwo());

    }

}