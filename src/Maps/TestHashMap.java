package Maps;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {
    public static void main(String[] args) {
        // 1 -> [.. .. ..]
        // 2 -> [.. .. ..]
        Map<Integer, String> map = new HashMap<>();
// метод добавления ключ+значение
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "тройка");

        System.out.println(map);

        map.put(3, "другое значение"); // старые значения переписываются, не может быть два значения с одним ключом

        System.out.println(map);

        // метод получения значений по ключу
        System.out.println(map.get(2));
        System.out.println(map.get(10)); // возврат null, так как нет в нем такой пары

        // прохождение
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        //
    }
}
