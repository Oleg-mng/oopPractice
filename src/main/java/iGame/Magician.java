package iGame;

public class Magician extends BaseHero {
    private int mana;
    private int maxMana;

    public Magician() {
//        super.name = "L";
        super(String.format("Hero_Magician %d", number++), BaseHero.r.nextInt(100, 200));
        this.maxMana = BaseHero.r.nextInt(50,150);
        this.mana = maxMana;
    }

    public int attack() {
        int damage = BaseHero.r.nextInt(20, 30);
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
