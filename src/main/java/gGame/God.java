package gGame;

import gGame.Healers.Healer;
import gGame.Warriors.Warrior;

public class God extends Hero implements Healer, Warrior {
    @Override
    public void healing(Hero target) {

    }

    @Override
    public void attack(Hero target) {
        System.out.println("Attack from God");

    }
}
