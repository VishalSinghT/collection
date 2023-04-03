package collection;

import java.util.ArrayDeque;

public class DequeLearn {
    public static void main(String[] args) {


        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.offer(23);
        ad.offer(33);
        ad.offerFirst(35);
        ad.offer(11);
        ad.offerLast(36);
        ad.offer(44);
        System.out.println(ad);
    }
}