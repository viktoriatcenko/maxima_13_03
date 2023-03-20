package lesson_2;

public class Main {
    public static void main(String[] args) {
        // ТИП кличка_переменной = ЗНАЧЕНИЕ_КОТОРОЕ_МЫ_ХОТИМ_ЕЙ_ПРИСВОИТЬ;
//        byte a;
//        a = 50;
//        System.out.println("byte     " + a);
//        a = 70;
//        System.out.println("byte    " + a);
//
//        short s = 12345;
//        System.out.println("short   " + s);
//
//        int i = 1234567;
//        System.out.println("int " + i);
//
//        long l = 1231321654L;
//        System.out.println("long " + l);
//
//        float f = 12.345f;
//        System.out.println("float " + f);
//
//        double d = 123.54545444554;
//        System.out.println("double " + d);
//
//        char c = 64;
//        System.out.println("char " + c);
//        c = 64;
//        System.out.println("char c " + c);
//
//        boolean b = true;
//        System.out.println("boolean " + b);
//
//        boolean n = 10 == 5;
//        System.out.println(n);

        // Задача 1. Дано: a = 60, b = 45, c = 17. Найти периметр треугольника
        byte a = 60;
        byte b = 45;
        byte c = 17;
        int p = a + b + c;
        System.out.println("Perimeter is " + p);

        // Задача 2. Дано: Голодный Вася съедает за 9 минут 3 банана, а сытый за 15 минут,
        // насколько быстрее голодный Вася съедает один банан?
        int hungryTime = 9;
        int fullTime = 15;
        int bananas = 3;
        int hungryBananasPerMinute = hungryTime / bananas; // 3
        int fullBananasPerMinute = fullTime / bananas; // 5
        int diff = fullBananasPerMinute - hungryBananasPerMinute;
        System.out.println("The difference is " + diff);

        // Задача 3. Дано: Коля получил много двоек и закопал свой дневник на 127 метров.
        //Потом вернулся и углубился еще на 2 метра. На сколько метров закопал свой дневник Коля?

        byte first = 127;
        byte moreDeep = 2;
        int result = (first + moreDeep);
        System.out.println("Result " + result);

        // Задача 4. Дано: Хитрый бухгалтер разделил 5 рублей на 2 кассы. Сколько рублей лежит в каждой кассе?
        double rub = 5;
        int kass = 2;
        double res = rub / kass;
        System.out.println("Result in each cashmachine " + res);

        // Задача 6. Дано: 10 красных и 5 зеленых яблок.
        // Вопрос: Верно ли утверждение, что красных яблок больше?
        int redApples = 10;
        int greenApples = 5;

        boolean utverzhd = redApples < greenApples;
        System.out.println("Condition is " + utverzhd);
    }
}

