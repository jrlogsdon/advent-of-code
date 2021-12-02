import java.io.IOException;
import java.util.List;

public class DayTwo {


    public int partOne() throws IOException {
        List<String> words = TextParser.parseFileToListOfWords("day2.txt");
        int[] depthAndForwardMovement = getDepthAndForwardMovement(words);
        return depthAndForwardMovement[0] * depthAndForwardMovement[1];
    }

    public long partTwo() throws IOException {
        List<String> words = TextParser.parseFileToListOfWords("day2.txt");
        long[] depthAndForwardMovement = getDepthAndForwardMovementWithAimIncluded(words);
        return depthAndForwardMovement[0] * depthAndForwardMovement[1];
    }


    public int[] getDepthAndForwardMovement(List<String> words) {
        int depth = 0;
        int forward = 0;

        for (String word : words) {
            if (word.charAt(0) == 'f') forward += getValueOfMovement(word);
            else if  (word.charAt(0) == 'd') depth += getValueOfMovement(word);
            else {
                depth -= getValueOfMovement(word);
            }

        }
        return new int[] {depth, forward};
    }

    public long[] getDepthAndForwardMovementWithAimIncluded(List<String> words) {
        long depth = 0;
        long forward = 0;
        long aim = 0;
        for (String word : words) {
            int value = getValueOfMovement(word);
            if (word.charAt(0) == 'f') {
                forward += value;
                depth += (aim * value);
            }
            else if  (word.charAt(0) == 'd')  {
                aim += value;
            }
            else {
                aim -= value;
            }
        }
        return new long[] {depth, forward};
    }

    private int getValueOfMovement(String word) {
        return Character.getNumericValue(word.charAt(word.length() - 1));
    }
}
