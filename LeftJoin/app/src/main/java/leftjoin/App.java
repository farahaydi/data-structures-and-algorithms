/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package leftjoin;

import java.util.HashMap;
import java.util.Map;

public class App {

    public static void main(String[] args) {
        HashMap<String, String> synonyms = new HashMap<>();
        synonyms.put("diligent", "employed");
        synonyms.put("fond", "enamored");
        synonyms.put("guide", "usher");
        synonyms.put("outfit", "garb");
        synonyms.put("wrath", "anger");

        HashMap<String, String> antonyms = new HashMap<>();
        antonyms.put("diligent", "idle");
        antonyms.put("fond", "averse");
        antonyms.put("guide", "follow");
        antonyms.put("flow", "jam");
        antonyms.put("wrath", "delight");

        Map<String, String[]> result = LeftJoin.leftJoin(synonyms, antonyms);

        System.out.println("[");

        for (String key : result.keySet()) {
            String[] values = result.get(key);
            System.out.println("  [" + key + ", " + values[0] + ", " + values[1] + "],");
        }

        System.out.println("]");
    }
}