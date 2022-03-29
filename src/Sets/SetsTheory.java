package Sets;

import java.util.HashSet;
import java.util.Set;

public class SetsTheory {
    public static void main(String[] args) {
       Set<Integer> set1 = new HashSet<>();

       set1.add(0);
       set1.add(1);
       set1.add(2);
       set1.add(3);
       set1.add(4);
       set1.add(5);

       Set<Integer> set2 = new HashSet<>();

       set2.add(2);
       set2.add(3);
       set2.add(4);
       set2.add(5);
       set2.add(6);
       set2.add(7);

       // union = объединение множеств
        Set<Integer> union = new HashSet<>(set1); // примем в качестве аргумента конструктора set1
        union.addAll(set2); // объединим множества

        System.out.println(union); //[0, 1, 2, 3, 4, 5, 6, 7]

        // intersection - пересечение множеств
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2); // оставим в сете intersection все множества из set2

        System.out.println(intersection); // [2, 3, 4, 5]

        // difference - разность множеств
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2); // из сета первого убраны все множества, имеющиеся в сете2

        System.out.println(difference); // [0, 1]
    }
}
