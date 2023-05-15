package lesson_14;

import java.util.HashSet;
import java.util.Iterator;

public class Numismatic {

    public static void main(String[] args) {
        /**
         * * ���� ������ 3 HashCode
         * * �������� ����� Hash - �������� ������� � ��������� ��������� �����������
         * * ����������� ��� �� ������������ ����� � � ��� ��� ���� ��������� ����� �� 19 000 ����.
         * * ��� ���������� ����� ������, ��� ������ ��������� ���� �� ����� �� � ��� ��� ���, ����
         * � ��������� ��� ������ ������ ���� ����������. ����� ������ ��������� �� �������, �� ��������, �� ��������, ��� �������.
         * * �� ���� ����� �������������� ������� ���� � ������ ������. * � �������������� ������ ����
         * ���������� ������������, �������� ���� �� ������.
         * * ������������ ������������� ����� ���� �������� ���, ������� � ������� ����� ������.
         * * ��� ���� � ���� ������ ������� ����� ���� ������ �������, �� � ����� ����� ��� �������,
         *  ������� �� ����� * � ������, �������� ����. ������� ����� ��������� ������ .hashcode ������
         *  ���������� ����� .equals u * ������������ �������� ������ � ������� boolean ���������� ����
         *  ����� ������ � ��������� ��� ���.
         * */


        Coin coin1 = new Coin(5, 20.1, "Russia", 2001);
        Coin coin2 = new Coin(5, 20.1, "Belarus", 2001);
        Coin coin3 = new Coin(5, 20.1, "England", 2001);
        Coin coin4 = new Coin(5, 20.1, "Spain", 2001);
        Coin coin5 = new Coin(5, 20.1, "England", 2001);

        HashSet<Coin> coinCollection = new HashSet<>();
        coinCollection.add(coin1);
        coinCollection.add(coin2);
        coinCollection.add(coin3);
        coinCollection.add(coin4);
        coinCollection.add(coin5);

        for (Iterator<Coin> iter = coinCollection.iterator(); iter.hasNext();) {
            System.out.println(iter.next());
        }

        System.out.println("");
    }



}
