package lesson_12.game.entities;

import lesson_12.game.interfaces.CardBJ;
import lesson_12.game.interfaces.Player;

public class PlayerImpl implements Player {
    CardBJ [] cardsOHand = new CardBJ[10];

    @Override
    public void takeCard(CardBJ cardBJ) {
        for (CardBJ c : cardsOHand) {
            if (c == null) {
                c = cardBJ;
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
}
