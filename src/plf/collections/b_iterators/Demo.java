package plf.collections.b_iterators;

import java.util.*;

/**
 * Created by codefire on 25.03.17.
 */
public class Demo {
    public static void main(String[] args) {
        // dequeDemo();
        List list = Arrays.asList("afd", "hdi", "kua", "lom");
        list = new ArrayList(list);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object objectElement = iterator.next();
            String stringElement = (String) objectElement;
            if (stringElement.contains("a")) {
                iterator.remove();
            }
        }
        System.out.println(list);
    }

    private static void dequeDemo() {
        Deque deque = new ArrayDeque();
        deque.addLast("op");
        deque.addFirst("ku");
        System.out.println(deque);
    }
}
