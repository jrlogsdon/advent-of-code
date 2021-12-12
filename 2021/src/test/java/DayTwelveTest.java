import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class DayTwelveTest {

    String smallSample = "start-A\n" +
            "start-b\n" +
            "A-c\n" +
            "A-b\n" +
            "b-d\n" +
            "A-end\n" +
            "b-end";

    String input = "xq-XZ\n" +
            "zo-yr\n" +
            "CT-zo\n" +
            "yr-xq\n" +
            "yr-LD\n" +
            "xq-ra\n" +
            "np-zo\n" +
            "end-LD\n" +
            "np-LD\n" +
            "xq-kq\n" +
            "start-ra\n" +
            "np-kq\n" +
            "LO-end\n" +
            "start-xq\n" +
            "zo-ra\n" +
            "LO-np\n" +
            "XZ-start\n" +
            "zo-kq\n" +
            "LO-yr\n" +
            "kq-XZ\n" +
            "zo-LD\n" +
            "kq-ra\n" +
            "XZ-yr\n" +
            "LD-ws\n" +
            "np-end\n" +
            "kq-yr";

    DayTwelve dayTwelve = new DayTwelve();

    @Test
    void smallSample() {
        int actual = dayTwelve.numberOfPaths(smallSample);
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    void getMapping() {
        Map<String, List<String>> mapping = dayTwelve.getLocationsToVisit(smallSample);
        assertEquals(2, mapping.get("start").size());
        assertEquals(3, mapping.get("A").size());
        assertEquals(2, mapping.get("b").size());

    }

    @Test
    void partOne() {

        System.out.println(dayTwelve.numberOfPaths(input));
    }

    @Test
    void partTwoSample() {
        int expected = 36;
        int actual = dayTwelve.numberOfPathsWithSeeingSmallCaveTwice(smallSample);
        assertEquals(expected, actual);

    }

    @Test
    void partTwo() {
        System.out.println(dayTwelve.numberOfPathsWithSeeingSmallCaveTwice(input));
    }

}