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
        // 1 - Создать игру
        BlackJackGame game = new BlackJackGameImpl();

        // 2 - Создавать игроков
        Player player1 = new PlayerImpl();
        Player player2 = new PlayerImpl();

        // 3 - Создавать крупье
        Croupier croupier = new Croupier();

        // 4 - Добавить игроков и крупье в игру
        game.addPlayerInGame(player1);
        game.addPlayerInGame(player2);
        game.addPlayerInGame(croupier);


        // 5 - Раздавать по 2 карты каждому игроку на старте
        game.giveTwoCardsToEachPlayerOnStart();

        // 6 - Раздавать каждому игроку по 1 карте, пока ему требуется
        game.giveCardIfNeedToPlayer();

        // 7 - Определить победителя
        game.printWinner();

    }
}
