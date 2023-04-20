package lesson_12.game.entities;

import lesson_12.game.interfaces.CardBJ;

public class CardBJImpl implements CardBJ {
    private int value;
    private String nameOfCard;

    public CardBJImpl(String nameOfCard, int value) {
        this.nameOfCard = nameOfCard;
        this.value = value;
    }

    @Override
    public void printCard() {
        System.out.println(nameOfCard);
    }

    @Override
    public int getValue() {
        return value;
    }
}
