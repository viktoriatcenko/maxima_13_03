package lesson_19;

import lesson_16.Fridge;
import lesson_8.Cat;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Snezhok", 10, "Snezhkovich");
        Cat cat2 = new Cat("Sharik", 15, "Sharikovich");
        Cat cat3 = new Cat("Pushok", 7, "Pushkovich");
        Cat cat4 = new Cat("Tom", 10, "Tomovich");

        List<Cat> cats = new ArrayList<>(List.of(cat1, cat2, cat3, cat4));

        cats.forEach(c -> System.out.println(c.getName()));

        cats.sort(Comparator.comparing(Cat::getName));

//        for (Cat c : cats) {
//            System.out.println(c.getName());
//        }


    }

}
