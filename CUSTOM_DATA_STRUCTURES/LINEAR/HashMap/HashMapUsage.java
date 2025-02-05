package CUSTOM_DATA_STRUCTURES.LINEAR.HashMap;

public class HashMapUsage {
    public static void main(String[] args) {
        HashMap<String, Integer> persons = new HashMap<>();

        persons.put("Akaki", 19);
        persons.put("Akaki", 20);
        persons.put("Luka", 19);
        persons.put("Goga", 19);
        persons.put("Alex", 20);
        persons.put("Deme", 16);

        System.out.println("map size: " + persons.size());

        System.out.println();

        System.out.println("age of Akaki: " + persons.get("Akaki"));
        System.out.println("age of Luka: " + persons.get("Luka"));
        System.out.println("age of Alex: " + persons.get("Alex"));
        System.out.println("age of Deme: " + persons.get("Deme"));

        System.out.println();

        System.out.println("contains Akaki: " + persons.containsKey("Akaki"));
        System.out.println("contains 19: " + persons.containsValue(19));
        System.out.println("contains Gela: " + persons.containsKey("Gela"));

        System.out.println(persons.remove("Alex"));
        System.out.println(persons.size());

        System.out.println("map: " + persons);

        System.out.println();

        System.out.println("values: " + persons.values());
        System.out.println("key set: " + persons.keySet());

        System.out.println();

        persons.replace("Goga", 19, 18);

        System.out.println("updated persons: " + persons);

        System.out.println();

        for (String key : persons.keySet()) {
            System.out.println(key);
            System.out.println(persons.get(key));
        }

        persons.clear();
        System.out.println(persons);
        System.out.println("map size: " + persons.size());
    }
}
