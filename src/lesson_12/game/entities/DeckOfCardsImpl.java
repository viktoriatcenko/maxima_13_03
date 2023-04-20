package lesson_12.game.entities;

import lesson_12.game.interfaces.CardBJ;
import lesson_12.game.interfaces.DeckOfCards;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class DeckOfCardsImpl implements DeckOfCards {
    CardBJ[] cardBJS = new CardBJ[52];

    public DeckOfCardsImpl() {
        cardBJS[0] = new CardBJImpl("Двойка Треф", 2);
        cardBJS[1] = new CardBJImpl("Двойка Черви", 2);
        cardBJS[2] = new CardBJImpl("Двойка Буби", 2);
        cardBJS[3] = new CardBJImpl("Двойка Пики",2);

        cardBJS[4] = new CardBJImpl("Тройка Трефа", 3);
        cardBJS[5] = new CardBJImpl("Тройка Черви", 3);
        cardBJS[6] = new CardBJImpl("Тройка Бубны", 3);
        cardBJS[7] = new CardBJImpl("Тройка Пики", 3);

        cardBJS[8] = new CardBJImpl("Четверка Трефа", 4);
        cardBJS[9] = new CardBJImpl("Четверка Черви", 4);
        cardBJS[10] = new CardBJImpl("Четверка Бубны", 4);
        cardBJS[11] = new CardBJImpl("Четверка Пики", 4);

        cardBJS[12] = new CardBJImpl("Пятерка Трефа", 5);
        cardBJS[13] = new CardBJImpl("Пятерка Черви", 5);
        cardBJS[14] = new CardBJImpl("Пятерка Бубны", 5);
        cardBJS[15] = new CardBJImpl("Пятерка Пики", 5);

        cardBJS[16] = new CardBJImpl("Шестерка Трефа", 6);
        cardBJS[17] = new CardBJImpl("Шестерка Черви", 6);
        cardBJS[18] = new CardBJImpl("Шестерка Бубны", 6);
        cardBJS[19] = new CardBJImpl("Шестерка Пики", 6);

        cardBJS[20] = new CardBJImpl("Семерка Трефа", 7);
        cardBJS[21] = new CardBJImpl("Семерка Черви", 7);
        cardBJS[22] = new CardBJImpl("Семерка Бубны", 7);
        cardBJS[23] = new CardBJImpl("Семерка Пики", 7);

        cardBJS[24] = new CardBJImpl("Восьмерка Трефа", 8);
        cardBJS[25] = new CardBJImpl("Восьмерка Черви", 8);
        cardBJS[26] = new CardBJImpl("Восьмерка Бубны", 8);
        cardBJS[27] = new CardBJImpl("Восьмерка Пики", 8);

        cardBJS[28] = new CardBJImpl("Девятка Трефа", 9);
        cardBJS[29] = new CardBJImpl("Девятка Черви", 9);
        cardBJS[30] = new CardBJImpl("Девятка Бубны", 9);
        cardBJS[31] = new CardBJImpl("Девятка Пики", 9);

        cardBJS[32] = new CardBJImpl("Десятка Трефа", 10);
        cardBJS[33] = new CardBJImpl("Десятка Черви", 10);
        cardBJS[34] = new CardBJImpl("Десятка Бубны", 10);
        cardBJS[35] = new CardBJImpl("Десятка Пики", 10);

        cardBJS[36] = new CardBJImpl("Валет Трефа", 10);
        cardBJS[37] = new CardBJImpl("Валет Черви", 10);
        cardBJS[38] = new CardBJImpl("Валет Бубны", 10);
        cardBJS[39] = new CardBJImpl("Валет Пики", 10);

        cardBJS[40] = new CardBJImpl("Дама Трефа", 10);
        cardBJS[41] = new CardBJImpl("Дама Черви", 10);
        cardBJS[42] = new CardBJImpl("Дама Бубны", 10);
        cardBJS[43] = new CardBJImpl("Дама Пики", 10);

        cardBJS[44] = new CardBJImpl("Король Трефа", 10);
        cardBJS[45] = new CardBJImpl("Король Черви", 10);
        cardBJS[46] = new CardBJImpl("Король Бубны", 10);
        cardBJS[47] = new CardBJImpl("Король Пики", 10);

        cardBJS[48] = new CardBJImpl("Туз Трефа", 11);
        cardBJS[49] = new CardBJImpl("Туз Черви", 11);
        cardBJS[50] = new CardBJImpl("Туз Бубны", 11);
        cardBJS[51] = new CardBJImpl("Туз Пики", 11);
    }

    @Override
    public CardBJ getRandomCard() {
        int randomIndex = ThreadLocalRandom.current().nextInt(0,51);
        return cardBJS[randomIndex];
    }
}
