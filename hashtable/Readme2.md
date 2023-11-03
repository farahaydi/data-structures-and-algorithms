# First Word Repeated
The repeatedWord function identifies the first repeated word in a given string of text, while ignoring case. It does this by using a hash table to keep track of encountered words. If a word is encountered more than once, it is returned as the first repeated word. If no repeated words are found, null is returned.

## Whiteboard Process
![Wb](./Screenshot%202023-11-03%20205042.png)

## Approach & Efficiency
The approach taken for repeatedWord is as follows:

Split the input string into individual words.
Process each word, converting it to lowercase for case insensitivity.
Keep track of encountered words in a hash table.
If a word is encountered more than once, return it as the first repeated word.
Efficiency:

Time Complexity: O(n), where n is the number of words in the input string.
Space Complexity: O(n), due to the space used by the hash table.

## Solution

```
public static String repeatedWord(String input) {
        String cleanInput = input.replaceAll("[^a-zA-Z ]", "").toLowerCase();
        String[] words = cleanInput.split("\\s+");

        HashMap<String, Integer> wordFrequency = new HashMap<>();

        for (String word : words) {
            if (wordFrequency.containsKey(word)) {
                return word;
            } else {
                wordFrequency.put(word, 1);
            }
        }

        return null;
    }
```