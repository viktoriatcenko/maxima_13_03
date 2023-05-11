package lesson_12.game.entities;

import lesson_12.game.interfaces.CardBJ;
import lesson_12.game.interfaces.Player;

import java.util.Scanner;

public class PlayerImpl implements Player {
    CardBJ [] cardsOHand = new CardBJ[10];
    private boolean inGame = true;

    @Override
    public void takeCard(CardBJ cardBJ) {
        for (int i = 0; i < cardsOHand.length; i++) {
            if (cardsOHand[i] == null) {
                cardsOHand[i] = cardBJ;
                break;
            }
        }
    }

    @Override
    public int countValuesAllCardsOnHand() {
        int result = 0;
        for (CardBJ c :cardsOHand) {
            if (c != null) {
                result += c.getValue();
            }
        }
        return result;
    }

    @Override
    public boolean needCard() {
        System.out.println("-----------------���� �����----------------------");
        this.showCardsOnHand();
        System.out.println("� ��� �� ����� ������ ������� �����: ");
        System.out.println(this.countValuesAllCardsOnHand());
        System.out.println("����� �� ��� ��� �����?");
        System.out.println("���� ����� ������� ��, ���� ���, ������ ������� Enter");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("��")) {
            return true;
        }
        return false;
    }

    @Override
    public void showCardsOnHand() {
        for (CardBJ c :cardsOHand) {
            if (c != null) {
                c.printCard();
            }
        }
    }

    @Override
    public boolean isInGame() {
        return inGame;
    }

    @Override
    public void setInGame(boolean inGame) {
        this.inGame = inGame;
    }

    @Override
    public boolean isCroupier() {
        return false;
    }
}
