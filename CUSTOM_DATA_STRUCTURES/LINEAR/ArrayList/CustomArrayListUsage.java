package CUSTOM_DATA_STRUCTURES.LINEAR.ArrayList;

public class CustomArrayListUsage {
    public static void main(String[] args) {
        CustomArrayList<String> names = new CustomArrayList<>();

        names.add("Akaki");
        names.add("Luka");
        names.add("Goga");
        names.add("Alex");

        CustomArrayList<String> clonedNames = names.cloneList();

        names.print();
        System.out.println();
        clonedNames.print();

        System.out.println();

        System.out.println(names.contains("Goga"));
        System.out.println(names.contains("Akaki"));
        System.out.println(names.contains("Mathew"));
    }
}
