package lesson_15;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // TreeSet - убирает дубликаты и сортирует вашу коллекцию
        TreeSet<String> strings = new TreeSet<>();
        strings.add("a");
        strings.add("b");
        strings.add("b");
        strings.add("c");
        strings.add("e");
        strings.add("d");

        System.out.println(strings);

        TreeSet<Integer> integers = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        integers.add(125);
        integers.add(227);
        integers.add(227);
        integers.add(12);
        integers.add(345);
        integers.add(74);

        System.out.println(integers);

    }
}
