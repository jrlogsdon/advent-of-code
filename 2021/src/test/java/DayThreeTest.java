import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DayThreeTest {

    DayThree dayThree = new DayThree();

    @Test
    void powerInput() {
        List<String> input = createSampleInput();

        int expected = 198;
        int actual = dayThree.getPowerConsumption(input);
        assertEquals(expected, actual);
    }

    private List<String> createSampleInput() {
        List<String> input = new ArrayList<>();
        input.add("00100");
        input.add("11110");
        input.add("10110");
        input.add("10111");
        input.add("10101");
        input.add("01111");
        input.add("00111");
        input.add("11100");
        input.add("10000");
        input.add("11001");
        input.add("00010");
        input.add("01010");
        return input;
    }

    @Test
    void partTwo() throws IOException {
        List<String> binaryNumbersAsString = TextParser.parseFileToListOfWords("day3.txt");

        System.out.println(dayThree.getLifeSupportRating(binaryNumbersAsString));
    }

    @Test
    void lifeSupportRatingSample() {
        List<String> input = createSampleInput();

        int expected = 230;
        int actual = dayThree.getLifeSupportRating(input);

        assertEquals(expected, actual);
    }

    @Test
    void getOxygenRating() {
        List<String> sample = createSampleInput();

        int actualOxygen = dayThree.getOxygenRating(sample);
        int expectedOxygen = 23;

        assertEquals(expectedOxygen, actualOxygen);
    }

    @Test
    void getCarbonDioxideRating() {
        List<String> sample = createSampleInput();

        int actualOxygen = dayThree.getCarbonDioxideRating(sample);
        int expectedOxygen = 10;

        assertEquals(expectedOxygen, actualOxygen);
    }


    @Test
    void arrayOfCountsToIntegerConversion() {
        int[] nums = new int[] {1, 0, 0, 1};

        int expected = 9;
        int actual = dayThree.convertFromBinaryArrayToInteger(nums);

        assertEquals(expected, actual);

    }

    @Test
    void partOne() throws IOException {
        List<String> binaryNumbersAsString = TextParser.parseFileToListOfWords("day3.txt");

        System.out.println(dayThree.getPowerConsumption(binaryNumbersAsString));

    }

}