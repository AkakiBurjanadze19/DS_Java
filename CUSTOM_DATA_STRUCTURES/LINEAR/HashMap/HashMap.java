package CUSTOM_DATA_STRUCTURES.LINEAR.HashMap;

import java.util.*;

public class HashMap<K, V> {
    private List<Entry> items;
    private int size;

    public HashMap() {
        this.items = new ArrayList<>();
        this.size = 0;
    }

    /*
        Time Complexity: O(n)
        Space Complexity: O(1)
    */
    public void put(K key, V value) {
        for (Entry entry : this.items) {
            if (entry.getKey().equals(key)) {
                entry.setValue(value);
                return;
            }
        }

        this.items.add(new Entry(key, value));
        this.size++;
    }

    /*
        Time Complexity: O(n)
        Space Complexity: O(1)
    */
    public V get(K key) {
        if (this.isEmpty()) {
            throw new IllegalStateException("Map is empty. Element cannot be retrieved!");
        }

        for (Entry entry : this.items) {
            if (entry.getKey().equals(key)) {
                return (V) entry.getValue();
            }
        }

        return null;
    }

    /*
        Time Complexity: O(n)
        Space Complexity: O(1)
    */
    public boolean containsKey(K key) {
        for (Entry entry : this.items) {
            if (entry.getKey().equals(key)) {
                return true;
            }
        }

        return false;
    }

    /*
        Time Complexity: O(n)
        Space Complexity: O(1)
    */
    public boolean containsValue(V value) {
        for (Entry entry : this.items) {
            if (entry.getValue().equals(value)) {
                return true;
            }
        }

        return false;
    }

    /*
        Time Complexity: O(n^2)
        Space Complexity: O(1)
    */
    public boolean remove(K key) {
        if (this.isEmpty()) {
            throw new IllegalStateException("Map is empty. Element cannot be removed!");
        }

        for (int i = 0; i < this.items.size(); i++) {
            Entry entry = this.items.get(i);
            if (entry.getKey().equals(key)) {
                this.items.remove(i);
                this.size--;
                return true;
            }
        }

        return false;
    }

    /*
        Time Complexity: O(n^2)
        Space Complexity: O(1)
    */
    public boolean remove(K key, V value) {
        if (this.isEmpty()) {
            throw new IllegalStateException("Map is empty. Element cannot be removed!");
        }

        for (int i = 0; i < this.items.size(); i++) {
            Entry entry = this.items.get(i);
            if (entry.getKey().equals(key) && entry.getValue().equals(value)) {
                this.items.remove(i);
                this.size--;
                return true;
            }
        }

        return false;
    }

    /*
        Time Complexity: O(n)
        Space Complexity: O(1)
    */
    public boolean replace(K key, V oldValue, V newValue) {
        for (Entry entry : this.items) {
            if (entry.getKey().equals(key) && entry.getValue().equals(oldValue)) {
                entry.setValue(newValue);
                return true;
            }
        }

        return false;
    }

    /*
        Time Complexity: O(n)
        Space Complexity: O(1)
    */
    public List<V> values() {
        List<V> valuesList = new ArrayList<>();

        for (Entry entry : this.items) {
            valuesList.add((V) entry.getValue());
        }

        return Collections.unmodifiableList(valuesList);
    }

    /*
        Time Complexity: O(n)
        Space Complexity: O(1)
    */
    public Set<K> keySet() {
        Set<K> keys = new HashSet<>();

        for (Entry entry : this.items) {
            keys.add((K) entry.getKey());
        }

        return Collections.unmodifiableSet(keys);
    }

    /*
        Time Complexity: O(n)
        Space Complexity: O(1)
    */
    public void clear() {
        Iterator<Entry> iterator = this.items.iterator();

        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }

        this.size = 0;
    }

    /*
        Time Complexity: O(1)
        Space Complexity: O(1)
    */
    public int size() {
        return this.size;
    }

    /*
        Time Complexity: O(1)
        Space Complexity: O(1)
    */
    public boolean isEmpty() {
        return this.size() == 0;
    }

    /*
        Time Complexity: O(n)
        Space Complexity: O(n)
    */
    public String toString() {
        StringBuilder output = new StringBuilder();

        for (Entry entry : this.items) {
            output.append(entry);
        }

        return output.toString();
    }
}
