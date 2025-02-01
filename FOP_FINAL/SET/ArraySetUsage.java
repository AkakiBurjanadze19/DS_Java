package FOP_FINAL.SET;

public class ArraySetUsage {
    public static void main(String[] args) {
        ArraySet<String> set = new ArraySet<>(5);

        System.out.println("set size: " + set.size());
        System.out.println("set is empty? " + set.isEmpty());

        set.add("Apple");
        set.add("Cucumber");
        set.add("Grape");
        set.add("Apple");

        System.out.println("set size: " + set.size());
        System.out.println("set is empty? " + set.isEmpty());

        System.out.println("Apple is in the set: " + set.contains("Apple"));
        System.out.println("Cherry is in the set: " + set.contains("Cherry"));
        System.out.println("Grape is in the set: " + set.contains("Grape"));
    }
}
