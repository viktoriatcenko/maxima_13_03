package lesson_2;

public class Main {
    public static void main(String[] args) {
        // ��� ������_���������� = ��������_�������_��_�����_��_���������;
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

        // ������ 1. ����: a = 60, b = 45, c = 17. ����� �������� ������������
        byte a = 60;
        byte b = 45;
        byte c = 17;
        int p = a + b + c;
        System.out.println("Perimeter is " + p);

        // ������ 2. ����: �������� ���� ������� �� 9 ����� 3 ������, � ����� �� 15 �����,
        // ��������� ������� �������� ���� ������� ���� �����?
        int hungryTime = 9;
        int fullTime = 15;
        int bananas = 3;
        int hungryBananasPerMinute = hungryTime / bananas; // 3
        int fullBananasPerMinute = fullTime / bananas; // 5
        int diff = fullBananasPerMinute - hungryBananasPerMinute;
        System.out.println("The difference is " + diff);

        // ������ 3. ����: ���� ������� ����� ����� � ������� ���� ������� �� 127 ������.
        //����� �������� � ��������� ��� �� 2 �����. �� ������� ������ ������� ���� ������� ����?

        byte first = 127;
        byte moreDeep = 2;
        int result = (first + moreDeep);
        System.out.println("Result " + result);

        // ������ 4. ����: ������ ��������� �������� 5 ������ �� 2 �����. ������� ������ ����� � ������ �����?
        double rub = 5;
        int kass = 2;
        double res = rub / kass;
        System.out.println("Result in each cashmachine " + res);

        // ������ 6. ����: 10 ������� � 5 ������� �����.
        // ������: ����� �� �����������, ��� ������� ����� ������?
        int redApples = 10;
        int greenApples = 5;

        boolean utverzhd = redApples < greenApples;
        System.out.println("Condition is " + utverzhd);
    }
}

