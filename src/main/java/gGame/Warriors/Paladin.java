package gGame.Warriors;

import gGame.Hero;

public class Paladin extends Hero implements Warrior {
    public static void main(String[] args) {
        System.out.println("Made Paladin");
    }
    @Override
    public void attack(Hero target) {
        System.out.println("Attack from Paladin");

    }
}
