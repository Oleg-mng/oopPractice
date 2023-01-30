package DowncastUpcastEx;

public abstract class BaseHero {
    protected String name;
    protected int hp;

    public BaseHero(String name, int hp){
        System.out.println("Вызван BaseHero (String name, int hp)");

    }
    public BaseHero(){
//        this(name:"", hp:0);
        this.name = "";
        this.hp = 0;
        System.out.println("Вызван BaseHero()");
    }
}
