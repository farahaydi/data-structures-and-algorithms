/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hashtable;

import java.util.List;

public class App {

    public static void main(String[] args) {

        Hashtable hashtable = new Hashtable(10);

        hashtable.set("name", "John Doe");
        hashtable.set("age", "30");
        hashtable.set("email", "john@example.com");
        String name = hashtable.get("name");
        String age = hashtable.get("age");
        String email = hashtable.get("email");

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);

        System.out.println("Has 'name': " + hashtable.has("name"));
        System.out.println("Has 'city': " + hashtable.has("city"));

        List<String> keys = hashtable.keys();
        System.out.println("Keys: " + keys);

        hashtable.set("age", "31");
        System.out.println("Updated Age: " + hashtable.get("age"));

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        String input = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...";
        String repeatedWord = hashtable.findFirstRepeatedWord(input);

        if (repeatedWord != null) {
            System.out.println("First repeated word: " + repeatedWord);
        } else {
            System.out.println("No repeated words found.");
        }


        System.out.println("---------- new implementation------------");
        Hashtable2<String, Integer> table = new Hashtable2<>();

        table.set("one", 1);
        table.set("two", 2);
        table.set("three", 3);

        System.out.println(table.get("two"));
        System.out.println(table.has("four"));
        System.out.println(table.keys());
        System.out.println(table.hash("two"));


        String input2 = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...";
        String result = table.repeatedWord(input2);
        System.out.println(result);

    }
}
