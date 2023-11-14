package mostcommonword;

import java.util.HashMap;
import java.util.Map;

public class MostCommonWord {
    public static String findMostCommonWord(String book) {
        book = book.toLowerCase();
        String[] words = book.split("\\s+");
        Map<String, Integer> wordFrequency = new HashMap<>();
        String mostCommonWord = "";
        int mostCommonCount = 0;
        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z]", "");

            if (word.isEmpty()) {
                continue;
            }
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
            if (wordFrequency.get(word) > mostCommonCount) {
                mostCommonWord = word;
                mostCommonCount = wordFrequency.get(word);
            }
        }
        return mostCommonWord;
    }

}
