package collection;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueList {
    public static void main(String[] args) {

        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());// for converting in min to max heap

        pq.offer(40);
        pq.offer(30);
        pq.offer(12);
        pq.offer(36);

        System.out.println(pq);
        pq.poll();
        System.out.println(pq.peek());



    }
}
