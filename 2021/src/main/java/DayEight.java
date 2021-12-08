import java.util.HashMap;
import java.util.Map;

public class DayEight {

    public int getCountOfUniqueSignals(String s) {
        String[] eachLine = s.split("\\n");
        int countOfUniqueDigits = 0;
        for (int i = 0; i < eachLine.length; i++) {
            String[] outputSignals = eachLine[i].split("\\|")[1].split(" ");
            for (String outputSignal : outputSignals) {
                int length = outputSignal.length();
                if (length == 2 || length == 7 || length == 3 || length == 4)
                    countOfUniqueDigits++;
            }

        }
        return countOfUniqueDigits;
    }

    public int getOutputValue(String s) {
        String[] eachLine = s.split("\\n");
        int outputValue = 0;
        for (int i = 0; i < eachLine.length; i++) {
            String[] signalsSplit = eachLine[i].split("\\|");
            String[] outputSignals = signalsSplit[1].split(" ");
            String[] inputSignals = signalsSplit[0].split(" ");
            Map<String, Integer> converter = converter(inputSignals);
            int currentOutputValue = 0;
            int factor = 1;
            for (String outputSignal : outputSignals) {
                int val = getValue(converter, outputSignal);
                currentOutputValue *= factor;
                currentOutputValue += val;
                factor = 10;
            }
            outputValue += currentOutputValue;

        }
        return outputValue;
    }

    private int getValue(Map<String, Integer> converter, String outputSignal) {
        for (var entry:  converter.entrySet()) {
            if (entry.getKey().length() == outputSignal.length() && hasAllCharacters(entry.getKey(), outputSignal))
                return entry.getValue();

        }
        return 0;
    }

    // 0 -> a, b, c, e, f, g
    // 1 -> c, f
    // 2 -> a, c, d, e, g
    // 3 -> a, c, d, f, g
    // 4 -> b, c, d, f
    // 5 -> a, b, d, f, g
    // 6 -> a, b, d, e, f, g
    // 7 -> a, c, f
    // 8 -> a, b, c, d, e, f, g
    // 9 -> a, b, c, d, f, g
    public Map<String, Integer> converter(String[] inputSignals) {
        Map<String, Integer> converter = new HashMap<>();
        Map<Integer, String> unique = new HashMap<>();
        for (String s : inputSignals) {
            if (s.length() == 2) {
                converter.put(s, 1);
                unique.put(1, s);
            } else if(s.length() == 3) {
                converter.put(s, 7);
                unique.put(7, s);
            } else if (s.length() == 4) {
                converter.put(s, 4);
                unique.put(4, s);
            } else if(s.length() == 7) {
                converter.put(s, 8);
                unique.put(8, s);
            }
        }

        for (String s : inputSignals) {

            if (s.length() == 5) {
                String bcdf = unique.get(4);
                String cf = unique.get(1);
                String diff = difference(bcdf, cf);
                if (hasAllCharacters(s, diff)) {
                    converter.put(s, 5);
                } else if (hasAllCharacters(s, cf)) {
                    converter.put(s, 3);
                } else {
                    converter.put(s, 2);
                }
            }
            if (s.length() == 6) {
                String bcdf = unique.get(4);
                String cf = unique.get(1);
                String diff = difference(bcdf, cf);
                if (!hasAllCharacters(s, diff)) {
                    converter.put(s,0);
                } else if (!hasAllCharacters(s, cf)) {
                    converter.put(s,6);
                } else {
                    converter.put(s,9);
                }
            }
        }
        return converter;
    }

    public boolean hasAllCharacters(String largerString, String subStrings) {
        for (int i = 0; i < subStrings.length(); i++) {
            if (largerString.indexOf(subStrings.charAt(i)) < 0) return false;
        }
        return true;

    }

    public String difference(String stringToRemoveFrom, String charsToRemove) {
        for (int i = 0; i < charsToRemove.length(); i++) {
            int index = stringToRemoveFrom.indexOf(charsToRemove.charAt(i));
            if (index >= 0) {
                stringToRemoveFrom = stringToRemoveFrom.substring(0, index) + stringToRemoveFrom.substring(index + 1);
            }
        }
        return stringToRemoveFrom;
    }

    // converter
    // 1 : 7 -> a
    // 4 unique lengths - 2, 3, 4, 7
    // 1 -> c, f
    // 7 -> a, c, f
    // 4 -> b, c, d, f
    // 8 -> a, b, c, d, e, f, g

    // 3 length 6
    // 9 -> a, b, c, d, f, g
    // 6 -> a, b, d, e, f, g
    // 0 -> a, b, c, e, f, g

    // 3 length 5
    // 2 -> a, c, d, e, g
    // 3 -> a, c, d, f, g
    // 5 -> a, b, d, f, g

    // str length 5
    // can find b or d from 4 - 1, if both are in str length 5 we know it's 5
    // else
    // if c and f are in it, then it's 3
    // else it's 2

    // str length 6
    // can find b and d from 4- 1, if both aren't in it then it's 0
    // if both c and f aren't in the remaining two then it's 6 otherwise 9


}
