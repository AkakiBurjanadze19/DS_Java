package CUSTOM_DATA_STRUCTURES.LINEAR.ArrayList;

import java.util.function.Consumer;

public class CustomArrayListUsage {
    public static void main(String[] args) {
//        CustomArrayList<String> names = new CustomArrayList<>();
//
//        names.add("Akaki");
//        names.add("Luka");
//        names.add("Goga");
//        names.add("Alex");
//
//        CustomArrayList<String> clonedNames = names.cloneList();
//
//        names.print();
//        System.out.println();
//        clonedNames.print();
//
//        System.out.println();
//
//        System.out.println(names.contains("Goga"));
//        System.out.println(names.contains("Akaki"));
//        System.out.println(names.contains("Mathew"));

        CustomArrayList<Integer> numbers = new CustomArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        Consumer<Integer> printNum = num -> System.out.println(num);
        numbers.forEach(printNum);
    }
}
