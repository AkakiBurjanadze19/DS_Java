package CUSTOM_DATA_STRUCTURES.LINEAR.Set;

public class ArraySet<T> implements Set<T> {
    private T[] items;
    private int size;

    public ArraySet(int capacity) {
        this.items = (T[]) new Object[capacity];
        this.size = 0;
    }

    @Override
    /*
        Time Complexity: O(1)
        Space Complexity: O(1)
    */
    public void add(T item) {
        if (this.size() == this.items.length) {
            throw new IllegalStateException("ArraySet is full! New elements cannot be added!");
        }

        if (!this.contains(item)) {
            this.items[this.size++] = item;
        }
    }

    @Override
    /*
        Time Complexity: O(n)
        Space Complexity: O(1)
    */
    public T remove(T item) {
        if (this.isEmpty()) {
            throw new IllegalStateException("ArraySet is empty! Elements cannot be removed!");
        }

        int elementIndex = -1;
        for (int i = 0; i < this.size(); i++) {
            if (this.items[i].equals(item)) {
                elementIndex = i;
            }
        }

        T removedItem = this.items[elementIndex];
        this.items[elementIndex] = null;

        for (int i = elementIndex; i < this.size() - 1; i++) {
            this.items[i] = this.items[i + 1];
        }

        this.size--;
        return removedItem;
    }

    @Override
    /*
        Time Complexity: O(n)
        Space Complexity: O(1)
    */
    public boolean contains(T item) {
        for (int i = 0; i < this.size(); i++) {
            if (this.items[i].equals(item)) {
                return true;
            }
        }

        return false;
    }

    @Override
    /*
        Time Complexity: O(n)
        Space Complexity: O(n)
    */
    public ArraySet<T> cloneSet() {
        ArraySet<T> items = new ArraySet<>(this.items.length);

        for (int i = 0; i < this.size(); i++) {
            items.add(this.items[i]);
        }

        return items;
    }

    @Override
    /*
        Time Complexity: O(n)
        Space Complexity: O(1)
    */
    public void clear() {
        for (int i = 0; i < this.size(); i++) {
            this.items[i] = null;
        }

        this.size = 0;
    }

    @Override
    /*
        Time Complexity: O(1)
        Space Complexity: O(1)
    */
    public int size() {
        return this.size;
    }

    @Override
    /*
        Time Complexity: O(1)
        Space Complexity: O(1)
    */
    public boolean isEmpty() {
        return this.size() == 0;
    }
}
