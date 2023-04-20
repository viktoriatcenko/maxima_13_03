package lesson_12.game.entities;

import lesson_12.game.interfaces.CardBJ;
import lesson_12.game.interfaces.DeckOfCards;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class DeckOfCardsImpl implements DeckOfCards {
    CardBJ[] cardBJS = new CardBJ[52];

    public DeckOfCardsImpl() {
        cardBJS[0] = new CardBJImpl("������ ����", 2);
        cardBJS[1] = new CardBJImpl("������ �����", 2);
        cardBJS[2] = new CardBJImpl("������ ����", 2);
        cardBJS[3] = new CardBJImpl("������ ����",2);

        cardBJS[4] = new CardBJImpl("������ �����", 3);
        cardBJS[5] = new CardBJImpl("������ �����", 3);
        cardBJS[6] = new CardBJImpl("������ �����", 3);
        cardBJS[7] = new CardBJImpl("������ ����", 3);

        cardBJS[8] = new CardBJImpl("�������� �����", 4);
        cardBJS[9] = new CardBJImpl("�������� �����", 4);
        cardBJS[10] = new CardBJImpl("�������� �����", 4);
        cardBJS[11] = new CardBJImpl("�������� ����", 4);

        cardBJS[12] = new CardBJImpl("������� �����", 5);
        cardBJS[13] = new CardBJImpl("������� �����", 5);
        cardBJS[14] = new CardBJImpl("������� �����", 5);
        cardBJS[15] = new CardBJImpl("������� ����", 5);

        cardBJS[16] = new CardBJImpl("�������� �����", 6);
        cardBJS[17] = new CardBJImpl("�������� �����", 6);
        cardBJS[18] = new CardBJImpl("�������� �����", 6);
        cardBJS[19] = new CardBJImpl("�������� ����", 6);

        cardBJS[20] = new CardBJImpl("������� �����", 7);
        cardBJS[21] = new CardBJImpl("������� �����", 7);
        cardBJS[22] = new CardBJImpl("������� �����", 7);
        cardBJS[23] = new CardBJImpl("������� ����", 7);

        cardBJS[24] = new CardBJImpl("��������� �����", 8);
        cardBJS[25] = new CardBJImpl("��������� �����", 8);
        cardBJS[26] = new CardBJImpl("��������� �����", 8);
        cardBJS[27] = new CardBJImpl("��������� ����", 8);

        cardBJS[28] = new CardBJImpl("������� �����", 9);
        cardBJS[29] = new CardBJImpl("������� �����", 9);
        cardBJS[30] = new CardBJImpl("������� �����", 9);
        cardBJS[31] = new CardBJImpl("������� ����", 9);

        cardBJS[32] = new CardBJImpl("������� �����", 10);
        cardBJS[33] = new CardBJImpl("������� �����", 10);
        cardBJS[34] = new CardBJImpl("������� �����", 10);
        cardBJS[35] = new CardBJImpl("������� ����", 10);

        cardBJS[36] = new CardBJImpl("����� �����", 10);
        cardBJS[37] = new CardBJImpl("����� �����", 10);
        cardBJS[38] = new CardBJImpl("����� �����", 10);
        cardBJS[39] = new CardBJImpl("����� ����", 10);

        cardBJS[40] = new CardBJImpl("���� �����", 10);
        cardBJS[41] = new CardBJImpl("���� �����", 10);
        cardBJS[42] = new CardBJImpl("���� �����", 10);
        cardBJS[43] = new CardBJImpl("���� ����", 10);

        cardBJS[44] = new CardBJImpl("������ �����", 10);
        cardBJS[45] = new CardBJImpl("������ �����", 10);
        cardBJS[46] = new CardBJImpl("������ �����", 10);
        cardBJS[47] = new CardBJImpl("������ ����", 10);

        cardBJS[48] = new CardBJImpl("��� �����", 11);
        cardBJS[49] = new CardBJImpl("��� �����", 11);
        cardBJS[50] = new CardBJImpl("��� �����", 11);
        cardBJS[51] = new CardBJImpl("��� ����", 11);
    }

    @Override
    public CardBJ getRandomCard() {
        int randomIndex = ThreadLocalRandom.current().nextInt(0,51);
        return cardBJS[randomIndex];
    }
}
