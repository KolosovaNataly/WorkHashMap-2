import java.util.HashMap;
import java.util.Map;

public class Main {
    static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. " +
            "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. " +
            "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. " +
            "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : text.toCharArray()) {
            if (map.containsKey(ch)) {
                int a = map.get(ch) + 1;
                map.put(ch, a);
            } else {
                map.put(ch, 1);
            }
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (char ch : map.keySet()) {
            if (max < map.get(ch)) {
                max = map.get(ch);
            } else if (min > map.get(ch)) {
                min = map.get(ch);
            }
        }
        System.out.println(min);
        System.out.println(max);
        System.out.println(map);

        WordsChecker wordsChecker = new WordsChecker(text);
        System.out.println(wordsChecker.hasWord("Lorem"));
        System.out.println(wordsChecker.hasWord("привет"));
    }
}
