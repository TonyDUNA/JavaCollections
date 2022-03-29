package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Test {
    public static void main(String[] args) {
        Person person1 = new Person(1);
        Person person2 = new Person(2);
        Person person3 = new Person(3);
        Person person4 = new Person(4);
        Person person5 = new Person(5);

        Queue<Person> people = new ArrayBlockingQueue<Person>(4);
        System.out.println(people.add(person3));
        System.out.println(people.add(person2));
        System.out.println(people.add(person4));
        System.out.println(people.add(person1));
        System.out.println(people.offer(person5)); // вернет false, так как не поместился в очередь
        // очередь в порядке: person3 <- person2 <- person4 <- person1 <- person5

//        for (Person person : people) {
//            System.out.println(person);
//        }

        System.out.println(people.remove()); // удалит первого в очереди
        System.out.println(people.peek()); // достанет элемент из очереди, но не удалит
        System.out.println(people);
    }
}

class Person {
    private int id;

    public Person(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                '}';
    }
}