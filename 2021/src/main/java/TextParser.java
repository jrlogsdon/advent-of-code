import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class TextParser {

    public static List<Integer> parseFile(String fileName) throws IOException {
        TextParser instance = new TextParser();
        URL url = instance.getClass().getClassLoader().getResource(fileName);
        FileInputStream fileStream =  new FileInputStream(url.getPath());
        ArrayList<Integer> numbers = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(fileStream));
        String currentLine;
        while ((currentLine = br.readLine()) != null) {
            int currentInt = Integer.parseInt(currentLine);
            numbers.add(currentInt);
        }
        return numbers;
    }
}
