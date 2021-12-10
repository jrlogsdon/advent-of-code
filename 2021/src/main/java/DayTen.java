import java.util.*;

public class DayTen {





    public int sumOfSyntaxErrors(String sample) {
        String[] lines = sample.split("\n");
        Map<Character, Integer> charMap = new HashMap<>();
        Set<Character> leftCharacters = new HashSet<>();
        Map<Character, Integer> mapping = buildValues();
        Map<Character, Character> rightToLeftMapping = rightToLeftMapping();
        leftCharacters.add('[');
        leftCharacters.add('{');
        leftCharacters.add('<');
        leftCharacters.add('(');
        for (String line : lines) {
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                if (leftCharacters.contains(c)) {
                    stack.push(c);
                } else {
                    char popped = stack.pop();
                    if (popped != rightToLeftMapping.get(c)) {
                        charMap.put(c, charMap.getOrDefault(c,0) + 1);
                    }
                }
            }
        }
        int sum = 0;
        for (var entry : charMap.entrySet()) {
            sum += (mapping.get(entry.getKey()) * entry.getValue());
        }
        return sum;
    }


    private Map<Character, Character> rightToLeftMapping() {
        Map<Character, Character> charValues = new HashMap<>();
        charValues.put(']', '[');
        charValues.put('>', '<');
        charValues.put('}', '{');
        charValues.put(')', '(');
        return charValues;

    }

    private Map<Character, Integer> buildValues() {
        Map<Character, Integer> charValues = new HashMap<>();
        charValues.put(')', 3);
        charValues.put(']', 57);
        charValues.put('}', 1197);
        charValues.put('>', 25137);
        return charValues;

    }
}
