package plf.collections.a_basic_usage_of_ArrayList;

import java.util.*;

/**
 * Created by codefire on 25.03.17.
 */
public class Demo {
    public static void main(String[] args) {
        // Queue queue;
        // Collection c;

        ArrayList list1 = new ArrayList();
        populate(list1);
        LinkedList list2 = new LinkedList(list1);
        print(list2);
        // System.out.println(list1);
    }

    public static void populate(List list) {
        // 1-ый способ получить List
        // List elements = Arrays.asList(3.14, 2.71, 9.36);

        // 2-oй способ получить List
        List elements = new ArrayList();
        elements.add(3.14);
        elements.add(2.71);
        elements.add(9.36);
        // копируем элементы поэлементно, чтобы продимонстрировать foreach and add()
        for (Object element : elements) {
            list.add(element);
        }
    }

    public static void print(List list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
