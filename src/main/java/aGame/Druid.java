package aGame;

import java.util.Random;

public class Druid extends BaseHero {
    private int harmony;
    private int maxHarmony;
    static {
        aGame.Druid.number = 0;
        aGame.Druid.r = new Random();
    }

    public Druid() {
        super(String.format("Hero_Priest %d", aGame.Druid.number++), aGame.Druid.r.nextInt(100, 200));
        this.maxHarmony = Magician.r.nextInt(300, 999);
        this.harmony = maxHarmony;
    }
    public String getInfo(){
        return String.format("%s   mana: %d", super.getInfo(), this.harmony);
    }

    @Override
    public void die() {

    }
}