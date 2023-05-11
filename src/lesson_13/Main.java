package lesson_13;

import lesson_8.Cat;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        /**
         * ArrayList<Integer> - это безразмерная коллекция, реализация изменяемого массива интерфейса List.
         * Изменяет размер динамически, но может включать в себя элементы только одного типа.
         * Примитивные типы нельзя хранить внутри коллекций.
         Для этого есть ссылочные типы примитивов:
         int Integer
         byte Byte
         short Short
         char Character
         * */
        Cat cat = new Cat();

        ArrayList<Integer> arrayList = new ArrayList<>();

        // 1. Добавление объектов в коллекцию
        arrayList.add(11);
        arrayList.add(22);
        arrayList.add(33);
        arrayList.add(44);

        // 2 - Получение объектов
        System.out.println("Print first element " + arrayList.get(0));
        System.out.println("Print fourth element " + arrayList.get(3));

        // 3 - Печать списка
        System.out.println(arrayList);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("Print arraylist in fori + " + arrayList.get(i));
        }

        for (Integer var : arrayList) {
            System.out.println("Print arraylist in foreach + " + var);
        }

        // 4 - Удаление элементов коллекции
        // Удаление объекта
        arrayList.remove(Integer.valueOf(22));
        // Удаление по индексу
        arrayList.remove(0);
        // Очищение всей коллекции
        arrayList.clear();


        // 5 - Проверка на наличие элемента

        ArrayList<String> strings = new ArrayList<>();

        strings.add("AAA");
        strings.add("BBB");
        strings.add("CCC");
        strings.add("DDD");
        strings.add("DDD");

        System.out.println(strings.contains("EEE"));

        // 6 - Добавление элемента коллекции на определенный индекс
        strings.add(3,"EEE");

        // 7 - Замена элементов коллекции
        strings.set(3, "NNN");

        // 8 - Узнать размер коллекции
        System.out.println("Размер коллекции - " + strings.size());

        // 9 - Преобразование коллекции в массив
        Object[] array = strings.toArray();

        // 10 - Добавить все элементы в новую коллекцию
        ArrayList<String> copyArrayList = new ArrayList<>();
        copyArrayList.addAll(strings);
        copyArrayList.clear();

        // 11 - проверка на наличие элементов
        System.out.println("Collection strings is empty ? - " + strings.isEmpty());
        System.out.println("Collection copyArrayList is empty ? - " + copyArrayList.isEmpty());

        // 12 - Возвращать индекс элемента в коллекции
        System.out.println("index of element NNN is " + strings.indexOf("NNN"));
        strings.add("NNN");


        System.out.println("");

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(111);
        linkedList.add(222);
        linkedList.add(333);
        linkedList.add(444);
        linkedList.add(555);

    }
}
