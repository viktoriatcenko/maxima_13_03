package lesson_15;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;

public class ExceptionsClass {
    public static void main(String[] args) {
        System.out.println("-------------------------------------");
//        System.out.println(10/0);
//        ArithmeticException arithmeticException = new ArithmeticException();
//        arithmeticException.printStackTrace();
//        System.exit(1);

        System.out.println("-------------------------------------");

//        String text = null;
//        System.out.println(text.length());
//        NullPointerException nullPointerException = new NullPointerException();
//        nullPointerException.printStackTrace();
//        System.exit(1);

        System.out.println("-------------------------------------");
        String password = null;
        try {
            System.out.println(password.length());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("-------------------------------------");
        try {
            Files.copy(new File("D:/rg.jpg").toPath(), new File("D:/rg4324234.jpg").toPath());
        } catch (NoSuchFileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("-------------------------------------");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
        }

        System.out.println("-------------------------------------");


        try {
            System.out.println(password.length());
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            // Очистить кэш, внести запись в журнал логов, отравить уведомление о выполнении операции
            // в блоке try
        }





        System.out.println("Хочу, чтобы программа отработала и тут");

    }
}
