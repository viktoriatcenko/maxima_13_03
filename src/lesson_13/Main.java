package lesson_13;

import lesson_8.Cat;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        /**
         * ArrayList<Integer> - ��� ������������ ���������, ���������� ����������� ������� ���������� List.
         * �������� ������ �����������, �� ����� �������� � ���� �������� ������ ������ ����.
         * ����������� ���� ������ ������� ������ ���������.
         ��� ����� ���� ��������� ���� ����������:
         int Integer
         byte Byte
         short Short
         char Character
         * */
        Cat cat = new Cat();

        ArrayList<Integer> arrayList = new ArrayList<>();

        // 1. ���������� �������� � ���������
        arrayList.add(11);
        arrayList.add(22);
        arrayList.add(33);
        arrayList.add(44);

        // 2 - ��������� ��������
        System.out.println("Print first element " + arrayList.get(0));
        System.out.println("Print fourth element " + arrayList.get(3));

        // 3 - ������ ������
        System.out.println(arrayList);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("Print arraylist in fori + " + arrayList.get(i));
        }

        for (Integer var : arrayList) {
            System.out.println("Print arraylist in foreach + " + var);
        }

        // 4 - �������� ��������� ���������
        // �������� �������
        arrayList.remove(Integer.valueOf(22));
        // �������� �� �������
        arrayList.remove(0);
        // �������� ���� ���������
        arrayList.clear();


        // 5 - �������� �� ������� ��������

        ArrayList<String> strings = new ArrayList<>();

        strings.add("AAA");
        strings.add("BBB");
        strings.add("CCC");
        strings.add("DDD");
        strings.add("DDD");

        System.out.println(strings.contains("EEE"));

        // 6 - ���������� �������� ��������� �� ������������ ������
        strings.add(3,"EEE");

        // 7 - ������ ��������� ���������
        strings.set(3, "NNN");

        // 8 - ������ ������ ���������
        System.out.println("������ ��������� - " + strings.size());

        // 9 - �������������� ��������� � ������
        Object[] array = strings.toArray();

        // 10 - �������� ��� �������� � ����� ���������
        ArrayList<String> copyArrayList = new ArrayList<>();
        copyArrayList.addAll(strings);
        copyArrayList.clear();

        // 11 - �������� �� ������� ���������
        System.out.println("Collection strings is empty ? - " + strings.isEmpty());
        System.out.println("Collection copyArrayList is empty ? - " + copyArrayList.isEmpty());

        // 12 - ���������� ������ �������� � ���������
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
