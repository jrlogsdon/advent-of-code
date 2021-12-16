import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class DayFourteenTest {

    String example = "NNCB\n" +
            "\n" +
            "CH -> B\n" +
            "HH -> N\n" +
            "CB -> H\n" +
            "NH -> C\n" +
            "HB -> C\n" +
            "HC -> B\n" +
            "HN -> C\n" +
            "NN -> C\n" +
            "BH -> H\n" +
            "NC -> B\n" +
            "NB -> B\n" +
            "BN -> B\n" +
            "BB -> N\n" +
            "BC -> B\n" +
            "CC -> N\n" +
            "CN -> C";

    DayFourteen dayFourteen = new DayFourteen();

    @Test
    void getUpdatedStringSmall() {

        String[] lines = example.split("\n");
        String state = "NNC";
        Map<String, String> rules = dayFourteen.getMapping(lines);
        String actual = dayFourteen.getUpdatedString(state, rules);
        String expected = "NCNBC";

        assertEquals(expected, actual);
    }


    @Test
    void getUpdatedString() {

        String[] lines = example.split("\n");
        String state = "NNCB";
        Map<String, String> rules = dayFourteen.getMapping(lines);
        String actual = dayFourteen.getUpdatedString(state, rules);
        String expected = "NCNBCHB";
        assertEquals(expected, actual);
    }

    @Test
    void testFast() {
        long actual = dayFourteen.getQuantityOfDifferenceExtremesFast(example, 3);
        // NBBBCNCCNBBNBNBBCHBHHBCHB
        // b = 11
        // N = 5
        // C = 5
        // H = 4
        long expected = 7;
        assertEquals(expected, actual);

    }

    @Test
    void sample() {
        long actual = dayFourteen.getQuantityOfDifferenceExtremesFast(example, 10);
        long expected = 1588;

        assertEquals(expected, actual);
    }


    @Test
    void samplePartTwo() {
        long actual = dayFourteen.getQuantityOfDifferenceExtremesFast(example, 40);
        long expected = 2188189693529L;

        assertEquals(expected, actual);
    }

    @Test
    void partOne() {

        System.out.println(dayFourteen.getQuantityOfDifferenceExtremesFast(input, 10));
    }

    @Test
    void partTwo() {
        // subtract 1 if the last letter is V
        System.out.println(dayFourteen.getQuantityOfDifferenceExtremesFast(input, 40));
    }





    private String input = "VOKKVSKKPSBVOOKVCFOV\n" +
            "\n" +
            "PK -> P\n" +
            "BB -> V\n" +
            "SO -> O\n" +
            "OO -> V\n" +
            "PV -> O\n" +
            "CB -> H\n" +
            "FH -> F\n" +
            "SC -> F\n" +
            "KF -> C\n" +
            "VS -> O\n" +
            "VP -> V\n" +
            "FS -> K\n" +
            "SP -> C\n" +
            "FC -> N\n" +
            "CF -> C\n" +
            "BF -> V\n" +
            "FN -> K\n" +
            "NH -> F\n" +
            "OB -> F\n" +
            "SV -> H\n" +
            "BN -> N\n" +
            "OK -> K\n" +
            "NF -> S\n" +
            "OH -> S\n" +
            "FV -> B\n" +
            "OC -> F\n" +
            "VF -> V\n" +
            "HO -> H\n" +
            "PS -> N\n" +
            "NB -> N\n" +
            "NS -> B\n" +
            "OS -> P\n" +
            "CS -> S\n" +
            "CH -> N\n" +
            "PC -> N\n" +
            "BH -> F\n" +
            "HP -> P\n" +
            "HH -> V\n" +
            "BK -> H\n" +
            "HC -> B\n" +
            "NK -> S\n" +
            "SB -> C\n" +
            "NO -> K\n" +
            "SN -> H\n" +
            "VV -> N\n" +
            "ON -> P\n" +
            "VN -> H\n" +
            "VB -> P\n" +
            "BV -> O\n" +
            "CV -> N\n" +
            "HV -> C\n" +
            "SH -> C\n" +
            "KV -> F\n" +
            "BC -> O\n" +
            "OF -> P\n" +
            "NN -> C\n" +
            "KN -> F\n" +
            "CO -> C\n" +
            "HN -> P\n" +
            "PP -> V\n" +
            "FP -> O\n" +
            "CP -> S\n" +
            "FB -> F\n" +
            "CN -> S\n" +
            "VC -> C\n" +
            "PF -> F\n" +
            "PO -> B\n" +
            "KB -> H\n" +
            "HF -> P\n" +
            "SK -> P\n" +
            "SF -> H\n" +
            "VO -> N\n" +
            "HK -> C\n" +
            "HB -> C\n" +
            "OP -> B\n" +
            "SS -> V\n" +
            "NV -> O\n" +
            "KS -> N\n" +
            "PH -> H\n" +
            "KK -> B\n" +
            "HS -> S\n" +
            "PN -> F\n" +
            "OV -> S\n" +
            "PB -> S\n" +
            "NC -> B\n" +
            "BS -> N\n" +
            "KP -> C\n" +
            "FO -> B\n" +
            "FK -> N\n" +
            "BP -> C\n" +
            "NP -> C\n" +
            "KO -> C\n" +
            "VK -> K\n" +
            "FF -> C\n" +
            "VH -> H\n" +
            "CC -> F\n" +
            "BO -> S\n" +
            "KH -> B\n" +
            "CK -> K\n" +
            "KC -> C";

}