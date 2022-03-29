package HashCode;

import com.sun.source.doctree.SeeTree;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Map<Person, String> map = new HashMap<>();
        Set<Person> set = new HashSet<>();

        Person person1 = new Person(1, "Mike");
        Person person2 = new Person(1, "Mike");

        map.put(person1, "smth");
        map.put(person2, "smth");

        set.add(person1);
        set.add(person2);

        // несмотря на то, что два объекта имеют одинаковые значения "людей", поторяется один и тот же объект два раза
        // это неверно, потому-что для Java это два разных объекта
        // Этой проблемы нет при добавлении строк, - дубикаты удаляются, потому-что стандартные классы в джаве реализуют методы
        // hashCode() equals()
        System.out.println(map); // {Person{id=1, name='Mike'}=smth, Person{id=1, name='Mike'}=smth}
        System.out.println(set); // [Person{id=1, name='Mike'}, Person{id=1, name='Mike'}]

        // после переопределения методов equals(Object o), hashCode() удаляются дубликаты по значениям и id.

    }
}

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    // объект любой длины преобразуется в целое число фиксированной длины {object} -> int, так как сравнение целых чисел проще
    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}