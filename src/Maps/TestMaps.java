package Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMaps {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>(); // внутри нет гарантиии порядка
        // в каком порядке пары добавлены в таком и вернутся
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        TreeMap<Integer, String> treeMap = new TreeMap<>(); // гарантируется сортировка пар (ключ, значение) по ключу

        testMap(hashMap); // видим неупорядоченный вывод, после итерации
        testMap(linkedHashMap); // видим упорядоченный вывод перебора аналогичный введенному
        testMap(treeMap); // видим упорядоченный вывод перебора + сортировка по возрастанию ключа

    }

    public static void testMap(Map<Integer, String> map) {
        map.put(39, "Bob");
        map.put(18, "Mike");
        map.put(19, "Kat");
        map.put(43, "Bivol");
        map.put(0, "Bivol");
        map.put(1500, "GreatWall");
        map.put(7, "Bob");

        // итерируемся по мапу, выводим ключ, знаение
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
