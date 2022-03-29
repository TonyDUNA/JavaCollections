package Sets;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();

        hashSet.add("Mike");
        hashSet.add("Ketty");
        hashSet.add("Tom");
        hashSet.add("Bob");
        hashSet.add("Julia");
        hashSet.add("Julia"); // дубликаты не выводятся
        hashSet.add("Julia");

        for (String name : hashSet) {
            System.out.println(name);
        }

        System.out.println(hashSet);

        // метод contains() - есть в сете или нет - булеан. - очень быстрый метод
        System.out.println(hashSet.contains("Mike"));
        System.out.println(hashSet.contains("Moke"));

        // isEmpty() - пустой или нет?
        System.out.println(hashSet.isEmpty());

    }
}
