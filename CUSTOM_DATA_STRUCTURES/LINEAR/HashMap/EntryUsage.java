package CUSTOM_DATA_STRUCTURES.LINEAR.HashMap;

import java.util.ArrayList;
import java.util.List;

public class EntryUsage {
    public static void main(String[] args) {
        Entry<String, Integer> person1 = new Entry<>("Akaki", 19);
        Entry<String, Integer> person2 = new Entry<>("Luka", 19);
        Entry<String, Integer> person3 = new Entry<>("Alex", 20);

        List<Entry> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);

//        System.out.println(person1);
//        System.out.println(person2);
//        System.out.println(person3);

        for (Entry person : persons) {
            System.out.println(person);
        }
    }
}
