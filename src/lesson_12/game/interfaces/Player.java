package lesson_12.game.interfaces;

public interface Player {
    // Взять карту из колоды
    void takeCard(CardBJ cardBJ);

    // Посчитать сумму карт на руке
    int countValuesAllCardsOnHand();

    // Ответит нужна ли дополнительная карта
    boolean needCard();

    // Выводить карты на руках
    void showCardsOnHand();

    boolean isInGame();

    void setInGame(boolean inGame);

    boolean isCroupier();
}
