package CUSTOM_DATA_STRUCTURES.LINEAR.Set;

public class ArraySetUsage {
    public static void main(String[] args) {
        Set<Integer> set = new ArraySet<>(5);

        set.add(10);
        set.add(20);
        set.add(10);
        set.add(30);
        set.add(40);
        set.add(40);

        System.out.println("set size: " + set.size());
        System.out.println("set contains 10: " + set.contains(10));
        System.out.println("set contains 20: " + set.contains(20));
        System.out.println("set contains 100: " + set.contains(100));

        ArraySet<Integer> cloned = set.cloneSet();
        System.out.println("cloned set size: " + cloned.size());
        System.out.println("cloned set contains 10: " + cloned.contains(10));

        System.out.println(set.remove(40));
        System.out.println("update set size: " + set.size());

        set.clear();

        System.out.println("cleared set size: " + set.size());
        System.out.println("set contains 10: " + set.contains(10));
    }
}
