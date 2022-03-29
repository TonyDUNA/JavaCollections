package Iterable;

import java.util.*;


public class Test {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> iterator = list.iterator();

        int idx = 0; // счетчик итераций
        // Before java5
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

            if (idx == 1)
                iterator.remove(); // удаляем элемент, на котором курсор(указатель) второй итерации

                idx++; // счетчик увелич.
        }
        System.out.println(list);

        // java5
//        for (int x : list) {
//            System.out.println(x);
//        }
    }
}
