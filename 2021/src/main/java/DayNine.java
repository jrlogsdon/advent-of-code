import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class DayNine {

    public int sumOfRiskLevels(String input) {
        int[][] heightMap = parseString(input);
        int riskLevel = 0;
        for (int i = 0; i < heightMap.length; i++) {
            for (int j = 0; j < heightMap[0].length; j++) {
                if (isShortestHeight(heightMap, i, j)) {
                    riskLevel += heightMap[i][j] + 1;
                }
            }
        }
        return riskLevel;
    }

    public boolean isShortestHeight(int[][] nums, int row, int column) {
        int num = nums[row][column];
        if (column > 0 && nums[row][column-1] <= num) return false;
        if (column + 1 < nums[0].length && nums[row][column + 1] <= num) return false;
        if (row + 1 < nums.length && nums[row+1][column] <= num) return false;
        if (row  > 0 && nums[row-1][column] <= num) return false;
        return true;
    }


    public int[][] parseString(String s) {
        String[] lines = s.split("\\n");
        int[][] numbers = new int[lines.length][lines[0].length()];
        for (int i = 0; i < lines.length; i++) {
            for (int j = 0; j < lines[i].length(); j++) {
                numbers[i][j] = Character.getNumericValue(lines[i].charAt(j));
            }
        }
        return numbers;
    }



    public int threeLargestBasinsMultiplied(String input) {
        int[][] heightMap = parseString(input);
        Queue<Integer> basins = new PriorityQueue<>((val1, val2) -> Integer.compare(val2, val1));
        for (int i = 0; i < heightMap.length; i++) {
            for (int j = 0; j < heightMap[i].length; j++) {
                if (isShortestHeight(heightMap, i, j)) {
                    Set<Point> seenPoints = new HashSet<>();
                    int basin = findSizeOfBasin(heightMap, i, j, seenPoints);
                    basins.add(basin);
                }
            }
        }
        int basinsMultiplied = 1;
        for (int i = 0; i < 3; i++) {
            basinsMultiplied *= basins.poll();
        }
        return basinsMultiplied;
    }


    public int findSizeOfBasin(int[][] nums, int row, int column, Set<Point> seen) {
        Point p = new Point(row,column);
        if (row >= 0 &&
                column >= 0 &&
                row < nums.length &&
                column < nums[0].length &&
                nums[row][column] != 9 &&
                !seen.contains(p)) {
            int basin = 1;
            seen.add(p);
            basin += findSizeOfBasin(nums, row - 1, column, seen);
            basin += findSizeOfBasin(nums, row + 1, column, seen);
            basin += findSizeOfBasin(nums, row, column - 1, seen);
            basin += findSizeOfBasin(nums, row, column + 1, seen);
            return basin;
        } else {
            return 0;
        }
    }


}
