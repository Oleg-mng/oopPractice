package aGame;

import java.util.Random;

public abstract class BaseHero {
    protected static int number;
    protected static Random r;

    protected String name;
    protected int hp;
    protected int maxHp;

    static {
        BaseHero.number = 0;
        BaseHero.r = new Random();
    }

    public BaseHero(String name, int hp){
        this.name = name;
        this.hp = hp;
        this.maxHp = maxHp;
    }
    public BaseHero(){
        this(String.format("New Hero %d", ++BaseHero.number),BaseHero.r.nextInt(100,200));
    }

    public String getInfo(){
        return String.format("Name %s  HP: $d  Type: %s", this.name, this.hp, this.getClass().getSimpleName());
    }

    protected void healed(int Hp){
        this.hp = Hp + this.hp > this.maxHp ? this.maxHp:Hp + this.hp;
    }

    protected void getDamage(int damage){
        if ((this.hp - damage) > 0) {
            this.hp -=damage;
        }
        else {
            die();
        }
    }

    public abstract void die();
}
