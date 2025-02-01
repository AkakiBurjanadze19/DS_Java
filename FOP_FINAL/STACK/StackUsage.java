package FOP_FINAL.STACK;

public class StackUsage {
    public static void main(String[] args) {
        ArrayStack<Character> chars = new ArrayStack<>(5);

        System.out.println("stack size: " + chars.size());
        System.out.println("stack is empty? " + chars.isEmpty());

        chars.push('a');
        chars.push('b');
        chars.push('c');
        chars.push('d');
        chars.push('e');

        System.out.println("stack size: " + chars.size());
        System.out.println("stack is empty? " + chars.isEmpty());

        System.out.println("top element: " + chars.peek());

        System.out.println();

        System.out.println("all elements: ");
        while (!chars.isEmpty()) {
            System.out.println(chars.pop());
        }
    }
}
