package iGame;

public class Program {
    public static void main(String[] args) {
        BaseHero hero1 = new Magician();
        System.out.println(hero1.getInfo());
        BaseHero hero2 = new Priest();
        System.out.println(hero2.getInfo());
        hero2.getDamage(hero1.attack());
        System.out.println("После атаки");
        System.out.println(hero1.getInfo());
        System.out.println(hero2.getInfo());
    }

}
