package DowncastUpcastEx;

public class Program {
    public static void main(String[] args) {
        System.out.println("\n Dwarf dw1 = new Dwarf()");
        Dwarf dw1 = new Dwarf();
        System.out.println(dw1);

        System.out.println("\n Druid dw2 = new Dwarf()");
        Druid dw2 = new Dwarf();
        System.out.println(dw2);

        System.out.println("\n BaseHero dw3 = new Dwarf()");
        BaseHero dw3 = new Dwarf();
        System.out.println(dw3);
    }
}
