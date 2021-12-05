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

}
