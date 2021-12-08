import java.util.Collections;
import java.util.List;

public class DaySeven {

    public int getMinimumFuelNeeded(List<Integer> nums) {
        int position = findOptimalFuelPosition(nums);
        int sum = 0;
        for (Integer i : nums) {
            sum += Math.abs(i - position);
        }
        return sum;
    }

    public int findOptimalFuelPosition(List<Integer> nums) {
        Collections.sort(nums);

        if (nums.size() % 2 == 0) return (nums.get(nums.size()/2) +nums.get(nums.size()/2 - 1)) / 2;
        return nums.get(nums.size()/2);
    }

    public int getMinimumFuelPartTwo(List<Integer> nums) {
        int position = findOptimalFuelPositionForAverage(nums);
        int guessOne = guess(nums, position);
        int guessTwo = guess(nums, position -1);
        return Math.min(guessOne, guessTwo);
    }

    private int guess(List<Integer> nums, int position) {
        int sum = 0;
        for (Integer i : nums) {
            int diff = Math.abs(i - position);
            sum += (diff * (diff + 1))/2;
        }
        return sum;
    }

    public int findOptimalFuelPositionForAverage(List<Integer> nums) {
        int sum = 0;
        for (Integer i : nums) {
            sum += i;
        }
        int avg = sum/nums.size();
        if (sum % nums.size() > nums.size() / 2) avg++;
        return avg;
    }

}
