package CUSTOM_DATA_STRUCTURES.LINEAR.Stack;

public class ArrayStackUsage {
    public static void main(String[] args) {
        Stack<Character> chars = new ArrayStack<>(5);

        chars.push('A');
        chars.push('B');
        chars.push('C');
        chars.push('D');
        chars.push('E');

        System.out.println("top element: " + chars.peek());

        System.out.println();

        System.out.println("position of E: " + chars.search('E'));
        System.out.println("position of D: " + chars.search('D'));
        System.out.println("position of C: " + chars.search('C'));
        System.out.println("position of B: " + chars.search('B'));
        System.out.println("position of A: " + chars.search('A'));

        System.out.println();

        System.out.println("all elements: ");
        while (!chars.isEmpty()) {
            System.out.println(chars.pop());
        }
    }
}
