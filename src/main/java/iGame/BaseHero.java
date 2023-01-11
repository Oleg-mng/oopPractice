package iGame;

import java.util.Random;

public class BaseHero {
    protected int number;
    protected static Random r;

    protected String name;
    protected int hp;
    protected int Maxhp;

    public BaseHero(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }
    public BaseHero() {
        this.name = "Lord";
        this.hp = 1;
    }
    public String getInfo(){
        return String.format("name: %s   hp: %d   type: %s", name, hp, getClass().getSimpleName());

    }
    public void healed(int Hp){

    }
    public void getDamage(int damage){

    }
}
