import java.util.*;

public class DayEleven {
    public int getEnergyLevels(String smallInput, int numberOfSteps) {
        int[][] numbers = parseString(smallInput);
        int flashCount = 0;
        for (int k = 0; k < numberOfSteps; k++) {
            Queue<Point> queue = new ArrayDeque<>();
            Set<Point> flashed = new HashSet<>();
            for (int i = 0; i < numbers.length; i++) {
                for (int j = 0; j < numbers[0].length; j++) {
                    numbers[i][j]++;
                    if (numbers[i][j] == 10) {
                        flashed.add(new Point (i,j));
                        flashCount++;
                        addNeighbors(queue, i, j, numbers);
                        numbers[i][j] = 0;
                    }
                }
            }
            while (queue.size() > 0) {
                Point p = queue.poll();
                if (!flashed.contains(p))
                    numbers[p.x][p.y]++;
                    if (numbers[p.x][p.y] == 10) {
                        flashCount++;
                        addNeighbors(queue, p.x, p.y, numbers);
                        flashed.add(p);
                        numbers[p.x][p.y] = 0;
                    }
            }
        }

        return flashCount;
    }

    public int getFirstFlash(String smallInput) {
        int[][] numbers = parseString(smallInput);
        int count = 0;
        while (true) {
            Queue<Point> queue = new ArrayDeque<>();
            Set<Point> flashed = new HashSet<>();
            for (int i = 0; i < numbers.length; i++) {
                for (int j = 0; j < numbers[0].length; j++) {
                    numbers[i][j]++;
                    if (numbers[i][j] == 10) {
                        flashed.add(new Point (i,j));
                        addNeighbors(queue, i, j, numbers);
                        numbers[i][j] = 0;
                    }
                }
            }
            while (queue.size() > 0) {
                Point p = queue.poll();
                if (!flashed.contains(p))
                    numbers[p.x][p.y]++;
                if (numbers[p.x][p.y] == 10) {
                    addNeighbors(queue, p.x, p.y, numbers);
                    flashed.add(p);
                    numbers[p.x][p.y] = 0;
                }
            }
            count++;
            if (flashed.size() == (numbers.length * numbers[0].length))
                return count;
        }
    }

    private void addNeighbors(Queue<Point> queue, int i, int j, int[][] numbers) {
        Point p1 = new Point(i, j+1);
        Point p2 = new Point(i, j-1);
        Point p3 = new Point(i+1, j+1);
        Point p4 = new Point(i+1, j-1);
        Point p5 = new Point(i-1, j+1);
        Point p6 = new Point(i-1, j-1);
        Point p7 = new Point(i-1, j);
        Point p8 = new Point(i+1, j);
        List<Point> points = new ArrayList<>(Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8));
        for (Point p : points) {
            if (pointIsInGrid(numbers, p))
                queue.add(p);
        }
    }

    private boolean pointIsInGrid(int[][] numbers, Point p) {
        return p.x >= 0 && p.x < numbers.length
        && p.y >= 0 && p.y < numbers[0].length;
    }


    public int[][] parseString(String str) {
        String[] lines = str.split("\n");
        int[][] nums = new int[lines[0].length()][lines[0].length()];
        for (int i = 0; i < lines.length; i++) {
            for (int j = 0; j < lines[i].length(); j++) {
                nums[i][j] = Character.getNumericValue(lines[i].charAt(j));
            }

        }
        return nums;
    }
}
