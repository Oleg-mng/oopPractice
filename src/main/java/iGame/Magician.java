package iGame;

import java.util.Random;

public class Magician extends BaseHero {
    private int mana;
    private int maxMana;
    static {
        Magician.number = 0;
        Magician.r = new Random();
    }

    public Magician() {

        super(String.format("Hero_Magician %d", Magician.number++), Magician.r.nextInt(100, 200));
        this.maxMana = Magician.r.nextInt(150, 300);
        this.mana = maxMana;
    }

    public int attack() {
        int damage = Magician.r.nextInt(20, 40);
        this.mana -= damage * 0.8;
        if (mana < 0) {
            return 0;
        } else {
            return damage;
        }
    }
    public String getInfo() {
        return String.format("%s   mana: %d", super.getInfo(), this.mana);
    }


}
