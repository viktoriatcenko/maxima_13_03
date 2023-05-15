package lesson_14;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        // 1 - Создание HashSet коллекции и добавление в нее элементов
        HashSet<String> strings = new HashSet<>();
        strings.add("AAA");
        strings.add("BBB");
        strings.add("BBB");
        strings.add("BBB");
        strings.add("CCC");
        strings.add("DDD");
        strings.add("DDD");
        strings.add("DDD");
        strings.add("EEE");
        strings.add("EEE");

        System.out.println("HashSet не имеет порядка вхождения и не хранит дубли");

        // 2 - LinkedHashSet.

        LinkedHashSet<String> stringLinkedHashSet = new LinkedHashSet<>();
        stringLinkedHashSet.add("AAA");
        stringLinkedHashSet.add("BBB");
        stringLinkedHashSet.add("CCC");
        stringLinkedHashSet.add("CCC");
        stringLinkedHashSet.add("DDD");
        stringLinkedHashSet.add("DDD");
        stringLinkedHashSet.add("EEE");
        stringLinkedHashSet.add("EEE");
        stringLinkedHashSet.add("EEE");

        ;

        System.out.println("LinkedHashSet имеет порядок вхождения, но не хранит дубли");

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        for (Iterator<String> iter = stringLinkedHashSet.iterator()      ; iter.hasNext();      ) {
            System.out.println(iter.next());
        }

        System.out.println("");


    }
}
