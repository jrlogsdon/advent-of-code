import java.util.*;

public class DayThirteen {

    public int getDotsAfterFirstFold(String input, boolean onlyFirstFold) {
        String lines[] = input.split("\n");
        Map<Point, Integer> pointCounts = new HashMap<>();
        List<Point> folds = new ArrayList<>();
        for (String line : lines) {
            if (line.contains(",")){
                String[] xy = line.split(",");
                Point p = new Point(Integer.parseInt(xy[0]), Integer.parseInt(xy[1]));
                pointCounts.put(p, pointCounts.getOrDefault(p,0 ) + 1);
            } else if (line.contains("fold")) {
                int valueToFoldAcross = Integer.parseInt(line.substring(line.indexOf("=") + 1));
                if (line.contains("y")) {
                    folds.add(new Point(0, valueToFoldAcross));
                }
                else {
                    folds.add(new Point(valueToFoldAcross, 0));
                }
            }

        }
        int foldCount = 1;
        if (onlyFirstFold) {
            System.out.println("size before fold " + pointCounts.size());
            Point p = folds.get(0);
            boolean yAxis = p.x == 0;
            pointCounts = foldAcrossAxis(pointCounts, p, yAxis);
            System.out.println("fold  " + foldCount + " size after fold" + pointCounts.size());

        } else {
            for (Point p : folds) {
                boolean yAxis = p.x == 0;
                pointCounts = foldAcrossAxis(pointCounts, p, yAxis);
                foldCount++;
            }
            buildAndPrintArray(pointCounts);
        }
        return pointCounts.size();
    }

    private void buildAndPrintArray(Map<Point, Integer> pointCounts) {
        int maxX = 0;
        int maxY = 0;
        for (var entry : pointCounts.entrySet()) {
            maxX = entry.getKey().x > maxX ? entry.getKey().x : maxX;
            maxY = entry.getKey().y > maxY ? entry.getKey().y : maxY;
        }
        String[][] matrix = new String[maxX+1][maxY+1];
        for (var entry : pointCounts.entrySet()) {

            if (entry.getValue() > 0) {
                matrix[entry.getKey().x][entry.getKey().y] = "#";
            } else {
                matrix[entry.getKey().x][entry.getKey().y] = " ";
            }
        }

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[0].length; column++) {
                if (matrix[row][column] == null) {
                    matrix[row][column] = " ";
                }
            }
        }
        prettyPrintArray(matrix);
    }

    public void prettyPrintArray(String[][] matrix) {
        for (int col = 0; col < matrix[0].length; col++) {
            for (int row = 0; row < matrix.length; row++)//Cycles through rows
            {
                System.out.print(matrix[row][col]);

            }
            System.out.println(); //Makes a new row
        }

    }


    public Map<Point, Integer> foldAcrossAxis(Map<Point, Integer> points, Point fold, boolean yAxisFold) {
        Map<Point, Integer> foldedPoints = new HashMap<>();
        int foldAxis = yAxisFold ? fold.y : fold.x;
        for (var entry : points.entrySet()) {
            Point p = getPointToAdd(entry.getKey(), foldAxis, yAxisFold);
            foldedPoints.put(p, foldedPoints.getOrDefault(p, entry.getValue()));
        }
        return foldedPoints;
    }


    public Point getPointToAdd(Point point, int foldValue, boolean yAxisFold) {
        int valueToCompare = yAxisFold ? point.y : point.x;
        int valueComparedToFold = valueToCompare - foldValue;
        if (valueComparedToFold > 0) {
            int valueAfterFold = foldValue - valueComparedToFold;
            if (yAxisFold) {
                return new Point(point.x, valueAfterFold);
            } else {
                return new Point(valueAfterFold, point.y);
            }
        } else {
            return point;
        }
    }
}
