package lesson_12.game;

import lesson_12.game.entities.BlackJackGameImpl;
import lesson_12.game.entities.Croupier;
import lesson_12.game.entities.DeckOfCardsImpl;
import lesson_12.game.entities.PlayerImpl;
import lesson_12.game.interfaces.BlackJackGame;
import lesson_12.game.interfaces.DeckOfCards;
import lesson_12.game.interfaces.Player;

public class Main {
    public static void main(String[] args) {
        // 1 - ������� ����
        BlackJackGame game = new BlackJackGameImpl();

        // 2 - ��������� �������
        Player player1 = new PlayerImpl();
        Player player2 = new PlayerImpl();

        // 3 - ��������� ������
        Croupier croupier = new Croupier();

        // 4 - �������� ������� � ������ � ����
        game.addPlayerInGame(player1);
        game.addPlayerInGame(player2);
        game.addPlayerInGame(croupier);


        // 5 - ��������� �� 2 ����� ������� ������ �� ������
        game.giveTwoCardsToEachPlayerOnStart();

        // 6 - ��������� ������� ������ �� 1 �����, ���� ��� ���������
        game.giveCardIfNeedToPlayer();

        // 7 - ���������� ����������
        game.printWinner();

    }
}
