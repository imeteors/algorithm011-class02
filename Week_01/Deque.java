import java.util.ArrayDeque;

public class Deque {

    public static void main(String[] args) {
        java.util.Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("a");
        deque.addFirst("b");
        deque.addLast("c");
        System.out.println(deque.peek());
        while (!deque.isEmpty()) {
            System.out.println(deque.removeFirst());
        }
    }
    
}