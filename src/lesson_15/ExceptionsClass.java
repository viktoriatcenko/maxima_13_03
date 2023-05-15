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


        System.out.println("Хочу, чтобы программа отработала и тут");

    }
}
