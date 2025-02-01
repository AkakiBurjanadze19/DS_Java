package CUSTOM_DATA_STRUCTURES.LINEAR.ArrayList;

public class CustomArrayList<T> implements CustomList<T> {
    private T[] items;
    private int size;
    private static final int RESIZE_FACTOR = 2;
    private static final int INITIAL_CAPACITY = 10;

    public CustomArrayList() {
        this.items = (T[]) new Object[INITIAL_CAPACITY];
        this.size = 0;
    }

    @Override
    public void add(T item) {
        if (this.size() == this.items.length) {
            this.resize();
        }

        this.items[this.size++] = item;
    }

    @Override
    public boolean contains(T item) {
        for (int i = 0; i < this.size(); i++) {
            if (this.items[i].equals(item)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public CustomArrayList<T> cloneList() {
        CustomArrayList<T> clonedItems = new CustomArrayList<>();

        for (int i = 0; i < this.size(); i++) {
            clonedItems.add(this.items[i]);
        }

        return clonedItems;
    }

    @Override
    public void print() {
        String insertSpace;
        String insertComma;
        System.out.print("[");
        for (int i = 0; i < this.size(); i++) {
            insertSpace = i == this.size() - 1 ? "" : " ";
            insertComma = i != this.size() - 1 ? "," : "";
            System.out.print(this.items[i] + insertComma + insertSpace);
        }
        System.out.print("]");
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    /* Resize an array list whenever maximum capacity is reached */
    private void resize() {
        int newCapacity = this.items.length * RESIZE_FACTOR;
        T[] newElements = (T[]) new Object[newCapacity];

        for (int i = 0; i < this.items.length; i++) {
            newElements[i] = this.items[i];
        }

        this.items = newElements;
    }
}
