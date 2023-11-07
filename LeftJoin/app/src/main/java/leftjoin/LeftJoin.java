package leftjoin;

import java.util.HashMap;
import java.util.Map;

public class LeftJoin {
    public static Map<String, String[]> leftJoin(HashMap<String, String> synonyms, HashMap<String, String> antonyms) {
        Map<String, String[]> result = new HashMap<>();

        for (String key : synonyms.keySet()) {
            String synonym = synonyms.get(key);
            String antonym = antonyms.getOrDefault(key, "NULL");

            result.put(key, new String[]{synonym, antonym});
        }

        return result;
    }
}
