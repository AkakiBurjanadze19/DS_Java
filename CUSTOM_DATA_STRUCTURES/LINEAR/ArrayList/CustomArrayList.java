package CUSTOM_DATA_STRUCTURES.LINEAR.ArrayList;

import java.util.function.Consumer;
import java.util.function.Predicate;

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
    /*
        Time Complexity: O(n)
        Space Complexity: O(n)
    */
    public void add(T item) {
        if (this.size() == this.items.length) {
            this.resize();
        }

        this.items[this.size++] = item;
    }

    @Override
    /*
        Time Complexity: O(n)
        Space Complexity: O(1)
    */
    public boolean contains(T item) {
        if (this.isEmpty()) {
            throw new IllegalStateException("ArrayList is empty!");
        }

        // Perform simple linear search and compare the item
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
    public CustomArrayList<T> cloneList() {
        CustomArrayList<T> clonedItems = new CustomArrayList<>();

        // Copy all items from the original ArrayList into a new ArrayList
        for (int i = 0; i < this.size(); i++) {
            clonedItems.add(this.items[i]);
        }

        return clonedItems;
    }

    @Override
    /*
        Time Complexity: O(n)
        Space Complexity: O(1)
    */
    public void forEach(Consumer<T> action) {
        // Perform an action on each item
        for (int i = 0; i < this.size(); i++) {
            action.accept(this.items[i]);
        }
    }

    @Override
    /*
        Time Complexity: O(1)
        Space Complexity: O(1)
    */
    public T get(int index) {
        if (this.isEmpty()) {
            throw new IllegalStateException("ArrayList is empty!");
        }

        if (index < 0 || index > this.size() - 1) {
            throw new IndexOutOfBoundsException("Index out of bounds!");
        }

        return this.items[index];
    }

    @Override
    /*
        Time Complexity: O(n)
        Space Complexity: O(1)
    */
    public int indexOf(T item) {
        if (this.isEmpty()) {
            throw new IllegalStateException("ArrayList is empty!");
        }

        // Perform linear search and compare the item to obtain an item index
        for (int i = 0; i < this.size(); i++) {
            if (this.items[i].equals(item)) {
                return i;
            }
        }

        return -1;
    }

    @Override
    /*
        Time Complexity: O(n)
        Space Complexity: O(1)
    */
    public int lastIndexOf(T item) {
        if (this.isEmpty()) {
            throw new IllegalStateException("ArrayList is empty!");
        }

        int lastIndex = -1;
        /*
            Perform linear search and don't stop until the whole array is scanned because we are interested for last
            item's index
        */
        for (int i = 0; i < this.size(); i++) {
            if (this.items[i].equals(item)) {
                lastIndex = i;
            }
        }

        return lastIndex;
    }

    @Override
    /*
        Time Complexity: O(n)
        Space Complexity: O(1)
    */
    public void remove(T item) {
        if (this.isEmpty()) {
            throw new IllegalStateException("ArrayList is empty!");
        }

        int elementIndex = this.indexOf(item);
        if (elementIndex == -1) {
            throw new IllegalArgumentException("Element not found in the list!");
        }

        // Shift elements to the left to fill the gap
        for (int i = elementIndex; i < this.size() - 1; i++) {
            this.items[i] = this.items[i + 1];
        }

        // Clear the last element and update the size
        this.items[this.size() - 1] = null;
        this.size--;
    }

    @Override
    /*
        Time Complexity: O(n)
        Space Complexity: O(1)
    */
    public void remove(int index) {
        if (this.isEmpty()) {
            throw new IllegalArgumentException("ArrayList is empty!");
        }

        if (index < 0 || index > this.size() - 1) {
            throw new IndexOutOfBoundsException("Index out of bounds!");
        }

        // Shift elements to the left to fill the gap
        for (int i = index; i < this.size() - 1; i++) {
            this.items[i] = this.items[i + 1];
        }

        // Clear the last element and update the size
        this.items[this.size() - 1] = null;
        this.size--;
    }

    @Override
    /*
        Time Complexity: O(n)
        Space Complexity: O(1)
    */
    public void removeAll(CustomArrayList<T> items) {
        if (items.isEmpty()) {
            throw new IllegalArgumentException("ArrayList is empty!");
        }

        // Set all items at current index to null
        for (int i = 0; i < items.size(); i++) {
            items.set(i, null);
        }

        items.size = 0;
    }

    @Override
    /*
        Time Complexity: O(n)
        Space Complexity: O(1)
    */
    public void removeIf(Predicate<T> condition) {
        if (this.isEmpty()) {
            throw new IllegalArgumentException("ArrayList is empty!");
        }

        int writeIndex = 0;
        for (int readIndex = 0; readIndex < this.size(); readIndex++) {
            if (!condition.test(this.items[readIndex])) {
                // Keep the element if it doesn't satisfy the condition
                this.items[writeIndex] = this.items[readIndex];
                writeIndex++;
            }
        }

        // Clear the remaining elements and update the size
        for (int i = writeIndex; i < this.size(); i++) {
            this.items[i] = null;
        }

        this.size = writeIndex;
    }

    @Override
    /*
        Time Complexity: O(n)
        Space Complexity: O(n)
    */
    public Object[] toArray() {
        Object[] array = new Object[this.size()];

        for (int i = 0; i < this.size(); i++) {
            array[i] = this.get(i);
        }

        return array;
    }

    @Override
    /*
        Time Complexity: O(1)
        Space Complexity: O(1)
    */
    public void set(int index, T item) {
        if (index < 0 || index > this.size() - 1) {
            throw new IndexOutOfBoundsException("Index out of bounds!");
        }

        this.items[index] = item;
    }

    @Override
    /*
        Time Complexity: O(n)
        Space Complexity: O(1)
    */
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
        System.out.println();
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

    /* Resize an array list whenever maximum capacity is reached */
    /*
        Time Complexity: O(n)
        Space Complexity: O(n)
    */
    private void resize() {
        int newCapacity = this.items.length * RESIZE_FACTOR;
        T[] newElements = (T[]) new Object[newCapacity];

        for (int i = 0; i < this.items.length; i++) {
            newElements[i] = this.items[i];
        }

        this.items = newElements;
    }
}
