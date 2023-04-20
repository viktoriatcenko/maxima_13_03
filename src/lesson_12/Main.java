package lesson_12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        String answer = age >= 14 ? "Your age is ok" : "No, you can't go to the film";
        System.out.println(answer);

        int factorial = Util.findFactorial(7);
        System.out.println(factorial);
    }
}
