package Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        // метод добавления
        hashSet.add("Mike");
        hashSet.add("Ketty");
        hashSet.add("Tom");
        hashSet.add("Bob");
        hashSet.add("Julia");

        // выведем перебором - неупорядочено для hashSet
        for (String name : hashSet) {
            System.out.println(name);
        }

        linkedHashSet.add("Mike");
        linkedHashSet.add("Ketty");
        linkedHashSet.add("Tom");
        linkedHashSet.add("Bob");
        linkedHashSet.add("Julia");

        // выведем перебором - упорядочено для linkedHashSet
        for (String name : linkedHashSet) {
            System.out.println(name);
        }

        treeSet.add("Mike");
        treeSet.add("Anton");
        treeSet.add("Тони");
        treeSet.add("Ketty");
        treeSet.add("Tom");
        treeSet.add("Bob");
        treeSet.add("Julia");

        // выведем перебором - упорядочено и сортировано в лексико-графическом порядке для treeSet
        for (String name : treeSet) {
            System.out.println(name);
        }

    }
}
