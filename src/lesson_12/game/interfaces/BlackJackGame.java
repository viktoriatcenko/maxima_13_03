package lesson_12.game.interfaces;

public interface BlackJackGame {
    // �������� ������ � ����
    void addPlayerInGame(Player player);

    // ������ ��� ���� �� 2 �����
    void giveTwoCardsToEachPlayer();

    // ������ �������������� �����, ���� �����
    void giveCardIfNeedToPlayer();

    // ���������� � ����������� ����������
    void printWinner();



}
