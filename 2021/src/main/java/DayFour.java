import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DayFour {

    public int playBingo(String fileName) throws IOException {
        TextParser instance = new TextParser();
        URL url = instance.getClass().getClassLoader().getResource(fileName);
        FileInputStream fileStream =  new FileInputStream(url.getPath());
        List<String> words = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(fileStream));
        String firstLine = br.readLine();
        List<Integer> moves = TextParser.parseMoves(firstLine);
        List<BingoBoard> boards = new ArrayList<>();
        while (br.readLine() != null) {
            BingoBoard board = TextParser.parseBoard(br);
            boards.add(board);
        }
        Set<Integer> numbersCalled = new HashSet<>();
        for (Integer i : moves) {
            numbersCalled.add(i);
            for (BingoBoard bingoBoard : boards) {
                bingoBoard.numberCalled(i);
                if (bingoBoard.hasBingo()) {
                    return bingoBoard.sumOfUnmarkedNumbers(numbersCalled) * i;
                }
            }
        }
        return 0;
    }

    public int playBingoWithLosingCard(String fileName) throws IOException {
        TextParser instance = new TextParser();
        URL url = instance.getClass().getClassLoader().getResource(fileName);
        FileInputStream fileStream =  new FileInputStream(url.getPath());
        List<String> words = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(fileStream));
        String firstLine = br.readLine();
        List<Integer> moves = TextParser.parseMoves(firstLine);
        List<BingoBoard> boards = new ArrayList<>();
        while (br.readLine() != null) {
            BingoBoard board = TextParser.parseBoard(br);
            boards.add(board);
        }
        Set<Integer> numbersCalled = new HashSet<>();
        Set<BingoBoard> bingoBoards = new HashSet<>();
        for (Integer i : moves) {
            numbersCalled.add(i);
            for (BingoBoard bingoBoard : boards) {
                bingoBoard.numberCalled(i);
                if (bingoBoard.hasBingo()) {
                    bingoBoards.add(bingoBoard);
                    if (bingoBoards.size() == boards.size()) {
                        return bingoBoard.sumOfUnmarkedNumbers(numbersCalled) * i;
                    }
                }
            }
        }
        return 0;
    }

}


