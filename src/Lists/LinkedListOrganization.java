package Lists;


import java.lang.reflect.Array;
import java.util.Arrays;

public class LinkedListOrganization {

    // метод добавления add
    private Node head; // сначала в нем null
    private int size;

    public void add(int value) {
        // если первое добавление в список, создаем главный узел и в него записываем значение
        if (head == null) {
            this.head = new Node(value);
        } else {
            // если не первое добавление, то доходим до конца списка и последнему узлу, в качестве следующего указать новый со значением
            Node temp = head;

            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(new Node(value)); // добавляем в конец новый элемент [4]
            // [1] -> [2] -> [3], сначала head ссылается на 1, потом переменной temp присваиваем head, и пока след. элемент
            // не равен нуль, присваиваем переменной temp get.next, до тех пор, пока get.next не вернет null, и переменная
            // temp будет указывать на последний элемент в списке
        }
        size++;
    }

    // реализация метода toString() по сути пройтись по списку и куда-то записать считанное
    public String toString() {
        int[] result = new int[size]; // временный массив с размером списка

        int index = 0;
        Node temp = head; // временный указатель на начало списка

        while (temp != null) {
            result[index++] = temp.getValue(); // инкрементируемся, пока темр не равен нул,
            temp = temp.getNext(); //
        }
        return Arrays.toString(result); // возвращаем строку с массивом
    }

    // реализация метода get()
    public int get(int index) {
        int currentIndex = 0;
        Node temp = head;

        while (temp != null) {
            if (currentIndex == index) {
                return temp.getValue();
            } else {
                temp = temp.getNext();
                currentIndex++;
            }
        }
        // [1] -> [2] -> [3]
        throw new IllegalArgumentException(); // исключение, когда запрашиваемый индекс за пределами листа
    }

    // реализация метода remove() - преимущество LinkedList
    // [1] -> [2] -> [3] - для удаления [2]нужно дойти до 1, и сослаться на [3]
    public void remove(int index) {
        if (index == 0) { // частный случай - удаление первого элемента списка
            head = head.getNext();
            size--;
            return;
        }
        int currentIndex = 0;
        Node temp = head;

        while (temp != null) {
            if (currentIndex == index - 1) { // если предыдущий элемент от индекса равен индексу
                temp.setNext(temp.getNext().getNext()); // меняем след узел на след узел :)
                size--; // декрементируем размер листа
                return; // выходим из цикла
            } else {
                temp = temp.getNext();
                currentIndex++;
            }
        }

    }


    private static class Node {
        private int value; // значение, хранимое в текущем узле
        private Node next; // ссылка на след узел

        // Создадим конструктор для value + геттеры и сеттеры
        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
