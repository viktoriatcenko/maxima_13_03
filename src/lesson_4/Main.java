package lesson_4;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // for i

        // ѕерва€ часть - ќбъ€вление переменной i - означает нижний порог от которого мы будем отсчитывать
        // ¬тора€ часть - условие выхода из цикла
        // “реть€ часть - инкрементирование переменной i
//        for (int i = 0; i <= 5; i++) {
//            System.out.println("Hello world!" + i);
//        }

//        for (int i = 1; i <= 100; i++) {
//            System.out.println(i);
//        }

//        for (int j = 1; j <= 100; j++) {
//            if (j % 2 == 0) {
//                System.out.println(j);
//            }
//        }

//        for (int i = 50; i <= 150; i++) {
//            if (i % 2 == 1) {
//                System.out.println(i);
//            }
//        }

        // дел€тс€ на 3 и 5 одновременно от 0 до 150

//        for (int i = 0; i <= 150; i++) {
//            if (i % 15 == 0 && i != 0) {
//                System.out.println(i);
//            }
//        }

        // сложить цифры в диапазоне от 10 до 20
//        int sum = 0;
//
//        for (int i = 10; i <= 20; i++) {
//            int count = 0;
//            count += i; // count = count + i;
//            sum += i; // sum = sum + i;
//        }
//
//        System.out.println(sum);

        // вывести в консоль сумму всех четных чисел от 10 до 50

//        int sum = 0;
//
//        for (int z = 10; z <= 50; z++) {
//            if (z % 2 == 0) {
//                sum += z;
//                System.out.println(sum);
//            }
//        }
//
//        for (int i = 1; i <= 50; i++) {
//            System.out.println(2 * i);
//        }

        // вывести все цифры от 10 до 40, пропустив при этом цифры от 15 до 20
//        for (int i = 10; i <= 40; i++) {
//            if ( i < 15 || i > 20) {
//                System.out.println(i);
//            }
//
//        }

        // while

        int i = 10;
        System.out.println("Final countdown....");

        while (i > 0) {
            Thread.sleep(1000);
            System.out.println(i);
            i--; // i = i - 1
        }
        System.out.println("BOOOM!!!");

//        for (int i = 1; i <= 5; i++) {
//            System.out.println("Hello World");
//        }


    }
}

