package lesson_5;

import java.util.Scanner;

public class TaskArray {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------------------");
        System.out.println("TASK 1");
        Scanner scanner = new Scanner(System.in);
        int [] lenina = new int[8];

        for (int i = 0; i < lenina.length; i++) {
            lenina [i] = scanner.nextInt();
        }

        int even = 0; // четные
        int odd = 0; // нечетные

        for (int i = 0; i < lenina.length; i++) {
            if (i % 2 == 0) {
                even += lenina[i]; // even = even + lenina[i]
            } else {
                odd += lenina[i];  // odd = odd + lenina[i]
            }
        }

        if (even > odd) {
            System.out.println("На четной стороне улицы живет больше людей");
        } else if (even < odd) {
            System.out.println("На нечетной стороне улицы живет больше людей");
        } else if (even == odd) {
            System.out.println("На обеих сторонах живет одинаковое кол-во людей");
        }
        System.out.println("\n" + "\n");

        System.out.println("-----------------------------------------------------");
        System.out.println("TASK 2");

        System.out.println("println"); // + перенос каретки НА СЛЕДУЮЩИЙ АБЗАЦ
        System.out.print("print"); // БЕЗ переноса каретки НА СЛЕДУЮЩИЙ АБЗАЦ
        System.out.println();
        String name = scanner.nextLine();
        System.out.printf("My name is %s", name);
        int age = scanner.nextInt();
        System.out.printf("My age is %d", age);


        System.out.println("H");

    }
}
