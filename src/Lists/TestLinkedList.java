package Lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {
    public static void main(String[] args) {
        // для проверки методов add(), toString(), get(), remove() в классе linkedListOrganization:
        LinkedListOrganization linkedListOrganization = new LinkedListOrganization();
        linkedListOrganization.add(1);
        linkedListOrganization.add(4);
        linkedListOrganization.add(432);
        linkedListOrganization.add(23);

        System.out.println(linkedListOrganization);
        System.out.println(linkedListOrganization.get(1));
        System.out.println(linkedListOrganization.get(0));
        System.out.println(linkedListOrganization.get(2));
        linkedListOrganization.remove(1); // проверка удаления
        System.out.println(linkedListOrganization);



        List<Integer> linkedList = new LinkedList<>();
        // имеет методы аналогичные ArrayList:
//        linkedList.add(1); ArrayList быстрее!
//        list.add(0, i); LinkedList бысрее намного при добавлении в начало!!!
//        linkedList.get(3); ArrayList на много быстрее!!!
//        linkedList.size();
//        linkedList.remove(0);
        List<Integer> arrayList = new ArrayList<>();
        measureTime(linkedList);
        measureTime(arrayList);
    }

    private static void measureTime(List<Integer> list) {
        // [1][2][3][4][5] add [6] etc (добавление в конец Array листа)
        // [1][2][3][4][5] add [6] etc (добавление в конец Array листа)
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }


        long start = System.currentTimeMillis(); // текущее время в мсек - до операции

//        for (int i = 0; i < 100000; i++) { //
//            list.get(i);
//        }

        for (int i = 0; i < 10000; i++) {
            list.add(0, i);
        }
        // add [6]>>[1][2][3][4][5] etc (добавление в начало Array листа с перезатиранием и сдвигом всего массива)
        // add head->add[6]>>[1]->[2]->[3]->[4]->[5] etc (добавление в начало Linked листа быстро, добавление указателей только)

        long end = System.currentTimeMillis(); // текущее время в мсек - после операции

        System.out.println(end - start); // в начале ноль
    }
}
