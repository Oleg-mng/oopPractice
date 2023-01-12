package iGame;

public class Priest extends BaseHero{
    private int elixir;
    private int maxElixir;

    public Priest() {
        super(String.format("Hero_Priest #%d", Priest.number++));
        this.maxElixir = Priest.r.nextInt(100, 200);
        this.elixir = maxElixir;
    }
    public String getInfo(){
        return String.format("mana: %d", super.getInfo(), this.elixir);
    }
}
