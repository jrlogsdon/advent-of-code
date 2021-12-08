import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class TextParser {

    public static List<Integer> parseFileToListOfIntegers(String fileName) throws IOException {
        TextParser instance = new TextParser();
        URL url = instance.getClass().getClassLoader().getResource(fileName);
        FileInputStream fileStream =  new FileInputStream(url.getPath());
        List<Integer> numbers = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(fileStream));
        String currentLine;
        while ((currentLine = br.readLine()) != null) {
            int currentInt = Integer.parseInt(currentLine);
            numbers.add(currentInt);
        }
        return numbers;
    }

    public static List<String> parseFileToListOfWords(String fileName) throws IOException {
        TextParser instance = new TextParser();
        URL url = instance.getClass().getClassLoader().getResource(fileName);
        FileInputStream fileStream =  new FileInputStream(url.getPath());
        List<String> words = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(fileStream));
        String currentLine;
        while ((currentLine = br.readLine()) != null) {
            words.add(currentLine);
        }
        return words;
    }

    public static List<Integer> parseMoves(String moves) {
        String[] bingoMoves = moves.split(",");
        List<Integer> bingoNumbers = new ArrayList<>();
        for (String move : bingoMoves) {
            bingoNumbers.add(Integer.parseInt(move.trim()));
        }
        return bingoNumbers;
    }

    public static BingoBoard parseBoard(BufferedReader reader) throws IOException {
        BingoBoard board = new BingoBoard();
        int i = 0;
        String currentLine;
        while (i < 5 && (currentLine = reader.readLine()) != "\n" && currentLine != null && !currentLine.equals("")) {
                String[] numbers = currentLine.trim().split("\\s+");
                for (int j = 0; j < numbers.length; j++) {
                    board.addNumber(i, j, Integer.parseInt(numbers[j]));
                }
                i++;
        }
        return board;
    }

    public static List<Point> getAllPoints(String fileName) throws IOException {
        TextParser instance = new TextParser();
        URL url = instance.getClass().getClassLoader().getResource(fileName);
        FileInputStream fileStream =  new FileInputStream(url.getPath());
        List<Point> points = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(fileStream));
        String currentLine;
        while ((currentLine = br.readLine()) != null) {
            List<Point> currentPoints = getLine(currentLine);
            points.addAll(currentPoints);
        }
        return points;

    }

    public static List<Point> getAllPointsWithDiagonal(String fileName) throws IOException {
        TextParser instance = new TextParser();
        URL url = instance.getClass().getClassLoader().getResource(fileName);
        FileInputStream fileStream =  new FileInputStream(url.getPath());
        List<Point> points = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(fileStream));
        String currentLine;
        while ((currentLine = br.readLine()) != null) {
            List<Point> currentPoints = getLineWithDiagonal(currentLine);
            points.addAll(currentPoints);
        }
        return points;

    }


    public static List<Point> getLineWithDiagonal(String lines) {
        String[] vents = lines.split(" -> ");
        List<Point> points = new ArrayList<>();
        int xOne = Integer.parseInt(vents[0].split(",")[0]);
        int yOne = Integer.parseInt(vents[0].split(",")[1]);
        int xTwo = Integer.parseInt(vents[1].split(",")[0]);
        int yTwo = Integer.parseInt(vents[1].split(",")[1]);
        if (xOne == xTwo) {
            addVerticalPoints(xOne, yOne, yTwo, points);
        }
        if (yOne == yTwo) {
            addHorizontalPoints(yOne, xOne, xTwo, points);
        }
        if (Math.abs(xOne - xTwo) == Math.abs(yOne - yTwo)) {
            addDiagonalPoints(xOne, xTwo, yOne, yTwo, points);
        }
        return points;
    }

    public static List<Point> getLine(String lines) {
        String[] vents = lines.split(" -> ");
        List<Point> points = new ArrayList<>();
        int xOne = Integer.parseInt(vents[0].split(",")[0]);
        int yOne = Integer.parseInt(vents[0].split(",")[1]);
        int xTwo = Integer.parseInt(vents[1].split(",")[0]);
        int yTwo = Integer.parseInt(vents[1].split(",")[1]);
        if (xOne == xTwo) {
            addVerticalPoints(xOne, yOne, yTwo, points);
        }
        if (yOne == yTwo) {
            addHorizontalPoints(yOne, xOne, xTwo, points);
        }
        return points;
    }

    private static void addVerticalPoints(int x, int yStart, int yEnd, List<Point> points) {
        if (yStart > yEnd) addVerticalPoints(x, yEnd, yStart, points);
        for (int i = yStart; i <= yEnd; i++) {
            points.add(new Point(x, i));

        }
    }

    private static void addHorizontalPoints(int y, int xStart, int xEnd, List<Point> points) {
        if (xStart > xEnd) addHorizontalPoints(y, xEnd, xStart, points);
        for (int i = xStart; i <= xEnd; i++) {
            points.add(new Point(i, y));

        }
    }

    private static void addDiagonalPoints(int xOne, int xTwo, int yOne, int yTwo, List<Point> points) {
        if (xOne > xTwo) addDiagonalPoints(xTwo, xOne, yTwo, yOne, points);
        else {
            int slope = (yTwo - yOne) / (xTwo - xOne);
            for (int i = 0; i <= xTwo - xOne; i++) {
                points.add(new Point(xOne + i, yOne + (i * slope)));

            }
        }
    }

}
