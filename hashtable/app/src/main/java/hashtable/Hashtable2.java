package hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Hashtable2<K, V> {
    private static final int INITIAL_CAPACITY = 10;
    private List<LinkedList<HashNode<K, V>>> buckets;
    private int size;

    public Hashtable2() {
        this.buckets = new ArrayList<>(INITIAL_CAPACITY);
        for (int i = 0; i < INITIAL_CAPACITY; i++) {
            buckets.add(new LinkedList<>());
        }
        this.size = 0;
    }

    private int getIndex(K key) {
        int hashCode = key.hashCode();
        return Math.abs(hashCode % buckets.size());
    }

    public void set(K key, V value) {
        int index = getIndex(key);
        LinkedList<HashNode<K, V>> bucket = buckets.get(index);

        for (HashNode<K, V> node : bucket) {
            if (node.key.equals(key)) {
                node.value = value;
                return;
            }
        }

        bucket.add(new HashNode<>(key, value));
        size++;
    }

    public V get(K key) {
        int index = getIndex(key);
        LinkedList<HashNode<K, V>> bucket = buckets.get(index);

        for (HashNode<K, V> node : bucket) {
            if (node.key.equals(key)) {
                return node.value;
            }
        }

        return null;
    }

    public boolean has(K key) {
        int index = getIndex(key);
        LinkedList<HashNode<K, V>> bucket = buckets.get(index);

        for (HashNode<K, V> node : bucket) {
            if (node.key.equals(key)) {
                return true;
            }
        }

        return false;
    }

    public List<K> keys() {
        List<K> keyList = new ArrayList<>();

        for (LinkedList<HashNode<K, V>> bucket : buckets) {
            for (HashNode<K, V> node : bucket) {
                keyList.add(node.key);
            }
        }

        return keyList;
    }

    public int hash(K key) {
        return getIndex(key);
    }


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
}
