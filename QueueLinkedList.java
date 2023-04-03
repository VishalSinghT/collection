package collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList {
    public static void main(String[] args) {
        Queue <Integer> queue= new LinkedList<>();
        queue.offer(12);
        queue.offer(13);
        queue.offer(14);

        System.out.println(queue);

        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.peek());
    }
}
