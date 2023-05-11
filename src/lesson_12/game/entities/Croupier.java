package lesson_12.game.entities;


public class Croupier extends PlayerImpl {
    @Override
    public boolean needCard() {
        if (countValuesAllCardsOnHand() >= 17) {
            return false;
        }
        return true;
    }

    @Override
    public boolean isCroupier() {
        return true;
    }
}
