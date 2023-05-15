package lesson_14;

import java.util.HashSet;
import java.util.Iterator;

public class Numismatic {

    public static void main(String[] args) {
        /**
         * * Блок теории 3 HashCode
         * * Ключевое слова Hash - означает наличие в коллекции механизма хэширования
         * * Представьте что вы коллекционер монет и у Вас уже есть коллекция монет из 19 000 штук.
         * * Вом предложили новую монету, кок быстро проверить есть ли такая же у вас или нет, ведь
         * в коллекции все монеты должны быть уникальный. Можно быстро проверить по странам, по номиналу, по диаметру, год выпуска.
         * * То есть нужны характеристики которые есть у каждой монеты. * И характеристика должна быть
         * объективно определяемой, например цвет не пойдет.
         * * Совокупность характеристик может дать числовой код, который и покажет номер ячейки.
         * * При этом у двух разных монеток могут быть разные хэшкоды, но у монет будут еще отличия,
         *  которые не вошли * в хэшкод, например цвет. Поэтому после отработки методо .hashcode должен
         *  отроботать метод .equals u * окончательно сравнить монеты и вернуть boolean означающий есть
         *  такая монета в коллекции или нет.
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
