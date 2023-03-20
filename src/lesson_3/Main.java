package lesson_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1 - Primitive type
        // 2 - Linked types written in JDK
        // 3 - Linked Selfwritten type

        /**
         �������������� ���������
         +	���������� �������� �� ��� ������� �� ���������
         -	�������� ������ ������� �� ������ ��������
         *	�������� �������� �� ��� ������� �� ���������
         /	�������� ������� ����� ����� ������� �� ������ �������
         %	����� ����� ������� �� ������ ������� � ���������� ������� �� �������
         ++	��������� - ����������� �������� �������� �� 1 �++ �����������, ++� ����������
         --	��������� - ��������� �������� �������� �� 1	�-- �����������, --� ����������
         * */

        int a = 10 * 10;
        System.out.println(a);

        int b = 10 % 2; // 10 = (9 / 3) + 1
        System.out.println(b);

        int c = 7;

        c = 20;


        c++; // c = c + 1;
        System.out.println(c);

        c--; // c = c - 1;
        c = c - 5;

        System.out.println(c);

        /**
         * ��������� ���������
         *
         * ==	���������, ����� ��� ��� �������� ���� ���������, ���� ��,
         *  �� ������� ���������� ��������	(A == B) � �� �����
         *
         * !=	���������, ����� ��� ��� �������� ���� ���������,
         *  ���� �������� �� �����, �� ������� ���������� ��������	(A != B) � �������� �������
         *
         * >	���������, �������� �� �������� ������ �������� ������,
         *  ��� �������� ������� ��������, ���� ��, �� ������� ���������� ��������	(A > B) � �� �����
         *
         * <	���������, �������� �� �������� ������ �������� ������,
         *  ��� �������� ������� ��������, ���� ��, �� ������� ���������� ��������	(A < B) � �������� �������
         *
         * >=	���������, �������� �� �������� ������ �������� ������ ��� ����� �������� ������� ��������,
         *  ���� ��, �� ������� ���������� ��������	(A >= B) � �������� �� �����
         *
         * <=	���������, ���� �������� ������ �������� ������ ��� ����� �������� ������� ��������,
         *  ���� ��, �� ������� ���������� ��������	(A <= B) � �������� �������
         * */

        boolean bool = 10 <= 5;
        System.out.println(bool);

        /**
         * ���������� ���������
         *
         * &&	���������� ���������� �������� �Ȼ. ���� ��� �������� �������� �� ����� ����,
         * �� ������� ���������� ��������
         * ||	���������� ���������� �������� ���Ȼ. ���� ����� �� ���� ��������� �� ����� ����,
         * �� ������� ���������� ��������
         * !	���������� ���������� �������� ��Ż. ������������� ������ ���������� ��������� ������ ��������.
         * ���� ������� ����� �������� true, �� �������� ����������� ��Ż ����� ������ false
         * */

        boolean bool2 = 10 == 5 && 10 > 6 && 10 > 7;
        System.out.println(bool2);

        boolean bool3 = 10 == 5 || 10 > 6;
        System.out.println(bool3);

        boolean bool4 = 10 == 5 || 10 > 6;
        System.out.println(!bool4);


        // ��������� ����������
        // += � ������������������
        // *= � ������������������
        // /= � ������������������
        // -= � ������������������

        int f = 10;
        f /= 5; // f = f + 5;
        System.out.println(f);

        /**
         * if (�������) {
         * //��������(-�), ������� �����������, ���� ������� �������;
         * }
         * else if (�������) {
         * //��������(-�), ������� �����������, ���� ������� �������;
         * }
         * else if (�������) {
         * //��������(-�), ������� �����������, ���� ������� �������;
         * }
         * else {
         * //��������(-�), ������� �����������, ���� ������� �������;
         * }
         * */

        int age = 10;

        if (age >= 13) {
            System.out.println("Your age is ok");
        } else if (age < 13) {
            System.out.println("No, you can't go to the film");
        }


        int mathRate = 7;

        if (mathRate == 5) {
            System.out.println("�������");
        } else if (mathRate == 4) {
            System.out.println("������");
        } else if (mathRate == 3) {
            System.out.println("�����������������");
        } else if (mathRate == 2) {
            System.out.println("�����");
        } else if (mathRate == 1) {
            System.out.println("�������������");
        } else {
            System.out.println("����� ������ �� ����");
        }


        /**
         *
         switch (������������������) {
         case  (��������1):
         ���1;
         break;
         case (��������2):
         ���2;
         break;
         ...
         case (��������N):
         ���N;
         break;
         default:
         ��������������������;
         break;
         }
         * */

        switch (mathRate) {
            case 5 :
                System.out.println("�������");
                break;
            case 4 :
                System.out.println("������");
                break;
            case 3 :
                System.out.println("�����������������");
                break;
            case 2 :
                System.out.println("�����");
                break;
            case 1 :
                System.out.println("�������������");
                break;
            default:
                System.out.println("����� ������ �� ����");
                break;
        }


        Scanner scan = new Scanner(System.in);
        int fromConsole = scan.nextInt();

        switch (fromConsole) {
            case 30:
                System.out.println("������ ������� ���������");
                break;
            case 15:
                System.out.println("������ ������� ������");
                break;
            case -10:
                System.out.println("������ ������� ��������");
                break;
            default:
                System.out.println("�������� �� ������ ����������, �������� ����� �� �����");
                break;
        }




    }
}
