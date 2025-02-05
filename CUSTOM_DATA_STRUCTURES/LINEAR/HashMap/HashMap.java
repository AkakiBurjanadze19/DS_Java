package CUSTOM_DATA_STRUCTURES.LINEAR.HashMap;

import java.util.*;

public class HashMap<K, V> {
    private List<Entry> items;
    private int size;

    public HashMap() {
        this.items = new ArrayList<>();
        this.size = 0;
    }

    public void put(K key, V value) {
        if (!this.containsKey(key)) {
            this.items.add(new Entry(key, value));
            this.size++;
        }
    }

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

    public boolean containsKey(K key) {
        for (Entry entry : this.items) {
            if (entry.getKey().equals(key)) {
                return true;
            }
        }

        return false;
    }

    public boolean containsValue(V value) {
        for (Entry entry : this.items) {
            if (entry.getValue().equals(value)) {
                return true;
            }
        }

        return false;
    }

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

    public boolean replace(K key, V oldValue, V newValue) {
        for (Entry entry : this.items) {
            if (entry.getKey().equals(key) && entry.getValue().equals(oldValue)) {
                entry.setValue(newValue);
                return true;
            }
        }

        return false;
    }

    public List<V> values() {
        List<V> valuesList = new ArrayList<>();

        for (Entry entry : this.items) {
            valuesList.add((V) entry.getValue());
        }

        return Collections.unmodifiableList(valuesList);
    }

    public Set<K> keySet() {
        Set<K> keys = new HashSet<>();

        for (Entry entry : this.items) {
            keys.add((K) entry.getKey());
        }

        return Collections.unmodifiableSet(keys);
    }

    public void clear() {
        Iterator<Entry> iterator = this.items.iterator();

        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }

        this.size = 0;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public String toString() {
        StringBuilder output = new StringBuilder();

        for (Entry entry : this.items) {
            output.append(entry);
        }

        return output.toString();
    }
}
