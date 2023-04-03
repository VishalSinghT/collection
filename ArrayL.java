package collection;

import java.util.List;
import java.util.*;

public class ArrayL {
    public static void main(String[] args) {
        List<Integer> list  = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        list.add(4);
        System.out.println(list);
//        this will add 40 at index 1
        list.add(1,40);
        System.out.println(list);
        list.set(2,50);
        System.out.println(list.contains(50));
        System.out.println(list);
    }
}
