package lesson_5;

import java.util.Scanner;

public class PrintTask {
    public static void main(String[] args) {
        System.out.println("println"); // + ������� ������� �� ��������� �����
        System.out.print("print"); // ��� �������� ������� �� ��������� �����
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.printf("My name is %s", name);
        int age = scanner.nextInt();
        System.out.printf("My age is %d", age);
    }
}
