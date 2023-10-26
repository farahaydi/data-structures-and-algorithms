package hashtable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Hashtable {
    private int size;
    private List<List<Pair>> table;

    public Hashtable(int size) {
        this.size = size;
        this.table = new ArrayList<>(size);

        for (int i = 0; i < size; i++) {
            this.table.add(new LinkedList<>());
        }
    }
    public int hash(String key) {
        return Math.abs(key.hashCode()) % size;
    }
    public void set(String key, String value) {
        int index = hash(key);
        List<Pair> bucket = table.get(index);

        for (Pair pair : bucket) {
            if (pair.getKey().equals(key)) {
                pair.setValue(value);
                return;
            }
        }

        bucket.add(new Pair(key, value));
    }
    public String get(String key) {
        int index = hash(key);
        List<Pair> bucket = table.get(index);

        for (Pair pair : bucket) {
            if (pair.getKey().equals(key)) {
                return pair.getValue();
            }
        }
        return null;
    }
    public boolean has(String key) {
        int index = hash(key);
        List<Pair> bucket = table.get(index);

        for (Pair pair : bucket) {
            if (pair.getKey().equals(key)) {
                return true;
            }
        }

        return false;
    }

    public List<String> keys() {
        List<String> keys = new ArrayList<>();

        for (List<Pair> bucket : table) {
            for (Pair pair : bucket) {
                keys.add(pair.getKey());
            }
        }

        return keys;
    }
}
