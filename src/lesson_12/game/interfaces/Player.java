package lesson_12.game.interfaces;

public interface Player {
    // ����� ����� �� ������
    void takeCard(CardBJ cardBJ);

    // ��������� ����� ���� �� ����
    int countValuesAllCardsOnHand();

    // ������� ����� �� �������������� �����
    boolean needCard();

    // �������� ����� �� �����
    void showCardsOnHand();

    boolean isInGame();

    void setInGame(boolean inGame);

    boolean isCroupier();
}
