package CUSTOM_DATA_STRUCTURES.NON_LINEAR.PriorityQueue;

public class PriorityQueueNode {
    private String value;
    private int priority;

    public PriorityQueueNode(String value, int priority) {
        this.value = value;
        this.priority = priority;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getPriority() {
        return this.priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
