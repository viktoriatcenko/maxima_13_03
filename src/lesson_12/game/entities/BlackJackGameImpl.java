package lesson_12.game.entities;

import lesson_12.game.interfaces.BlackJackGame;
import lesson_12.game.interfaces.DeckOfCards;
import lesson_12.game.interfaces.Player;

public class BlackJackGameImpl implements BlackJackGame {
    Player [] playersInGame = new Player[3];
    DeckOfCards deckOfCards = new DeckOfCardsImpl();

    @Override
    public void addPlayerInGame(Player player) {
        for (int i = 0; i < playersInGame.length; i++) {
            if (playersInGame[i] == null) {
                playersInGame[i] = player;
                break;
            }
        }
    }

    @Override
    public void giveTwoCardsToEachPlayerOnStart() {
        for (Player player : playersInGame) {
            if (player != null) {
                player.takeCard(deckOfCards.getRandomCard());
                player.takeCard(deckOfCards.getRandomCard());
            }
        }
    }

    @Override
    public void giveCardIfNeedToPlayer() {
        for (Player player : playersInGame) {
            if (player != null) {
                while (player.needCard()) {
                    player.takeCard(deckOfCards.getRandomCard());
                }
            }
        }
    }

    @Override
    public void printWinner() {
        // Отсечь всех игроков, у которых на руках уже больше 21
        for (Player player : playersInGame) {
            if (player != null) {
                if (player.countValuesAllCardsOnHand() > 21) {
                    player.setInGame(false);
                }
            }
        }

        if (countAllPlayersInGame() == 0) {
            System.out.println("Победила игра!");
        }

        if (countAllPlayersInGame() == 1) {
            System.out.println("У нас есть один победитель!");
            for (Player player : playersInGame) {
                if (player != null && player.isInGame()) {
                    player.showCardsOnHand();
                    System.out.println("Выиграл игрок с " + player.countValuesAllCardsOnHand()
                            + " очков на руках");
                    return;
                }
            }
        }

        int bestValue = 0;

        if (countAllPlayersInGame() > 1) {
            for (Player player : playersInGame) {
                if (player != null && bestValue < player.countValuesAllCardsOnHand()) {
                    bestValue = player.countValuesAllCardsOnHand();
                }
            }
        }

        String nameOfWinner = "";

        for (Player player : playersInGame) {
            if (player != null && player.countValuesAllCardsOnHand() == bestValue && !player.isCroupier() && !nameOfWinner.startsWith("Winner is")){
                System.out.println("Выиграл игрок с такими картами на руках и с таким " +
                        "кол-вом очков: ");
                player.showCardsOnHand();
                System.out.println(player.countValuesAllCardsOnHand());
                nameOfWinner = "Winner is not Croupier";
            } else if (player != null && player.countValuesAllCardsOnHand() == bestValue && player.isCroupier()) {
                System.out.println("Выиграло казино и крупье с такими картами на руках и с таким " +
                        "кол-вом очков: ");
                player.showCardsOnHand();
                System.out.println(player.countValuesAllCardsOnHand());
            }
        }




    }

    @Override
    public int countAllPlayersInGame() {
        int countOfPlayers = 0;
        for (Player player : playersInGame) {
            if (player != null && player.isInGame()) {
                countOfPlayers++;
            }
        }
        return countOfPlayers;
    }
}
