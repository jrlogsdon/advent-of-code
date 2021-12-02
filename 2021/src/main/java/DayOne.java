import java.io.IOException;
import java.util.List;

public class DayOne {

    public static void main(String[] args) throws IOException {


        List<Integer> numbers = TextParser.parseFileToListOfIntegers("day1.txt");
        DayOne dayOne = new DayOne();
        int partOne = dayOne.getCountOfPreviousNumbersThatAreGreater(numbers, 1);
        int partTwo = dayOne.getCountOfPreviousNumbersThatAreGreater(numbers, 3);
        System.out.println(partOne);
        System.out.println(partTwo);
    }

    public int getCountOfPreviousNumbersThatAreGreater(List<Integer> numbers, int distanceFromPreviousNumber) {
        int count = 0;
        for (int i = distanceFromPreviousNumber; i < numbers.size(); i++) {
            int currentNumber = numbers.get(i);
            int previousNumber = numbers.get(i - distanceFromPreviousNumber);
            if (currentNumber > previousNumber) count++;
        }
        return count;
    }


}
