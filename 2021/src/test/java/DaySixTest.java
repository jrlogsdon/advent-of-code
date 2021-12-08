import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DaySixTest {

    DaySix daySix = new DaySix();
    String sample = "day6-sample.txt";
    String input = "day6.txt";

    @Test
    void partOneSample() throws IOException {
        List<Integer> initialState = TextParser.getInitialLanternFishState(sample);

        long expected = 26;

        long actual = daySix.getLanternFixCount(initialState, 18);
        assertEquals(expected, actual);
    }

    @Test
    void partOneSampleEightyDays() throws IOException {
        List<Integer> initialState = TextParser.getInitialLanternFishState(sample);

        int expected = 5934;

        long actual = daySix.getLanternFixCount(initialState, 80);
        assertEquals(expected, actual);
    }

    @Test
    void partOne() throws IOException {
        List<Integer> initialState = TextParser.getInitialLanternFishState(input);

        System.out.println(daySix.getLanternFixCount(initialState, 80));
    }


    @Test
    void partTwo() throws IOException {
        List<Integer> initialState = TextParser.getInitialLanternFishState(input);

        System.out.println(daySix.getLanternFixCount(initialState, 256));
    }


}