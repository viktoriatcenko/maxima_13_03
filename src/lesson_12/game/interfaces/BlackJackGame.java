package lesson_12.game.interfaces;

public interface BlackJackGame {
    // Добавить игрока в игру
    void addPlayerInGame(Player player);

    // Выдать нам всем по 2 карты
    void giveTwoCardsToEachPlayer();

    // Выдать дополнительной карте, если нужна
    void giveCardIfNeedToPlayer();

    // Определить и распечатать победителя
    void printWinner();



}
