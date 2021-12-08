import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DayFive {

    public int getDangerousPoints(String fileName) throws IOException {
        List<Point> allPoints = TextParser.getAllPoints(fileName);
        return countDangerousPoints(allPoints);
    }

    private int countDangerousPoints(List<Point> allPoints) {
        Set<Point> dangerousPoints = new HashSet<>();
        Set<Point> alreadyCounted = new HashSet<>();
        int numberOfDangerousPoints = 0;
        for (Point p: allPoints) {
            if (dangerousPoints.contains(p) && !alreadyCounted.contains(p)) {
                alreadyCounted.add(p);
                numberOfDangerousPoints++;
            } else {
                dangerousPoints.add(p);
            }
        }
        return numberOfDangerousPoints;
    }


    public int getDangerousPointsWithDiagonals(String fileName) throws IOException {
        List<Point> allPoints = TextParser.getAllPointsWithDiagonal(fileName);
        return countDangerousPoints(allPoints);
    }


}
