import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayElevenTest {


    String smallInput = "11111\n" +
            "19991\n" +
            "19191\n" +
            "19991\n" +
            "11111";

    DayEleven dayEleven = new DayEleven();

    String input = "8271653836\n" +
            "7567626775\n" +
            "2315713316\n" +
            "6542655315\n" +
            "2453637333\n" +
            "1247264328\n" +
            "2325146614\n" +
            "2115843171\n" +
            "6182376282\n" +
            "2384738675";

    String sample = "5483143223\n" +
            "2745854711\n" +
            "5264556173\n" +
            "6141336146\n" +
            "6357385478\n" +
            "4167524645\n" +
            "2176841721\n" +
            "6882881134\n" +
            "4846848554\n" +
            "5283751526";

    @Test
    void parseString() {
        int[][] actual = dayEleven.parseString(smallInput);
        assertEquals(5, actual.length);
        assertEquals(5, actual[0].length);
        assertEquals(1, actual[2][2]);
        assertEquals(9, actual[1][2]);
    }

    @Test
    void smallFlash() {
        int numberOfSteps = 1;
        int actual = dayEleven.getEnergyLevels(smallInput, numberOfSteps);

        assertEquals(9, actual);
    }

    @Test
    void sampleExpected() {
        int expected = 1656;

        assertEquals(expected, dayEleven.getEnergyLevels(sample, 100));
    }

    @Test
    void partOne() {

        System.out.println(dayEleven.getEnergyLevels(input, 100));
    }
    @Test
    void partTwo() {

        System.out.println(dayEleven.getFirstFlash(input));
    }


}