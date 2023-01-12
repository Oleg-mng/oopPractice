package iGame;

public class Program {
    public static void main(String[] args) {
        Magician hero1 = new Magician("magicGold", 777);
        System.out.println(hero1.getInfo());
        Priest hero2 = new Priest();
        System.out.println(hero2.getInfo());
        hero2.getDamage(hero1.attack());
    }

}
