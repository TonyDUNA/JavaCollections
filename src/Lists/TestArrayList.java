package Lists;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(); // тип хранимых объектов Integer. Лучше ссылать объект
        // ArrayList на List(интерфейс) а не на ArrayList - согласно конвенции
        for (int i = 0; i < 10; i++) {
            list.add(i); // метод добавление в ArrayList
        }
        System.out.println(list);

        System.out.println(list.get(1)); // метод получение знач. по индексу
        System.out.println(list.get(9));

        System.out.println(list.size()); // метод получения размера ArrayList

        // Прохождение по ArrayList
        for (int i = 0; i <list.size(); i++) { // fori
            System.out.println(list.get(i));
        }

        for (Integer x:list) { // foreach
            System.out.println(x);
        }

        // удаление элемента
        list.remove(5); // неэффективно исполнение в начале и середине - сначала удаляет> потом сдвигает
        // все элементы справа налево
        System.out.println(list);

        // мы делаем много удалений из нашего листа, мы можем поменять реализацию на ходу
        list = new LinkedList<>();


    }
}
