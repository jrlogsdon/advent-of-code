import java.util.HashMap;
import java.util.Map;

public class DayFourteen {

    public long getQuantityOfDifferenceExtremesFast(String input, int numberOfSteps) {
        String[] lines = input.split("\n");

        String state = lines[0];
        char endCharacter = state.charAt(state.length() - 1);
        Map<String, String> rules = getMapping(lines);
        Map<String, Long> string = new HashMap<>();
        for (int i = 0; i < state.length() - 1; i++) {
            String sub = state.substring(i, i+2);
            string.put(sub, string.getOrDefault(sub, 0L) + 1);
        }

        for (int i = 0; i < numberOfSteps; i++) {
            string = getStringCounts(string, rules);
        }

        Map<Character, Long> charCounts = new HashMap<>();
        for (var entry : string.entrySet()) {
            String str = entry.getKey();
            char c = str.charAt(1);
            charCounts.put(c, charCounts.getOrDefault(c, 0L) + entry.getValue());
        }
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        for (var entry : charCounts.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
            }
            if (entry.getValue() < min) {
                min = entry.getValue();
                if (entry.getKey() == endCharacter)
                    min++;
            }
        }

        return max - min;
    }


    public Map<String, String> getMapping(String[] lines) {
        Map<String, String> rules = new HashMap<>();
        for (int i = 2; i < lines.length; i++) {
            String[] lineSplit = lines[i].split(" -> ");
            rules.put(lineSplit[0], lineSplit[0].charAt(0) +  lineSplit[1] + lineSplit[0].substring(1));
        }
        System.out.println(rules);
        return rules;
    }

    public String getUpdatedString(String state, Map<String, String> rules) {
        StringBuilder updated = new StringBuilder();
        updated.append(rules.get(state.substring(0,2)));
        for (int i = 1; i <= state.length() - 2; i++) {
            updated.append(rules.get(state.substring(i, i+2)).substring(1));
        }
        return updated.toString();
    }

    public Map<String,Long> getStringCounts(Map<String, Long> string, Map<String, String> rules) {
        Map<String, Long> stringCounts = new HashMap<>();
        for (var entry : string.entrySet()) {
            long amountOfString = entry.getValue();
            String afterRule = rules.get(entry.getKey());
            String s1 = afterRule.substring(0,2);
            String s2 = afterRule.substring(1,3);
            stringCounts.put(s1, stringCounts.getOrDefault(s1, 0L) + amountOfString);
            stringCounts.put(s2, stringCounts.getOrDefault(s2, 0L) + amountOfString);
        }

        return stringCounts;
    }
}
