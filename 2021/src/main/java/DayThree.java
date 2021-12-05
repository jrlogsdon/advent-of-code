import java.util.ArrayList;
import java.util.List;

public class DayThree {

    public int getPowerConsumption(List<String> binaryNumbersAsString) {
        int totalAmountNumbers = binaryNumbersAsString.size();
        int arrayLength = binaryNumbersAsString.get(0).length();
        int[] oneCounts = countNumberOfOnes(binaryNumbersAsString, arrayLength);
        int[] epsilon = new int[arrayLength];
        int[] gamma = new int[arrayLength];
        for (int i = 0; i < oneCounts.length; i++) {
            int numberOfZeros = totalAmountNumbers - oneCounts[i];
            if (numberOfZeros > oneCounts[i]) {
                gamma[i] = 0;
                epsilon[i] = 1;
            } else {
                gamma[i] = 1;
                epsilon[i] = 0;
            }
        }
        int eps = convertFromBinaryArrayToInteger(epsilon);
        int gam = convertFromBinaryArrayToInteger(gamma);
        return eps * gam;
    }

    public int[] countNumberOfOnes(List<String> binaryNumbersAsString, int arrayLength) {
        int[] oneCounts = new int[arrayLength];
        for (int i = 0; i < binaryNumbersAsString.get(0).length(); i++) {
            oneCounts[i] = countNumberOfOnesAtPosition(binaryNumbersAsString, i);
        }
        return oneCounts;
    }


    public int countNumberOfOnesAtPosition(List<String> numbers, int position) {
        int count = 0;
        for (String number : numbers) {
            if (number.charAt(position) == '1')
                count++;
        }
        return count;
    }

    public int getLifeSupportRating(List<String> binaryNumberAsString) {
        int oxygenRating = getOxygenRating(binaryNumberAsString);
        int carbonDioxideRating = getCarbonDioxideRating(binaryNumberAsString);

        return oxygenRating * carbonDioxideRating;
    }

    public int getCarbonDioxideRating(List<String> numbers) {
        List<String> copy = new ArrayList<>(numbers.size());
        copy.addAll(numbers);
        int length = copy.get(0).length();
        int i = 0;
        while (i < length && copy.size() > 1) {
            int onesCount = countNumberOfOnesAtPosition(copy, i);
            int zerosCount = copy.size() - onesCount;
            if (zerosCount <= onesCount) {
                removeStringsWithBitAtPosition(copy, 1, i);
            } else {
                removeStringsWithBitAtPosition(copy, 0, i);
            }
            i++;

        }
        int[] binaryArray = new int[length];
        for (int j = 0; j < length; j++) {
            binaryArray[j] = Character.getNumericValue(copy.get(0).charAt(j));
        }
        return convertFromBinaryArrayToInteger(binaryArray);
    }

    public int getOxygenRating(List<String> numbers) {

        List<String> copy = new ArrayList<>(numbers.size());
        copy.addAll(numbers);
        int length = copy.get(0).length();
        int i = 0;
        while (i < length && copy.size() > 1) {
            int onesCount = countNumberOfOnesAtPosition(copy, i);
            int zerosCount = copy.size() - onesCount;
            if (onesCount >= zerosCount) {
                removeStringsWithBitAtPosition(copy, 0, i);
            } else {
                removeStringsWithBitAtPosition(copy, 1, i);
            }
            i++;
        }
        int[] binaryArray = new int[length];
        for (int j = 0; j < length; j++) {
            binaryArray[j] = Character.getNumericValue(copy.get(0).charAt(j));
        }
        return convertFromBinaryArrayToInteger(binaryArray);
    }


    public void removeStringsWithBitAtPosition(List<String> strings, int commonBit, int position) {
        for (int i = strings.size() - 1; i >= 0; i--) {
            if (Character.getNumericValue(strings.get(i).charAt(position)) == commonBit)
                strings.remove(i);
        }

    }

    public List<Integer> convertPrimitiveIntArrayToList(int[] nums) {
        List<Integer> numbers = new ArrayList<>(nums.length);
        for (int i : nums) {
            numbers.add(i);
        }
        return numbers;
    }


    public int convertFromBinaryArrayToInteger(int[] counts) {
        int powerOfTwo = 1;
        int result = 0;
        for (int i = counts.length-1; i >= 0; i--) {
            result += powerOfTwo * counts[i];
            powerOfTwo *= 2;
        }
        return result;
    }

}
