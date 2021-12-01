import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DayOneTest {

    DayOne dayOne = new DayOne();

    @Test
    void previousDistanceCount() {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        int expected = 2;
        int actual = dayOne.getCountOfPreviousNumbersThatAreGreater(nums, 2);
        assertEquals(expected, actual);
    }

}