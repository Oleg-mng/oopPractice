package iGame;

import java.util.Random;

public class Priest extends BaseHero{
    private int elixir;
    private int maxElixir;
    static {
        Priest.number = 0;
        Priest.r = new Random();
    }

    public Priest() {
        super(String.format("Hero_Priest %d", Priest.number++), Priest.r.nextInt(100, 200));
        this.maxElixir = Magician.r.nextInt(300, 999);
        this.elixir = maxElixir;
    }
    public String getInfo(){
        return String.format("%s   mana: %d", super.getInfo(), this.elixir);
    }
}
