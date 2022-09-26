import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordsChecker {
    private String text;

    public WordsChecker(String text) {
        this.text = text;
    }

    public boolean hasWord(String word) {
        Set<String> set = new HashSet<>();
        String[] parts = text.split("\\P{IsAlphabetic}+");
        set.addAll(List.of(parts));
        return set.contains(word);
    }
}
