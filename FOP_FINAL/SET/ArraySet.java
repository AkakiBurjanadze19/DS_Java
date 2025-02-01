package FOP_FINAL.SET;

public class ArraySet<T> implements Set<T> {
    private T[] items;
    private int size;

    public ArraySet(int capacity) {
        this.items = (T[]) new Object[capacity];
        this.size = 0;
    }

    @Override
    public void add(T item) {
        if (this.size() == this.items.length) {
            throw new IllegalStateException("The set is full. No more new elements can be added!");
        }

        if (!this.contains(item)) {
            this.items[this.size++] = item;
        }
    }

    @Override
    public boolean contains(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == item) {
                return true;
            }
        }

        return false;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }
}
